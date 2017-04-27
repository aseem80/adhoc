package io.practice.assignment;

/**
 * Created by aseem80 on 2/12/17.
 */
public class Stack<T> {

    private class Node {


        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    private Node top;

    public void push(T item) {
        Node node = new Node(item);
        node.next = top;
        top = node;
    }

    public T pop() {
        if(top==null) throw new RuntimeException();
        T item = top.getData();
        top = top.getNext();
        return item;
    }

}
