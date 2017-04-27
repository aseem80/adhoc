import java.util.Arrays;

/**
 * Created by aseem80 on 1/31/17.
 */
public class InsertionSort {

    public static void main(String args[]) {
        int a[] = {10, 57, 1, 78, 49};
        int b[] = new int[a.length];
        b[0] = a[0];
        for(int i = 1; i < a.length; i++){
            int j = i-1;
            while(j >=0 && b[j] > a[i]) {
                b[j+1] = b[j];
                j--;
            }
            b[j+1] = a[i];

        }
            Arrays.stream(b).forEach( el -> System.out.println(el) );

    }
}
