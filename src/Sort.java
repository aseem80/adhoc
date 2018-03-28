import java.util.Arrays;

/**
 * Created by aseem80 on 1/28/17.
 */
public class Sort {

    public static void main(String args[]){
        int a[] = {10,57,1,78,49};
        int[] b = new int[a.length];
//        insertionSort(a, b);
//        Arrays.stream(b).forEach( el -> System.out.println(el) );
        insertSort(a, b);
        Arrays.stream(b).forEach( el -> System.out.println(el) );
    }









    private static void insertSort(int[] a, int[] b) {
        b[0] = a[0];
        for(int j=1; j < a.length; j++ ) {
            int el = a[j];
            int i = j-1;
            while(i >=0  && b[i] > el) {
                b[i+1] = b[i];
                i--;
            }
            b[i+1] = el;
        }

    }


    //Best Case :- Input Array is sorted. Inner while loop will not execute. O(n)
    //Worst Case: Sorted in reverse order. O(n2)
    //Avg : - Half of the time input array is sorted and other half time it sis not O(n2)
    private static int[] insertionSort(int a[], int b[]) {
        b[0] = a[0];
        for(int j = 1; j < a.length; j++) {
            int el = a[j];
            int i = j - 1;
            while(i >= 0 && b[i] > el) {
                b[i+1] = b[i];
                i--;
            }
            b[i+1] = el;
        }
        return b;
    }


    //Best Case :- Input Array is sorted.  O(n2)
    //Worst Case: Sorted in reverse order. O(n2)
    private static void selectionSort(int a[]) {
        for(int i = 0 ; i < a.length; i++) {
            for(int j = i+1 ; j < a.length ; j++) {
                if(a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

    }

}
