<?php

/**
  * vmware 简介
  *
  * vmware 是一个虚拟 PC 的软件
  * 可以在现有的操作系统上虚拟出一个新的硬件环境
  * 相当于模拟出一台新的 PC
  * 以此来实现在一台机器上真正同时运行两个独立的操作系统
  * 官网 http://www.vmware.com
  *
  * vmware 主要特点
  * 不需要分区或重新开机就能在同一台 PC 上使用两种以上的操作系统
  * 本机系统可以与虚拟机系统网络通信
  * 可以设定并且随时修改虚拟机操作系统的硬件环境
  *
  * 需要配置
  * CPU 建议主频为 1GHz 以上
  * 内存 建议 1GB 以上
  * 硬盘 建议分区空闲空间 8GB 以上
  *
  * 安装虚拟机
  * 启动 vm
  * 创建新的虚拟机
  * 自定义
  * 稍后安装操作系统 (安装完虚拟机再安装操作系统)
  * 下一步
  * 选择 (安装 linux 系统 centos)
  * 选择安装路径 (d:/files/vm)
  * 选择处理器 (以下几步可以在虚拟机网络设置中调)
  * 选择内存
  * 选择网络连接 (桥接 方便 但占用真实机 nat 使用 vm8虚拟网卡与真实机通信 host-only 使用vm1 虚拟网卡与真实机通信并且不能与外部电脑通信)
  * I / O 控制类型 (推荐)
  * 虚拟磁盘类型 (推荐)
  * 创建新的虚拟器
  * 磁盘大小 20 G 选择将虚拟磁盘存储为单个文件
  * 完成
  *
  * 虚拟机安装 linux 
  * CD/DVD 自动检测
  * 浏览 (选择第一个镜像文件)
  *
  * 开启此虚拟机 (不再显示此提示 进入全屏模式)
  * install or upgrade on existing system 安装或升级现在的系统
  *     install system with basic video driver 安装过程采用基本的显卡驱动
  *     rescue installed system 进入系统修复模式
  *     boot from local drive 退出安装从硬盘启动
  *     memory test 存储介质检测
  * 选择 skip (是否检测你的盘里内容 tab 键 方向键 -> 都可以) 下一步
  * 中文简体
  * 基本存储设备
  * 主机名
  * 时区
  * 密码 (学习时使用最简单的密码 无论如何都使用)
  *     密码原则
  *     复杂性
  *         八位字符以上 大小写字母 数字 符号
  *         不能是英文单词
  *         不能是和用户相关的内容
  *     易记忆性
  *     时效性
  * 创建自定义布局
  * 选择创建 ---> 标准分区 ---> /boot(挂载点) 200M
  * 选择创建 ---> 标准分区 ---> swap(文件系统类型) 200M
  * 选择创建 ---> 标准分区 ---> / 使用全部可用空间
  * 在 /dev/sda 中安装引导装载程序
  * 软件包程序选择 basic server
  *     Desktop 桌面
  *     Minimal Desktop 最小化桌面
  *     Minimal 最小化
  *     Basic Server 基本服务器
  *     Database Server 数据库服务器
  *     Web Server 网页服务器
  *     Virtual Host 虚拟主机
  *     software development workstation 软件开发工作站
  * 安装引导程序
  *
  * login: root # 用户名
  * password: 
  * [root@localhost]# 
  *
  * [root@localhost]# ls
  * install.log install.log.syslog anaconda-ks.cfg
  * /root/install.log 存储了安装在系统中的软件包及其版本信息
  * /root/install.log.syslog 存储了安装过程中留下的事件记录
  * /root/anaconda-ks.log 以Kickstart 配置文件的格式记录安装过程中设置的选项信息
  *
  * ls /etc/sysconfig/network-scripts/ifcfg-eth0
  * vim /etc/sysconfig/network-scripts/ifcfg-eth0
  * 修改 ONBOOT = 'yes' (按i将no 改为 yes vim 中强制退出 q! Tab 键补全)
  * 按 esc 键
  * 输入 :wq (esc 键进入编辑模式 : 进入命令模式)
  * 重启 service network restart
  * ifconfig (查看ip 地址)
  * inet addr:192. 
  * 开启 vm (可以通过修改网络适配器 的连接方式 来修改 ip)
  * 启动 putty.exe (第三方登录 linux 系统)
  * 主机名称为 ip 地址
  * 转换 ---> utf8 
  * 会话 ---> 默认设置 ---> 保存
  * 打开
  *
  * linux (三大核心技术)
  * 防火墙配置 内核截切 邮箱服务器
  *
  * 关闭防火墙
  * setup
*/