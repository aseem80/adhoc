package io.practice.assignment;

import java.util.Arrays;

/**
 * Created by bmwi on 2/28/18.
 */
public class Bits {
    public static void main (String args[]) {
        String a = "Aseem";
        String b = "Kapoor";
        System.out.println(Arrays.toString(a.getBytes()));
        System.out.println(new String(a.getBytes()));
    }

}
