package io.practice.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bmwi on 3/19/18.
 */
public class MatrixRotation {


    public static void main(String args[]) {

        int[][] input = new int[3][3];
        int[] arr1 = {1,2,3};
        int[] arr2 = {8,9,4};
        int[] arr3 = {7,6,5};
        input[0] = arr1;
        input[1] = arr2;
        input[2] = arr3;

        System.out.println(getRotation(input));




    }



    public static List<Integer> getRotation(int[][] input) {
        List<Integer> result = new ArrayList<>();
        int rows = input.length;
        int cols = input[0].length;
        int filled = 0;
        int rowpointer = 0;
        int colpointer=0;
        int right = 0;
        int up = 0;
        int down = 0;
        int left = 0;
        while(filled < (rows*cols) ) {
            while(colpointer < (cols - right)) {
                result.add(input[rowpointer][colpointer]);
                colpointer++;
                filled++;
            }
            right++;
            colpointer = colpointer - right;
            while (rowpointer < (rows - down - 1)) {
                rowpointer++;
                result.add(input[rowpointer][colpointer]);
                filled++;
            }
            rowpointer = rowpointer - down;
            down++;

            while (colpointer > left) {
                colpointer--;
                result.add(input[rowpointer][colpointer]);
                filled++;
            }
            colpointer = colpointer + left;

            left++;
            while(rowpointer > up ){
                rowpointer--;
                result.add(input[rowpointer][colpointer]);
                filled++;
            }
            rowpointer = rowpointer + up;
            up++;
        }
        return result;
    }


}
