package io.practice.assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by bmwi on 3/7/18.
 */
public class LargestKthElement {

    public static void main(String args[]) {
        Integer[] input = {100,90,40,30};

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
                }
        );
        int k = 2;
        for(int i=0; i<input.length; i++) {
            queue.add(input[i]);
            if(queue.size() > k) {
                queue.poll();
            }
        }
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        System.out.println(queue.peek());
        System.out.println(Arrays.toString(queue.toArray()));



    }
}
