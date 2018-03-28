package io.practice.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bmwi on 3/14/18.
 */
public class LCABT {

    public static void main(String args[]) {
        Node<Integer> node1 = new Node(1);
        Node<Integer> node2 = new Node(2);
        node1.left = node2;
        Node<Integer> node3 = new Node(3);
        node1.right = node3;


        Node<Integer> node4 = new Node(4);
        Node<Integer> node5 = new Node(5);

        node2.left = node4;
        node2.right = node5;



        Node<Integer> node8 = new Node(8);
        Node<Integer> node9 = new Node(9);

        node4.left = node8;
        node4.right = node9;



        Node<Integer> node10 = new Node(10);
        Node<Integer> node11 = new Node(11);

        node5.left = node10;
        node5.right = node11;

        Node<Integer> node6 = new Node(6);
        Node<Integer> node7 = new Node(7);
        node3.left = node6;
        node3.right = node7;


   //     Node.visit(node1);


        List<Integer> list = new ArrayList<>();
        System.out.println(hasPath(node1,node9,list));

        System.out.println(list);


    }



    private static boolean hasPath(Node<Integer> node, Node<Integer> candidate, List<Integer> path) {
        if(node==null) {
            return false;
        }
        if(node.data.compareTo(candidate.data)==0) {
            return true;
        }
        boolean hasPath = hasPath(node.left,candidate, path) || hasPath(node.right,candidate, path);
        if(hasPath ) {
            path.add(node.data);
        }
        return hasPath;
    }



}
