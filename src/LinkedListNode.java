/**
 * Created by aseem80 on 2/4/17.
 */
public class LinkedListNode<T extends Comparable> {

    private T data;
    private LinkedListNode<T> prev;
    private LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNode<T> getPrev() {
        return prev;
    }

    public void setPrev(LinkedListNode<T> prev) {
        this.prev = prev;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }


}
