import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by aseem80 on 2/4/17.
 */
public class StringReplace {

    public static void main(String args[]) {
        String bigLine = "This is practice session. Finish the practice.     ";
        String[] allWords = new String[bigLine.length( )];
        StringBuilder sb = new StringBuilder( );
        int numberOfWords = 0;
        for (char c : bigLine.toCharArray( )) {
            if (!Character.isWhitespace( c )) {
                sb.append( c );
            }
            else {
                String whiteSpace = sb.toString( );
                if(!whiteSpace.equals(" ")) {
                    allWords[numberOfWords++] = whiteSpace;
                    sb = new StringBuilder( );
                }
            }
        }
        String whiteSpace = sb.toString( );
        if(!whiteSpace.equals(" ")) {
            allWords[numberOfWords] = whiteSpace;
        }
        StringBuilder cs = new StringBuilder( );

        IntStream.range(0, allWords.length ).forEach( index -> {
            String word = allWords[index];
            if (null != word) {
                if(index!=0) {
                    cs.append( "%20" );
                }
                cs.append( word );
            }
        } );
        System.out.println(cs);
    }
}
