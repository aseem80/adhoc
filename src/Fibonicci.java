/**
 * Created by aseem80 on 2/2/17.
 */
public class Fibonicci {

    public static void main(String args[]) {
        /*
        int first = 1;
        int second = 1;
        int sum = 0;
        for(int i=3; i <= 10; i++) {
            sum = first+second;
            System.out.println(sum  );
            first = second;
            second = sum;
        } */

        System.out.println(recursionFib(10) );

    }


    private static int recursionFib(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else {
            int result = recursionFib(n - 1);
            System.out.println(result);
            return result + recursionFib(n - 2);
        }

    }


}
