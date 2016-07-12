<?php
define('IN_AJAX', TRUE);


if (!defined('IN_ANWSION'))
{
	die;
}

class ajax extends AWS_CONTROLLER
{
	public function get_access_rule()
	{
		$rule_action['rule_type'] = 'white';

		if ($this->user_info['permission']['search_avail'])
		{
			$rule_action['rule_type'] = 'black'; //'black'黑名单,黑名单中的检查  'white'白名单,白名单以外的检查
		}

		$rule_action['actions'] = array();

		return $rule_action;
	}

	public function setup()
	{
		HTTP::no_cache_header();
	}

	public function search_result_action()
	{
		if (!in_array($_GET['search_type'], array('questions', 'topics', 'users', 'articles')))
		{
			$_GET['search_type'] = null;
		}

		$search_result = $this->model('search')->search(cjk_substr($_GET['q'], 0, 64), $_GET['search_type'], $_GET['page'], get_setting('contents_per_page'), null, $_GET['is_recommend']);

		if ($this->user_id AND $search_result)
		{
			foreach ($search_result AS $key => $val)
			{
				switch ($val['type'])
				{
					case 'questions':
						$search_result[$key]['focus'] = $this->model('question')->has_focus_question($val['search_id'], $this->user_id);

						break;

					case 'topics':
						$search_result[$key]['focus'] = $this->model('topic')->has_focus_topic($this->user_id, $val['search_id']);

						break;

					case 'users':
						$search_result[$key]['focus'] = $this->model('follow')->user_follow_check($this->user_id, $val['search_id']);

						break;
				}
			}
		}

		// ZYJ修改 start 2015-11-25 14:59
		// $search_xun 从索引库中查询到的数据
		// $search_db  根据$search_xun从数据库中查询到的真实数据
		// 增加 设定搜索标记
		if (!$_GET['search_type']) {
			$flag = 1;
		}

		if ($_GET['search_type'] == 'articles' OR $flag == 1) {
			// 增加 文章搜索
			$xs = new XS('wiki-article');
			$i = 0;
			// 增加 搜索内容 搜索条件 偏移量
			$search_xun = $xs->search->setLimit(10, ($_GET['page'] - 1) * 10)->search(cjk_substr($_GET['q'], 0, 64));
			// 统计上一次搜索总条数 文章总数
			$count = $xs->search->getLastCount();
			// 文章总数
			$article_final_count = $count;
			foreach ($search_xun as $key => $val) {
				$tmp = $this->model()->fetch_row("article", "id = ".$search_xun[$key]->id);
				// 如果不存在真实数据库 continue
				if (!$tmp) {
					continue;
				}
				$search_db[$i]['type'] = 'articles';
				$search_db[$i]['url'] = 'http://wiki.joywell.com.cn/?/article/'.$tmp['id'];
				$search_db[$i]['search_id'] = $tmp['id'];
				$search_db[$i]['name'] = $tmp['title'];
				$search_db[$i]['detail']['comments'] = $tmp['comments'];
				$search_db[$i]['detail']['views'] = $tmp['views'];
				$i++;
			}
		}

		// 当前页文章个数
		$article_count = $i;

		if ($_GET['search_type'] == 'questions' OR $flag == 1) {
			if ($article_count < 10){
				// 增加 问题搜索
				$xs = new XS('wiki-question');
				$i = 0 + $article_count;
				// 增加 搜索内容 搜索条件 偏移量
				if ($article_count == 0) {
					$offset = 10 * ($_GET['page'] - 1) - $article_final_count;
				} else {
					$offset = 0;
				}
				$search_xun = $xs->search->setLimit((10 - $article_count), $offset)->search(cjk_substr($_GET['q'], 0, 64));
				// 统计上一次搜索总条数 问题总数
				$count += $xs->search->getLastCount();
				// 问题总数
				$question_final_count = $xs->search->getLastCount();
				foreach ($search_xun as $key => $val) {
					$tmp = $this->model()->fetch_row("question", "question_id = ".$search_xun[$key]->question_id);
					// 如果不存在真实数据库 continue
					if (!$tmp) {
						continue;
					}
					$search_db[$i]['type'] = 'questions';
					$search_db[$i]['url'] = 'http://wiki.joywell.com.cn/?/question/'.$tmp['question_id'];
					$search_db[$i]['search_id'] = $tmp['question_id'];
					$search_db[$i]['name'] = $tmp['question_content'];
					$search_db[$i]['detail']['best_answer'] = $tmp['best_answer'];
					$search_db[$i]['detail']['answer_count'] = $tmp['answer_count'];
					$search_db[$i]['detail']['comment_count'] = $tmp['comment_count'];
					$search_db[$i]['detail']['focus_count'] = $tmp['focus_count'];
					$search_db[$i]['detail']['agree_count'] = $tmp['agree_count'];
					$i++;
				}
			}
		}
		// 当前页的问题个数
		$question_count = $i;

		if ($_GET['search_type'] == 'topics' OR $flag == 1) {
			if ($question_count < 10){
				// 增加 话题搜索
				$xs = new XS('wiki-topic');
				$i = 0 + $question_count + $article_count;
				// 增加 搜索内容 搜索条件 偏移量
				if ($question_count == 0) {
					$offset = 10 * ($_GET['page'] - 1) - $question_final_count - $article_final_count;
				} else {
					$offset = 0;
				}
				$search_xun = $xs->search->setLimit((10 - $question_count - $article_count), $offset)->search(cjk_substr($_GET['q'], 0, 64));
				// 统计上一次搜索总条数 话题总数
				$count += $xs->search->getLastCount();
				// 话题总数
				$topic_final_count = $xs->search->getLastCount();
				foreach ($search_xun as $key => $val) {
					$tmp = $this->model()->fetch_row("topic", "topic_id = ".$search_xun[$key]->topic_id);
					// 如果不存在真实数据库 continue
					if (!$tmp) {
						continue;
					}
					$search_db[$i]['type'] = 'topics';
					$search_db[$i]['url'] = 'http://wiki.joywell.com.cn/?/topic/'.$tmp['topic_title'];
					$search_db[$i]['search_id'] = $tmp['topic_id'];
					$search_db[$i]['name'] = $tmp['topic_title'];
					if ($tmp['topic_pic']) {
						$search_db[$i]['detail']['topic_pic'] = 'http://wiki.joywell.com.cn/uploads/topic/'.explode('_', $tmp['topic_pic'])[0].'_50_50.jpg';
					}else{
						$search_db[$i]['detail']['topic_pic'] = 'http://wiki.joywell.com.cn/static/common/topic-mid-img.png';
					}
					$search_db[$i]['detail']['topic_id'] = $tmp['topic_id'];
					$search_db[$i]['detail']['focus_count'] = $tmp['focus_count'];
					$search_db[$i]['detail']['discuss_count'] = $tmp['discuss_count'];
					$search_db[$i]['detail']['is_parent'] = $tmp['is_parent'];
					$search_db[$i]['detail']['parent_id'] = $tmp['parent_id'];
					$i++;
				}
			}
		}
		// 当前页的话题总数
		$topic_count = $i;

		if ($_GET['search_type'] == 'users' OR $flag == 1) {
			if ($topic_count < 10) {
				// 增加 用户搜索
				$xs = new XS('wiki-user');
				$i = 0 + $topic_count + $question_count + $article_count;
				// 增加 搜索内容 搜索条件 偏移量
				if ($topic_count == 0) {
					$offset = 10 * ($_GET['page'] - 1) - $topic_final_count - $question_final_count - $article_final_count;
				} else {
					$offset = 0;
				}
				// 增加 搜索内容 搜索条件 偏移量
				$search_xun = $xs->search->setLimit((10 - $topic_count - $question_count - $article_count), $offset)->search(cjk_substr($_GET['q'], 0, 64));
				// 统计上一次搜索总条数 用户总数
				$count += $xs->search->getLastCount();
				// 用户总数
				$user_final_count = $xs->search->getLastCount();
				foreach ($search_xun as $key => $val) {
					$tmp = $this->model()->fetch_row("users", "uid = ".$search_xun[$key]->uid);
					// 未验证用户、封禁用户不被搜索到
					if ($tmp['group_id'] == 3 OR $tmp['forbidden'] == 1){
						continue;
					}
					// 如果不存在真实数据库 continue
					if (!$tmp) {
						continue;
					}
					$search_db[$i]['uid'] = $tmp['uid'];
					$search_db[$i]['type'] = 'users';
					$search_db[$i]['url'] = 'http://wiki.joywell.com.cn/?/people/'.$tmp['user_name'];
					$search_db[$i]['search_id'] = $tmp['uid'];
					$search_db[$i]['name'] = $tmp['user_name'];
					if ($tmp['avatar_file']) {
						$search_db[$i]['detail']['avatar_file'] = 'http://wiki.joywell.com.cn/uploads/avatar/'.explode('_', $tmp['avatar_file'])[0].'_avatar_mid.jpg';
					}else{
						$search_db[$i]['detail']['avatar_file'] = 'http://wiki.joywell.com.cn/static/common/avatar-mid-img.png';
					}
					$search_db[$i]['detail']['signature'] = $tmp['signature'];
					$search_db[$i]['detail']['reputation'] = $tmp['reputation'];
					$search_db[$i]['detail']['agree_count'] = $tmp['agree_count'];
					$search_db[$i]['detail']['thanks_count'] = $tmp['thanks_count'];
					$search_db[$i]['detail']['fans_count'] = $tmp['fans_count'];
					$i++;
				}
			}
		}
		$user_count = $i;

		// 修改输出数据
		TPL::assign('search_result', $search_db);
		// end

		if (is_mobile())
		{
			TPL::output('m/ajax/search_result');
		}
		else
		{
			TPL::output('search/ajax/search_result');
		}
	}

	public function search_action()
	{
		$result = $this->model('search')->search(cjk_substr($_GET['q'], 0, 64), $_GET['type'], 1, $_GET['limit'], $_GET['topic_ids'], $_GET['is_recommend']);

		if (!$result)
		{
			$result = array();
		}

		if ($_GET['is_question_id'] AND is_digits($_GET['q']))
		{
			$question_info = $this->model('question')->get_question_info_by_id($_GET['q']);

			if ($question_info)
			{
				$result[] = $this->model('search')->prase_result_info($question_info);
			}
		}

		H::ajax_json_output($result);
	}
}