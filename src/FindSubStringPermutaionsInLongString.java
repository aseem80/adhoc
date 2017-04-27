import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aseem80 on 2/3/17.
 */
public class FindSubStringPermutaionsInLongString {

    public static void main(String args[]) {

        String longString = "cbabadcbbabbcbabaabccbabc";
        String searchString = "abbc";
        char[] lc = longString.toCharArray();
        Map<Character, Integer> sMap = new HashMap<>();
        for(char c : searchString.toCharArray()) {
            Integer occurrence = sMap.get(c);
            if(occurrence==null) {
                sMap.put( c, 1 );
            } else {
                occurrence++;
                sMap.put( c, occurrence );
            }
        }


        for(int i = 0; i < lc.length; i++) {
            int endIndex = i + searchString.length();
            if(endIndex < lc.length) {
                String sub = longString.substring( i, endIndex );
                if(getSignature(sub.toCharArray()) == getSignature(searchString.toCharArray())) {
                    System.out.println(sub);

                }
            }



        }



    }

    private static int getSignature(char[] c) {
        int sum = 0;
        for(char a : c) {
            sum = sum + a;

        }
        return sum;



    }
}
