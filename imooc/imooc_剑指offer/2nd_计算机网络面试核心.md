# 计算机网络面试核心
#### http 简介

 **超文本传输协议的主要特点**

- 支持客户/服务器模式 浏览器通过url向服务端发送请求， 服务端返回响应信息
- 简单快速  请求方法 get post delete 通讯速度快
- 灵活 数据格式灵活
- 无连接 每次连接只处理一个请求，收到应答之后就断开连接   keep alive
- 无状态的 协议对事务处理没有记忆能力 version 1.1 引入了 keep alive 持续连接机制 2.0 升级成本太大


**Http 请求结构**

![94b84b0b.png](:storage/fbb1fa2a-c44c-45e1-a781-53b7a6b18373/94b84b0b.png)
![cb1ec7b2.png](:storage/fbb1fa2a-c44c-45e1-a781-53b7a6b18373/cb1ec7b2.png)

![708d4215.png](:storage/fbb1fa2a-c44c-45e1-a781-53b7a6b18373/708d4215.png)

常见的