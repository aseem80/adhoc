package io.practice.assignment;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Created by aseem80 on 2/10/17.
 */
public class UniqueString {

    public static void main(String args[]) {

        String sample1 = "asem";
        String sample2 = "mesa";

        System.out.println(isUnique(sample1));
        System.out.println(isPermutation(sample1, sample2));



    }

    public static boolean isUnique(String sample){
        if (sample.length() >  128) {
            return false;
        }
        boolean[] hashTable = new boolean[128];
        for(int i=0; i < sample.length(); i++) {
            if(hashTable[sample.charAt(i)]) {
                return false;
            }
            hashTable[sample.charAt(i)] = true;
        }
        return true;


    }

    public static boolean isPermutation(String sample1, String sample2) {
        if (sample1.length( ) != sample2.length( )) {
            return false;
        }
        int[] hashTable = new int[128];
        for (int index = 0; index < sample1.length( ); index++) {
            hashTable[sample1.charAt( index )]++;
        }
        for (int index = 0; index < sample2.length( ); index++) {
            hashTable[sample2.charAt( index )]--;
        }

        OptionalInt any = Arrays.stream( hashTable ).filter( el -> el < 0 ).findAny( );
        return !any.isPresent();
    }




}
