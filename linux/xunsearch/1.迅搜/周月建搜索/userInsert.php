$xs = new XS('wiki-user');
$doc_xun = new XSDocument;
$index = $xs->index;
$data_xun = array(
    'uid' => $uid,
    'user_name' => $_POST['user_name'],
);
$doc_xun->setFields($data_xun);
$index->add($doc_xun);