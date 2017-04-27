package io.practice.assignment;

/**
 * Created by aseem80 on 2/11/17.
 */
public class CountSteps {

    public static void main(String args[]) {
        System.out.println(countWays(10)  );



    }

    public static int countWays(int n) {
        if(n <= 0){
            return 0;
        } else if(n==1) {
            return 1;
        } else {
            return countWays( n - 3 ) + countWays( n - 2 ) + countWays( n - 2 );
        }
    }
}
