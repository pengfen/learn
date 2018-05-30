-- 短信模板表
DROP TABLE IF EXISTS `zt_message`;
CREATE TABLE `message` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `DepID` smallint(5) unsigned NOT NULL DEFAULT '0' COMMENT '部门ID，0表示所有的部门',
  `SmsTitle` varchar(20) NOT NULL COMMENT '短信介绍',
  `SmsContent` text NOT NULL COMMENT '短信内容',
  `EditFlag` tinyint(1) NOT NULL COMMENT '是否可编辑,0：不可，1：可',
  `Enable` tinyint(1) NOT NULL COMMENT '是否启用,0：否，1：是',
  `CreateTime` int(11) NOT NULL COMMENT '创建时间',
  `CreateUser` varchar(10) NOT NULL COMMENT '创建者',
  `UpdateTime` int(11) DEFAULT NULL COMMENT '更新时间',
  `UpdateUser` varchar(10) DEFAULT NULL COMMENT '更新者',
  `TID` smallint(5) unsigned NOT NULL DEFAULT '0' COMMENT '小组ID，0表示所有小组',
  `state` tinyint unsigned NOT NULL COMMENT '类型 0非营销类 1营销类'
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COMMENT='短信模块表';


CREATE TABLE `msghistory` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MsgID` int(11) unsigned NOT NULL COMMENT '短信表id',
  `CID` bigint(12) unsigned NOT NULL COMMENT '客户id',
  `SendStatus` tinyint(1) DEFAULT '-1' COMMENT '短信返回状态',
  `Createtime` int(11) unsigned NOT NULL COMMENT '创建时间',
  `CreateUser` varchar(50) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC COMMENT='短信发送客户记录表';