/**
 * Created by aseem80 on 2/4/17.
 */
public class StringCompress {

    public static void main(String args[]) {
        String originalString = "AAabbcccccddeeeeeeeeFFFFFFFFAAASS";
        StringBuilder compressedString = new StringBuilder();
        int counter = 1;
        boolean incrementedOnce = false;
        for(int index = 1; index < originalString.length(); index++) {
            if(originalString.charAt( index )==originalString.charAt( index - 1  )) {
                counter++;
                incrementedOnce = true;
            } else {
                compressedString.append(originalString.charAt( index - 1 )  ).append( counter );
                counter = 1;
            }
        }
        compressedString.append( originalString.charAt(originalString.length() - 1 )).append( counter );
        if(!incrementedOnce) {
            System.out.println(originalString);
        } else {
            System.out.println(compressedString.toString());
        }
    }

}
