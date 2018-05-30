create table photoreview(
id int unsigned primary key auto_increment,
owner varchar(60) not null default '' comment '拥有者',
sender varchar(60) not null default '' comment '评论者',
content text not null default '' comment '评论内容',
pid int unsigned not null default 0 comment '照片id',
rid int unsigned not null default 0 comment '相册id'
)engine=myisam default charset=utf8;
