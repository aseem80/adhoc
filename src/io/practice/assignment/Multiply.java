package io.practice.assignment;

/**
 * Created by aseem80 on 2/12/17.
 */
public class Multiply {

    public static void main(String args[]) {

        System.out.println(mulitply(7,8));
    }


    public static int mulitply (int a, int b) {
        int sum = a;
        for(int i = 1; i < b; i++ ) {
            sum = sum + a;
        }

        return sum;
    }

}
