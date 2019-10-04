package datastructure.others;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRULinkedHashMapCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRULinkedHashMapCache(int capacity){
        super(capacity,0.75F, true);
        this.capacity = capacity;
    }


    public int get(int key){
        return super.getOrDefault(key, -1);
    }

    public int put(int key, int value){
        return super.put(key, value);
    }



    @Override
    public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
        return size() > capacity;
    }


}
