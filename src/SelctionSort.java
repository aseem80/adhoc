import java.util.Arrays;

/**
 * Created by aseem80 on 1/31/17.
 */
public class SelctionSort {

    public static void main(String args[]) {
        int a[] = {10, 57, 1, 78, 49};
        for(int i=0; i < a.length; i++) {
            for(int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        Arrays.stream(a).forEach( el -> System.out.println(el) );

    }
}
