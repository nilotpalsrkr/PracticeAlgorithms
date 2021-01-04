package leetcode.dsa.medium;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Q146_LRUCache {
    Queue<Value> queue ;
    Map<Integer, Value> map;
    final int capacity;
    int currentCapacity;
    public Q146_LRUCache(int capacity) {
        this.capacity = capacity;
        this.currentCapacity = 0;
        map = new HashMap<>();
        queue = new ArrayBlockingQueue<>(capacity);
    }

    public int get(int key) {
        Value value = map.get(key);

        if(map.get(key)!=null){
            queue.remove(value);
            queue.offer(value);
        }

        return value!=null ? value.getValue() : -1;
    }

    public void put(int key, int value) {
        int tempCurrentCapacity = currentCapacity + 1;
        Value vAlue = new Value(value);
        if(tempCurrentCapacity > capacity) {
            Value valueToBeRemoved = queue.poll();
            //map.remove(key);
            Optional<Integer> keyOptional = map.entrySet().stream().filter((e) -> e.getValue() == valueToBeRemoved).map(x -> x.getKey()).findFirst();
            if(keyOptional.isPresent()) {
                map.remove(keyOptional.get());
                queue.offer(vAlue);
                map.put(key, vAlue);
                tempCurrentCapacity--;
            }
        }
        else {
            if(map.get(key)!=null){
                queue.remove(vAlue);
                queue.offer(vAlue);
            }
            else if(map.get(key) ==  null) {
                map.put(key, vAlue);
                queue.offer(vAlue);

            }

        }
        currentCapacity = tempCurrentCapacity;
    }

}
class Value {

    int value;

     Value(int value) {

        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value1 = (Value) o;
        return value == value1.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
