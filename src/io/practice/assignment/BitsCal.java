package io.practice.assignment;

/**
 * Created by bmwi on 2/7/18.
 */
public class BitsCal {

    public static void main(String args[]) {
        Integer i = new Integer(11);
        int bitCounter = 0;
        while (i!=0) {
            i = i & (i-1);
            bitCounter++;
        }
        System.out.println(bitCounter);
        System.out.println(10 | (1<<2));


    }

}
