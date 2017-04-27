import java.util.Arrays;

/**
 * Created by aseem80 on 1/29/17.
 */
public class MergeSortedArrays {

    public static void main(String args[]) {
        int z[] = {10, 57, 1, 78, 49};
        divide(z);
        Arrays.stream( z ).forEach( el -> System.out.println( el ) );

    }

    private static void  divide(int z[]) {
        if(z.length!=1) {
            int n = z.length / 2;
            int m = z.length - n;
            int left[] = new int[n];
            for (int i = 0; i < n; i++) {
                left[i] = z[i];
            }

            int right[] = new int[m];

            for (int i = 0; i < m; i++) {
                right[i] = z[n + i ];
            }
            divide(left);
            divide(right);
            mergeSorted(left, right, z);
        }

    }


    private static int[] mergeSorted(int a[], int b[], int c[]) {

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            }
            else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        if (j != b.length) {
            copyArray( b, j, c, k );
        }
        else if (i != a.length) {
            copyArray( a, i, c, k );
        }
        return c;
    }

    private static void copyArray(int source[], int startSourceIndex, int target[], int startTargetIndex) {
        for (int i = startSourceIndex; i < source.length; i++) {
            target[startTargetIndex] = source[i];
            startTargetIndex++;
        }
    }


}
