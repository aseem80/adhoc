package io.practice.assignment;

/**
 * Created by bmwi on 1/31/18.
 */
public class StringRev {

    public static void main(String args[]) {

        String can = "Aseem";
        String result = "";
        for(int i = can.length() -1; i >=0; i--) {
            result = result+can.charAt(i);
        }
        System.out.println(stringRev(can));

    }


    private static String stringRev(String can) {
        if(can.length()==1) {
            return can;
        } else {
            return  stringRev(can.substring(1)) + can.charAt(0);
        }
    }



}
