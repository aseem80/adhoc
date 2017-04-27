import java.util.Arrays;

/**
 * Created by aseem80 on 2/2/17.
 */
public class BubbleSort {

    public static void main(String args[]) {

        int a[] = {10, 57, 1, 78, 49, 100, 0};

        for (int i = 0; i < a.length; i++) {
            for(int j = 1; j < a.length - i; j++){
                if(a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }


        }

        Arrays.stream(a).forEach( el -> System.out.println(el) );

    }
}
