package io.practice.assignment;

import java.util.LinkedList;

/**
 * Created by bmwi on 3/8/18.
 */
public class ReverseLinkedList {

    public static void main(String args[]) {

        ReverseLinkedList rl = new ReverseLinkedList();
        Node head = rl.init();
        Node rev = rl.reverse(head);
        while(rev!= null) {
            System.out.println(rev.data);
            rev = rev.next;
        }
        System.out.println(rl.reverseRecur(head, head.next).data);

    }


    Node init() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        return node1;

    }


    Node reverse(Node node) {
       Node prev = null;
       Node current = node;
       Node next = null;
       while(current!=null){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
       return prev;
    }

    Node reverseRecur(Node current, Node prev) {
        if(current.next==null) {
            current.next = prev;
            return current;
        }

        Node result = reverseRecur(current.next, current);
        result.next = current;
        return result;
    }

    class Node {
        Integer data;
        Node next;

        public Node(Integer data) {
            this.data = data;
        }
    }


}
