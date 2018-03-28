package io.practice.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aseem80 on 2/11/17.
 */
public class SearchInSorted {

    public static void main(String args[]) {

        int a[] = {0,1,2,3,4};
        List<Integer> l = new ArrayList<>(10  );
        findMagicIndex(a,0,4, l);
        System.out.println( l);

    }




























    public static void findMagicIndex(int a[], int low, int high, List<Integer> result) {
        int median = (low+high)/2;
        if(a[median] == median){
            result.add(median);
        }
        if(median-1>=low) {
            findMagicIndex( a, low, median - 1, result );
        }

        if(median+1<=high) {
            findMagicIndex( a, median + 1, high, result );
        }


    }

}
