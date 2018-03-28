package io.practice.assignment;

/**
 * Created by bmwi on 1/31/18.
 */
public class LinearSearch {

    public static void main(String args[]) {

        int a[] = {13,27,35,40,49,55,59};
        int b[] = {17,35,39,40,55,58,60};

        int i=0;
        int j=0;
        while(i < a.length && j < b.length) {
            if(a[i]==b[j]){
                System.out.println(a[i]);
                i++;
            } else if(a[i] > b[j]) {
                j++;
            } else {
                i++;
            }
        }


    }

}
