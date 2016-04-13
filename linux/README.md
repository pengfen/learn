运维

第一阶段 linux 操作系统管理入门到精通
第二阶段 linux 常见服务管理入门到精通
第三阶段 linux 自动化 (shell脚本)
第四阶段 linux 资深知识 (系统安全 集群 存储 调优)
第五阶段 linux 桌面级虚拟化

第一阶段 linux 操作系统管理入门到精通
===========================================================
1) Unix/Linux 系统介绍
   linux 介绍 掌握更有效的  linux 学习方法  (参考 basic/linux-basic.html)
   vmware 10 安装及 12 种使用技巧 (参考 vm/vm/)
2) Linux 基本命令
   linux 终端介绍  shell 提示符  Bash Shell 基本语法  基本命令的使用 ls pwd cd  linux 如何获取帮助  linux 关机命令  shutdown halt  linux 7个启动级别  创建一个便捷的实验环境快照
3) linux 系统基本文件管理
   linux 系统目录结构  相对/绝对路径  创建/复制/删除文件 rm -rf / 意外事故  查看文件内容  LVM 的原理  创建逻辑卷  扩展缩小逻辑卷  LVMSnapShot  LVM 数据迁移  磁盘配额技术
4) 计划任务和日志管理
   at 定制单次执行的计划任务  crontab 定制周期性任务  日志的重要性  linux 日志记录机制  /var/log 下常见日志文件  rsyslog 程序  logroate 日志轮转  集中日志管理技术
5) 内核升级和设备驱动管理
   内核的作用  获得最新内容  内核版本介绍  升级到较新的内核  RHEL5 升级支持 XEN 内核  增加内核模块  管理硬件驱动
6) 系统启动及故障排除
   upstart 启动过程详解  影响启动的配置文件  常见的启动故障排除  GRUB 补排除  备份 MBR  救援模式的使用  Live CD 的使用
7) 网络管理
   linux 网卡  网络相关的配置文件  network manager 使用命令实现临时的网络配置  修改文件实现永久的网络配置  常见的网络测试命令  wireshark  tshark  tcpdum

第二阶段 linux 常见服务管理入门到精通
===========================================================
1) SSHD  服务
   常见 ssh 连接工具  SSHD 服务基本配置   SSHD 实现公钥论证  scp rsync sftp  远程管理中 screen 使用方法
2) DHCP  服务
   DHCP 协议的作用及原理  配置 DHCP 服务器分配地址  DHCP 常见的配置选项
3) NTP   服务
   时间同步的重要性  搭建 NTP 服务器  NTP 客户端同步
4) FTP   服务
   FTP 主动 被动模式  FTP 服务器搭建  实现匿名用户上传文件
5) NFS   服务
   NFSv3/NFSv4 版区别  NFS 服务器实现只读共享  NFS 服务器实现读写共享  基于主机的访问控制
6) Samba 服务
   Samba 服务器的搭建  基于用户的访问控制  基于主机的访问控制
7) DNS   服务
   DNS 服务的作用  DNS 体系结构  DNS 实现正身区域解析  BIND 实现反向区域解析  搭建主从 DNS 服务
8) Apache web 服务
   网页解析原理  常见 web 服务器  Apache 服务器配置文件详解  使用 Apache 搭建 web 服务器  使用虚拟主机搭建多个站点  基于用户和主机的访问控制  SSL 封装安装实现  LAMP 应用环境部署
9) Postfix 邮件服务
   邮件服务器工作原理  MTA MDA MRA MUA  Postfix 基本配置  实现 POP3 收取邮件  邮件客户端基本使用  协议命令 SMTP/POP3
10) iptables
    iptables 流程图  iptables 四张表五条链  iptables 语法结构  iptables 实现数据包过滤  iptables NAT 技术
11) sqwid 服务
    代理服务器介绍  搭建内网代理服务器  搭建透明代理服务器
12) mysql 服务
    关系型数据库 MySQL 简介  MySQL 安装  MySQL SQL 语句  MySQL 库和表的使用  MySQL 安全配置  MySQL 的备份和迁移  MySQL 双机主从复制配置及使用  MySQL 集群搭建  MySQL Proxy 项目  MySQL 日常监控运维
