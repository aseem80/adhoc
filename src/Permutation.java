/**
 * Created by aseem80 on 2/2/17.
 */
public class Permutation {

    public static void main(String args[]) {

        String s = "aseem";
        permutation("",s);


    }

    private static void permutation(String result, String s) {
        if (s.length( ) == 0) {
            System.out.println( result );
        }
        else {
            for (int i = 0; i < s.length( ); i++){
                permutation(result + s.charAt(i), s.substring(0,i) + s.substring(i+1));

            }

        }

    }

}
