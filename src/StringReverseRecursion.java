/**
 * Created by aseem80 on 1/31/17.
 */
public class StringReverseRecursion {

    public static void main(String args[]) {

        String s = "Aseem";

        System.out.println(reverseRecursion(s) );
    }


    private static String reverseRecursion(String s) {
        if(s.length() ==1) {
            return s;
        }
        return  reverseRecursion(s.substring(1)) + s.charAt(0);

    }

}
