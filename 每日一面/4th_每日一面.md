# 4.每日一面

> 携程面试

1. 问项目， 注意项目细节

   Netty 

   BIO 同步阻塞IO，一个线程只有一个连接

   NIO 同步非阻塞IO ，一个线程有多个连接，一个线程中有很多Channel，通过selector 选择线程

   AIO 异步非阻塞IO

2. 双重检验单例

   ```Java
   public class Singleton{
     private volatile static Singleton singleton;
     private Singleton(){
       
     }
     public Singleton getSingleton(){
       if(singleton == null){
         synchronized(Singleton.class){
           if(singleton == null){
             singleton = new Singleton();
           }
         }
       }
       return singleton;
     }
   }
   ```

3. http1.1  长连接， 心跳包， http2 http3

   HTTP 1.1 支持长连接(PersistentConnection)和请求的流水线(Pipelining)处理,在一个TCP连接上可以传送多个HTTP请求，减少了建立和关闭连接的消耗和延迟。在HTTP1.1中默认开启Connection：keep-alive，一定程度上弥补了HTTP 1.0 每次请求都要创建连接的缺点。          

   HTTP 2.0

4. 线程池，参数列表，阻塞队列的默认值（

5. 垃圾回收 G1，实际项目中怎么优化

6. 1000万条数据中选取最小的100个，分析每一步的时间复杂度，除了堆还有什么方法

7. 设计索引

8. 多线程限流

   

