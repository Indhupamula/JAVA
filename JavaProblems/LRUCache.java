// JavaProblems/LRUCache.java
import java.util.*;

public class LRUCache extends LinkedHashMap<Integer,Integer> {
    private int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    public int get(int key){ return super.getOrDefault(key,-1); }

    public void put(int key, int value){ super.put(key,value); }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
        return size()>capacity;
    }

    public static void main(String[] args){
        LRUCache cache=new LRUCache(2);
        cache.put(1,1); cache.put(2,2);
        System.out.println(cache.get(1)); //1
        cache.put(3,3); // evicts key 2
        System.out.println(cache.get(2)); // -1
    }
}
