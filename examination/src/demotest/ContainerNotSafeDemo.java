package demotest;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author Airren
 * @version 1.0
 * @date 2019/10/27 4:19 PM
 */

public class ContainerNotSafeDemo {
    public static void main(String[] args)  {
//        Map<String,String> map = new HashMap<>(); //导致线程不安全
//
////        2种解决方案
////         Map<String,String> map = Collections.synchronizedMap(new HashMap<>());
////        Map<String,String> map = new ConcurrentHashMap<>();
//        for (int i = 0; i <= 30; i++) {
//            new Thread(()->{
//                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,8));
//                System.out.println(map);
//            },String.valueOf(i)).start();
//        }



    }
}

