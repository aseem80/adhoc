package io.practice.assignment;

/**
 * Created by bmwi on 1/31/18.
 */
public class StringPermutation {

    public static void main(String args[]) {

        String can = "aseem";

        permutation(can,"");

    }



    private static void permutation(String can, String prefix) {
        if(can.length()==0) {
            System.out.println(prefix);
        } else {
            for(int i=0; i < can.length(); i++) {
                String rem = can.substring(0,i) + can.substring(i+1);
                permutation(rem,prefix+can.charAt(i));
            }
        }
    }

}
