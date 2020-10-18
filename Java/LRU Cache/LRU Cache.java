import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
Map<Integer,Integer> map;
    int capacity;
    public LRUCache(int capacity) {
        this.map=new LinkedHashMap<Integer,Integer>();  
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        int val=map.get(key);
        map.remove(key);
        map.put(key,val);
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            map.remove(key);
            map.put(key,value);
        }
        else if(map.size()>=capacity)
        {
            int next=map.keySet().iterator().next();            
            map.remove(next);
            map.put(key,value);
        }
        else
            map.put(key,value);
    }
    public static void main(String args[]) {
    	LRUCache lru=new LRUCache(2);
    	lru.put(2, 1);
    	lru.put(1, 1);
    	lru.put(2,3);
    	System.out.println(lru.get(2));
    	lru.put(4, 1);
    	System.out.println(lru.get(1));    	
    	System.out.println(lru.get(2));
    	
    }
}