13) LAMP 搭建  搭建企业级高负载 web 服务器架构 LAMP  添加 Apache 企业使用模块  Apache 企业级安全防护措施
14) LNMP 搭建  搭建企业级高负载 web 服务器架构 LNMP  Nginx 企业级安全防护措施  Nginx 应用服务全面实施
15) Apache 整合 Tomcat  Apache 结合 Tomcat 搭建企业级高性能 web 服务器
16) Nginx  整合 Tomcat  Nginx  结合 Tomcat 搭建企业级高性能 web 服务器 
17) webmail  搭建企业级邮件服务器 webmail  垃圾邮件过滤  邮件虚拟用户与虚拟
18) CDN 服务器搭建  企业级 CDN 服务器搭建  Sqwid  NginxProxy_cache  vamish  DNS view 结合
19) LDAP 企业级集中化用户认证服务搭建  LDAP 用户论证及权限控制
20) Puppet 企业级运维自动化部署及管理服务搭建
21) Nagios 企业级监控告警服务搭建
22) Cacti 企业级流量监控分析服务
23) Zabbix 企业级系统监控及网络监控
24) Splunk 企业级日志分析服务搭建
25) SVN 搭建软件版本控制服务器
26) Git 搭建软件版本控制服务器
27) Rsync 备份及时步服务器搭建


第三阶段 linux 自动化 (shell脚本)
===========================================================
1) Bash Shell 基础
   shell 的作用  shell 高级命令  shell 变量  Bash shell 配置文件  Bash shell 脚本简介  if for  sek编程  awk编程
2) Shell 自动化脚本管理服务
   脚本编程历史及常见脚本编程特点  脚本编程基本知识  Bash Shell 脚本基本语法  Bash Shell 基本变量及使用  Bash Shell 常用命令及其参数  Bash Shell 高级应用  Bash Shell 调试及排除  正则表达式在脚本编程中的使用  sed 文本操作复杂编程  awk 复杂数据处理编程  python 脚本语言介绍  shell 脚本实战

第四阶段 linux 资深知识 (系统安全 集群 存储 调优)
===========================================================
1) linux 系统安全
   安全概念  系统安全级别分类  linux 系统用户安全相关配置及管理  linux 系统启动流程涉及的安全事项  linux 服务相关安全  linux 网络相关安全  linux 防火墙系统及动态防火墙技术  linux 常见攻击种类及分析  DDOS 分析及脚本防洪演示  web 脚本漏洞攻击  SQL 注入漏洞分析  ARP 攻击  暴力破解  缓冲区溢出攻击  常见防御方法  IDS 入侵检测系统搭建  日志服务  远程日志服务  使用 SELinux 加强 linux 安全性
2) linux 系统调优
   系统调优概念及常用评测方法  linux 内核子系统调优及实战  linux cpu 子系统调优及实战  linux 虚拟内存子系统调优及实战  linux 存储 I/O 子系统调优及实战  linux 网络子系统调优及实战  linux cgroup 调优及实战  企业系统调优工具讲解和实战
3) linux 存储技术
   常见存储技术及企业级存储设备讲解  linux 系统存储分层结构分析  linux 系统映射设备及磁带设备讲解  SAN 存储  NAS 存储技术及设备讲解  ISCSI 存储技术讲解及实战  FC-SAN 存储技术讲解及实战  企业级多路径冗余技术  共享存储及共享文件系统技术  基于 GFS2 文件系统的集中化存储搭建  分布式存储及云存储系统介绍
4) linux 集群部署
   集群概念及企业使用场景介绍  高可用集群概念  RedHat cluster suite 高可用环境实战  基于高可用环境下的 LAMP 环境搭建  负载均衡集群概念  搭建 LVS 环境的四层负载均衡集群  基于 keepalive 搭建高可用集群  基于 Haproxy 搭建  七层负载均衡集群  分布式高性能计算集群搭建  基于 Hadoop 环境的分布式计算集群环境搭建

第五阶段 linux 桌面级虚拟化 (参见 vm 目录)
===========================================================
1) linux 虚拟化技术
   常见桌面虚拟化技术分析  桌面虚拟化技术 vmware workstation  桌面虚拟化技术 KVM   常见企业级虚拟化技术  企业级虚拟化 RHEV
2) docker
3) 私有云部署 OpenStack
   OpenStack 社区和总体架构搭建  安装 OpenStack  Keystone 的架构和原理  Glance 的架构和原理  Keystone 和 Glance 的环境搭建讲解  windows 和 linux 模版的构建  Cinder 的架构和原理  讲解 Nova 的原理和使用  讲解 Quantum 的原理和使用  HA 高可用部署  日志和监控  备份和恢复


basic   linux 基础
comment linux 命令
git     git 操作
server  linux 服务
shell   linux 脚本