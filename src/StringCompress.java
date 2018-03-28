/**
 * Created by aseem80 on 2/4/17.
 */
public class StringCompress {

    public static void main(String args[]) {
        String originalString = "AAabbcccccddeeeeeeeeFFFFFFFFAAASSP";
        StringBuilder compressedString = new StringBuilder();
        int counter = 1;
        boolean incrementedOnce = false;
        for(int index = 0; index < originalString.length()-1; index++) {
            if(originalString.charAt( index )==originalString.charAt( index + 1  )) {
                counter++;
                incrementedOnce = true;
            } else {
                compressedString.append(originalString.charAt( index)  ).append( counter );
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
