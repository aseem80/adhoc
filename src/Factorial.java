/**
 * Created by aseem80 on 2/2/17.
 */
public class Factorial {

    public static void main(String args[]) {
        int number = 5;
        int result = 1;
        for(int i = number; i>=1; i--) {
            result = result * i;
        }

  //      System.out.println(result);
        System.out.println(fact(5));


    }


    private static long fact(int n) {
        if(n==0) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }

}
