package io.practice.assignment;

import java.util.*;

/**
 * Created by bmwi on 3/8/18.
 */
public class MergeSortedArrays {

    public static void main(String args[]) {

        Integer[] a = {1,2,3,100,200};

        Integer[] b = {7,9,11,13,1000};

        Integer[] c = {10,15,16,17,18};

        Integer[] d = {0};

        Integer[] e = {-3,-1};

        List<Integer>[] input = new List[5];
        input[0] = Arrays.asList(a);
        input[1] = Arrays.asList(b);
        input[2] = Arrays.asList(c);
        input[3] = Arrays.asList(d);
        input[4] = Arrays.asList(e);

        MergeSortedArrays arrays = new MergeSortedArrays();

        System.out.println(Arrays.toString(arrays.mergeSorted(input)));


    }


     int[] mergeSorted(List<Integer>[] a) {

        PriorityQueue<Node> queue = new PriorityQueue<>(a.length, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.value.compareTo(o2.value);
            }
        });

        int total = 0;
        for(int row=0; row < a.length; row++) {
            total = total + a[row].size();
            Node node = new Node(a[row].get(0), row,0);
            queue.offer(node);
        }

         int[] result = new int[total];

         int index = 0;
         while(!queue.isEmpty()) {
             Node node = queue.poll();
             result[index++] = node.value;
             Node next = null;
             if(node.col < a[node.row].size() - 1) {
                 int row = node.row;
                 int col = node.col+1;
                 next = new Node(a[row].get(col), row, col);
                 queue.add(next);
             }

         }
         return result;


    }

    class Node{
        Integer value;
        int row;
        int col;


        public Node(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

}
