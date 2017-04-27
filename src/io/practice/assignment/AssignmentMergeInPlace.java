package io.practice.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aseem80 on 2/8/17.
 */
public class AssignmentMergeInPlace {

    public static void main(String args[]) {
        List<Integer> bigger = new ArrayList<>(20);

        bigger.add(1);
        bigger.add(2);
        bigger.add(10);
        bigger.add(20);
        bigger.add(30);
        bigger.add(40);
        bigger.add(50);
        bigger.add(60);
        bigger.add(70);

        List<Integer> smaller = new ArrayList<>(7);
        smaller.add(1);
        smaller.add(2);
        smaller.add(5);
        smaller.add(7);
        smaller.add(35);
        smaller.add(45);
        smaller.add(60);
        Integer[] result = new Integer[16];
        merge(bigger.toArray(result), smaller.toArray(new Integer[smaller.size()]), 9);




        Arrays.stream(result).forEach( ind ->  System.out.println(ind));



    }


    private static void merge(Integer[] bigger, Integer[] smaller, int filledElements) {

        int smallerIndex = smaller.length -1 ;
        int biggerFilledIndex = filledElements -1;
        int combinedIndex = bigger.length - 1;

        while(smallerIndex >= 0) {
            if(bigger[biggerFilledIndex] > smaller[smallerIndex]) {
                bigger[combinedIndex] = bigger[biggerFilledIndex];
                biggerFilledIndex--;
            } else {
                bigger[combinedIndex] = smaller[smallerIndex];
                smallerIndex--;
            }

            combinedIndex--;

        }


    }




}
