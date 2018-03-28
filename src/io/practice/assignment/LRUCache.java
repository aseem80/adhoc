package io.practice.assignment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bmwi on 3/8/18.
 */
public class LRUCache<K,V> {


    int capacity;
    Map<K, DataNode<K,V>> map = new HashMap<>();
    DataNode head = null;
    DataNode tail = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public V get(K key) {
        if(map.containsKey(key)) {
            DataNode<K,V> node = map.get(key);
            removeNode(node);
            setHead(node);
            return map.get(key).getValue();
        } else {
            return null;
        }

    }



    public void set(K key , V val) {
        DataNode<K,V> node = new DataNode<K, V>(key, val);
        removeNode(node);
        setHead(node);
        map.put(key,node);
        if(map.size() > capacity) {
            map.remove(tail.getKey());
            removeNode(tail);

        }



    }

    public void removeNode(DataNode<K,V> node) {
        if(node.pre!=null) {
            node.pre.next = node.next;
        } else {
            head = node.next;
        }
        if(node.next!=null) {
            node.next.pre = node.pre;
        } else {
            tail = node.pre;
        }

    }

    public void setHead(DataNode node) {
        node.pre = null;
        node.next = head;
        if(head!=null){
            head.pre = node;
        }
        head = node;

        if(tail==null) {
            tail = head;
        }

    }


}
