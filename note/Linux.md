# 常用指令
###### mv ：移动文件，文件更名
> 多个文件移动到目录：mv a.txt b.txt c.txt /home/ 格式：mv [文件1]空格[文件2]。。 [指定目录]
> 
# 文件权限与目录配置
##### 文件的身份有三种，相应的权限也有三种：
> 身份：owner，group，other

> 权限：read-4分 , write-2分 ,execute-1分
##### 相应的文件位置
> 账号记录在：/etc/passwd

> 密码记录在：/etc/shadow

> 群组记录在：/etc/group
##### 常用指令, 属性[-R] 表示递归
> 修改文件所属群组：chgrp 群组名 文件

> 修改文件拥有者：chown 新用户名 文件

> 修改文件的权限：chmod 777 文件 或者 chmod [u,g,o,a] [+,-,=] [r,w,x],比如：chmod u=r,go=wx file

> 复制文件：cp src_file dest_file

##### 目录和文件的权限意义
* 文件的权限都是针对： 文件的内容
> read，可以看文件的内容
>
> write，可以修改，删除文件的内容
> 
> execute，该文件可以被系统执行
* 目录的权限都是针对：目录下的文件
> read，可以看该目录下所有文件名
> 
> write，可以新增，删除文件，文件更名，移动文件位置
> 
> execute，能否进入该目录，尽管没有x权限，有r依旧能看该目录有哪些文件，ls -al 只会显示文件名，其余都是？
> 
> 
> 








# 文件与文件系统的压缩，打包和备份
* 1字节Byte = 8位bits
* 常见的压缩文件拓展名，这些程序默认不保留原来的文件
> gzip file 压缩文件
> 
> gunzip file.gz 解压文件
>
> zmore file.gz 查看压缩文件内容
>
> zgrep file.gz 搜索压缩文件内容中的字符串

* 为什么tar打包？是因为有的压缩程序（gz,bz2,xz）只能压缩一个文件，打包就能将多个文件弄成一个，然后压缩
> tar
> 
> 解压：tar -xzvf file.tzr.gz
> 
























###
# BASH
1. 查看可使用的shell，默认是：/bin/bash：
> vim /etc/shells
2. 命令与文件补全功能 [tab]
> [tab]在一串指令的第一个字后，命令补全：c [tab][tab]
> 
> [tab]在一串指令的第二个字后，文件补全：cat ho[tab][tab]
3. 别名：alias
> 查看所有别名：alias

> 设置别名：alias ll=''ls -al'
4. 工作控制，前景背景控制，不怕误使用[Ctrl]+[c] 停掉程序
5. 程序化脚本
6. 万用字符 [*],比如查某个目录下以‘X’开头的文件，下列指令不适用指定字符串结尾：
> ls -l /etc/sys*
7. 指令太长换行输出，\ 与回车间别加空格，否则 \ 表示跳脱的是空格而不是回车：
> mv a.txt b.txt \回车
* 多行指令输错了怎么办？
> 处理光标所在行：[Ctrl]+u,删除光标前的指令，[Ctrl]+k 删除光标后的指令

> 没有多行处理，[Ctrl]+a,光标移到当前行最前面，[Ctrl]+e,光标移到当前行最后

> 终止指令输入：[Ctrl]+c 
8. 变量取用：echo,变量要被读取,会发现多个值之间分隔符是[:]，要在变量前加[$]，取消变量：unset，
> 读取变量：echo $变量名  或者（推荐）：echo ${变量名}
>
> 变量设置,变量值包含空格的，要加引号或 双引号或者 \ ：good=xumingrui
> 
> 为变量扩增内容：myname=${PATH}:liujie 或者 myname="$myname":liujie

> 双引号,特殊字符保留原作用：var="lang is $LANG"，echo var 得出来：lang is zh_TW.UTF-8
>
> 单引号，特殊字符视为一般字符：var='lang is $LANG'，echo var 得出来：lang is $LANG
> 
> 也可以在特殊字符前加 \ 将特殊字符变成一般字符：var='lang is \$LANG'，echo var 得出来：lang is $LANG

> 要让其他程序使用这个变量，需将之变成环境变量：export myname
> 
> 取消变量：unset myname

# vim编辑器
# 系统服务
### systemctl管理服务
> systemctl [command][service]
###### 常用的[command]
* start 启动后面的服务,与之相反：stop
* restart 重启后面的服务
* reload 不关闭服务，重新载入配置文件
* enable 让后面的服务开机启动，与之相反：disable
* status 查看当前服务状态


























