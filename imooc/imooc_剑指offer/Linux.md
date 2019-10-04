# Linux 

## Linux 的体系结构
- 体系结构主要分为 用户态(用户上层活动)和内核态
- 内核： 本质是一段管理计算机硬件设备的程序
- 系统调用：内核的访问接口，是一种不能再简化的操作。 原子性的操作。
- 公用函数库： 系统调用的组合拳
- Shell:命令解释器， 可编程
  

windows - cigwin

查看系统调用
```Linux - man 2 syscalls ```

less / more / cat /tail

切换默认shell 

## 查找特定的文件
`find`
语法：  `find path [options] params`
作用： 在指定目录下查找文件

``` s
find ./ -name "fileName" # 精确查找
find ~ -name "target*" # 模糊查找文件
find ~ -iname "target*" # 忽略大小写的查找
man find # 查看find的使用说明
```

## 检索文件内容
`grep`
语法 `grep [options] pattern file`
全称 Global Regular Expression Print
作用： 用于查找文件里符合条件的字符串, 智慧筛选出目标字符串所在的行
```s
grep "moo" target* # 查找 target* 开头的文件中包含 "moo" 的行
```

#### 管道操作符 | 
- 可以将指令连接起来，前一个指令的输出作为后一个指令的输入




