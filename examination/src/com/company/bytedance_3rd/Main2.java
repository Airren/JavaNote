//package com.company.bytedance_3rd;
//
//import java.util.*;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int  N= sc.nextInt();
//        int M= sc.nextInt();
//        int K= sc.nextInt();
//
//        int[] arr = new int[K];
//        for (int i = 0; i <K ; i++) {
//           arr[i]=sc.nextInt();
//        }
//
//        LRUCache lruCache = new LRUCache(2);
//
//        int count = 0;
//
//        for (int i = 0; i <K ; i++) {
//
//            if (lruCache.get(arr[i])==){
//
//            }
//        }
//
//        System.out.println(count);
//    }
//
//
//}
//class LRUCache extends LinkedHashMap<Integer, Integer>{
//    private int capacity;
//
//    public LRUCache(int capacity) {
//        super(capacity, 0.75F, true);
//        this.capacity = capacity;
//    }
//
//    public int get(int key) {
//        return super.getOrDefault(key, -1);
//    }
//
//    public void put(int key, int value) {
//        super.put(key, value);
//    }
//
//    @Override
//    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
//        return size() > capacity;
//    }
//}
//
