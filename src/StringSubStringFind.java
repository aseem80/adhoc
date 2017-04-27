import java.util.HashSet;

/**
 * Created by aseem80 on 2/5/17.
 */
public class StringSubStringFind {

    public static void main (String args[]) {
        String ls = "Aseem";
        String ss = "A";
        boolean isSubstring = false;

        for(int i = 0; i < ls.length(); i++) {
            int j = 0;
            while( i < ls.length() && j < ss.length() && ss.charAt(j)==ls.charAt(i)) {
                j++;
                i++;
            }
            if(j==ss.length()) {
                isSubstring = true;
                break;
            }

        }
        isSubString(ls,ss);
        System.out.println(isSubstring);

    }

    private static boolean isSubString(String ls, String ss) {
        boolean isSubstring = false;
        int ssHAsh = ss.hashCode();
        String first = ls.substring(0,  ss.length());
        if(ss.equals(first)) {
            return true;
        }
        int hashCode = first.hashCode();


        for(int index = 1; index < ls.length(); index++) {
            hashCode = getHashCode(hashCode, ls.charAt(index-1 ),  ls.charAt(index-1+ss.length()));
            if(hashCode==ssHAsh && ss.equals(ls.substring(ls.charAt(index), index-1+ss.length()))) {
                isSubstring = true;
                break;
            }
        }

        return isSubstring;

    }

    private static int getHashCode(int hashCode, char skip, char added) {
        return hashCode - Character.hashCode( skip ) + Character.hashCode( added );
    }


}
