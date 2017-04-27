package io.practice.assignment;

/**
 * Created by aseem80 on 2/12/17.
 */
public class Queue<T> {

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

    Node first;
    Node last;

    public void add(T item) {
        Node node = new Node(item);
        if(last!=null) {
            last.setNext( node );
        }
        last = node;
        if(first==null) {
            first = last;
        }
    }

    public T remove() {
        Node n = first;
        if(first!=null) {
            first = first.next;
        }
        if(first==null) {
            last=null;
        }
        return n.getData();
    }

    public T peek() {
        if(first!=null) {
            return first.data;
        } else {
            return null;
        }
    }



}



