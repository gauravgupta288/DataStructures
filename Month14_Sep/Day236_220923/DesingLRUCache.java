package Month14_Sep.Day236_220923;

import java.util.LinkedHashMap;
import java.util.Map;

public class DesingLRUCache {

    int cap;
    int size;
    Map<Integer, Integer> map;

    public DesingLRUCache(int capacity) {
        this.cap = capacity;
        map = new LinkedHashMap<>();
        size = 0;
    }

    public int get(int key) {
        if(map.containsKey(key)){

            int val = map.get(key);
            removeFirstOccerence(key);

            //add at last
            map.put(key, val);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {

        if(size < cap){
            if(map.containsKey(key)){
                removeFirstOccerence(key);size--;
            }
            map.put(key, value);
            size++;
        }else{
            if(size >= cap && map.containsKey(key)){
                removeFirstOccerence(key);
                map.put(key, value);
            }else{
                removeFirst();
                map.put(key, value);
            }
        }
    }

    public void removeFirst(){
        for(int i : map.keySet()){
            map.remove(i);
            break;
        }
    }

    public void removeFirstOccerence(int key){
        for(int i : map.keySet()){
            if(key == i){
                map.remove(i);
                break;
            }
        }
    }

    public static void main(String[] args) {

        DesingLRUCache cache = new DesingLRUCache(2);
        System.out.println(cache.get(2));
        cache.put(2,6);
        System.out.println(cache.get(1));
        cache.put(1,5);
        cache.put(1,2);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));

    }
}
