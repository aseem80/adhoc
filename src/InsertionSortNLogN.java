/**
 * Created by aseem80 on 2/1/17.
 */
public class InsertionSortNLogN {

    public static void main(String args[]) {

        int a[] = {10, 57, 1, 78, 49, 100, 0};
        int b[] = new int[a.length];
        b[0] = a[0];
        for(int i = 1; i < a.length; i++){
            insert(b, a[i], i);

        }

    }


    private static void insert(int[] b, int el, int median) {
        if(median > 2) {
            int newMedian = median / 2;
            if(median % 2==0) {
                newMedian = newMedian + 1;
            }
            if(el < b[newMedian - 1] ) {
                insert(b,el, newMedian);
            } else if(el > b[newMedian] ) {
                insert(b,el, newMedian);
            }
        } else if(median==2){
            if(el < b[0]) {
                b[2] = b[1];
                b[1] = b[0];
                b[0] = el;
            } else if(el > b[1]) {
                b[2] = el;
            } else {
                b[2] = b[1];
                b[1] = el;
            }

        } else {
            if(el > b[0]){
            } else {
            }

        }



    }


    private void copyArray(int target[], int tgtIndex, int source[], int srcIndex) {
        for(int i = srcIndex ; i < source.length; i++, tgtIndex++) {
            target[tgtIndex] = source[i];
        }
    }

}