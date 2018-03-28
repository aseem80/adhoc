package io.practice.assignment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aseem80 on 2/10/17.
 */
public class ZeroOrOneEditAway {


    public static void main(String args[]) {

        String sample1 = "pale";
        String sample2 = "pake";
        System.out.println(isZeroOrOneEdit(sample1, sample2));


    }


    private static boolean isZeroOrOneEdit(String sample1, String sample2) {
        if (sample1.equals( sample2 )) {
            return true;
        }
        if (Math.abs( sample1.length( ) - sample2.length( ) ) > 1) {
            return false;
        }
        Map<Character, Integer> sample1CharacterMap = new HashMap<>( );
        for (int i = 0; i < sample1.length( ); i++) {
            Character c = sample1.charAt( i );
            if (sample1CharacterMap.containsKey( c )) {
                Integer val = sample1CharacterMap.get( c );
                sample1CharacterMap.put( c, ++val );
            }
            else {
                sample1CharacterMap.put( c, 1 );
            }
        }
        int differentCharacter = 0;
        for (int i = 0; i < sample2.length( ); i++) {
            if (!sample1CharacterMap.containsKey( sample2.charAt( i ) )) {
                differentCharacter++;

            }
            if (differentCharacter > 1) {
                return false;
            }
        }
        return true;
    }




}
