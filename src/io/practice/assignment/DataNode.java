package io.practice.assignment;

/**
 * Created by bmwi on 3/8/18.
 */
public class DataNode<K,V> {

    K key;
    V value;
    DataNode pre;
    DataNode next;

    public DataNode(K key, V value) {
        this.key = key;
        this.value = value;
    }


    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public DataNode getPre() {
        return pre;
    }

    public void setPre(DataNode pre) {
        this.pre = pre;
    }

    public DataNode getNext() {
        return next;
    }

    public void setNext(DataNode next) {
        this.next = next;
    }
}
