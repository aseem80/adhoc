import java.util.Arrays;

/**
 * Created by aseem80 on 1/31/17.
 */
public class InsertionSortRecursion {

    public static void main(String args[]) {
        int a[] = {10, 57, 1, 78, 49};
        int b[] = new int[a.length];
        b[0] = a[0];
        for(int i=1; i < a.length; i++){
            insertRecursively(a[i], b, i);
        }
        Arrays.stream(b).forEach( el -> System.out.println(el) );


    }


    private static void insertRecursively(int i, int[] b, int index) {
        b[index] = i;
        if(index > 0 && b[index - 1] > i) {
            b[index] = b[index-1];
            insertRecursively(i, b, index-1);
         }
    }
}
