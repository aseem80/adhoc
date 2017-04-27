import java.util.Arrays;

/**
 * Created by aseem80 on 1/31/17.
 */
public class MergeSort {


    public static void main(String args[]) {
        int a[] = {10, 57, 1, 78, 49};
        MergeSort ms = new MergeSort();
        ms.divideArray(a);
        Arrays.stream( a ).forEach( el -> System.out.println( el ) );


    }


    public void divideArray(int[] inputArray) {
        int length = inputArray.length;
        if(length != 1 ) {
            int leftArrayLength = length / 2;
            int rightArrayLength = length - leftArrayLength;
            int[] tempLeftArray  = new int[leftArrayLength];
            int[] tempRightArray = new int[rightArrayLength];
            for(int i = 0; i < leftArrayLength; i++) {
                tempLeftArray[i] = inputArray[i];
            }
            for(int i = 0; i < rightArrayLength; i++) {
                tempRightArray[i] = inputArray[i+leftArrayLength];
            }
            divideArray(tempLeftArray);
            divideArray(tempRightArray);
            merge(tempLeftArray,  tempRightArray, inputArray);

        }

    }

    public int[] merge(int a[], int b[], int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;
        while( i < a.length && j < b.length) {
            if(a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }

            k++;
        }
        if (i!=a.length ) {
            copyArray(c, k, a, i);
        } else if(j!=b.length){
            copyArray(c, k, b, j);

        }
        return c;




    }

    private void copyArray(int target[], int tgtIndex, int source[], int srcIndex) {
        for(int i = srcIndex ; i < source.length; i++, tgtIndex++) {
            target[tgtIndex] = source[i];
        }
    }


}
