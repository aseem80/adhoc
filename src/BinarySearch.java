import java.util.Collections;

/**
 * Created by aseem80 on 2/3/17.
 */
public class BinarySearch {

    public static void main(String args[]) {
        String s = "cbabadcbbabbcbabaabccbabc";
        char cs[] = s.toCharArray();
        boolean hasDuplicate = false;
        char ch = Character.MIN_VALUE;
        mergeSort(cs);
        System.out.print( hasElement(cs, 'a', 0, s.length()) );



    }


    private static boolean hasElement(char[] sorted, char toFind, int start, int end) {
        int length  = end - start;
        boolean found = false;
        if(length > 2) {
            int offset = (start + end)%2;
            int middle = (start + end)/2;
            if(toFind==sorted[middle - 1 + offset]) {
                return true;
            } else if(toFind > sorted[middle-1 + offset]) {
                return hasElement(sorted, toFind, middle + offset, end);
            } else {
                return hasElement(sorted, toFind, start, middle + offset);
            }
        } else {
            if(toFind==sorted[start] || toFind==sorted[end-1]) {
                found = true;
            }
        }
        return found;

    }

    private static void mergeSort(char[] ch){
        int length  = ch.length;
        if(length > 2) {
            int leftArrayLength = length / 2;
            char[] leftInputArray = new char[leftArrayLength];
            char[] rightInputArray = new char[length-leftArrayLength];
            for(int i=0; i < leftArrayLength; i++) {
                leftInputArray[i] = ch[i];
            }
            for(int i=0; i < length-leftArrayLength; i++) {
                rightInputArray[i] = ch[leftArrayLength+i];
            }
            mergeSort(leftInputArray);
            mergeSort(rightInputArray);
            merge(leftInputArray, rightInputArray, ch);

        }

    }

    private static char[] merge(char[] ch1 , char[] ch2, char[] result) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < ch1.length && j < ch2.length) {
            if(ch1[i] < ch2[j]) {
                result[k] = ch1[i];
                i++;
            } else {
                result[k] = ch2[j];
                j++;
            }
            k++;
        }
        if(i < ch1.length ) {
            copyArray(result, k, ch1, i);

        } else if(j < ch2.length ) {
            copyArray(result, k, ch2, j);

        }


        return result;
    }

    private static void copyArray(char[] target, int targetBeginIndex, char[] source, int sourceBeginIndex) {
        for(int i = sourceBeginIndex; i < source.length; i++) {
            target[targetBeginIndex] = source[sourceBeginIndex];
            targetBeginIndex++;
        }
    }

}
