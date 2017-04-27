import java.util.HashMap;
import java.util.Map;

/**
 * Created by aseem80 on 2/3/17.
 */
public class FindingPairs {

    public static void main(String args[]) {

        int a[] = {1, 7, 5, 9, 2, 12, 3};
        int k = 2;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length && i != j; j++) {
                if (Math.abs( a[i] - a[j] ) == 2) {
            //        System.out.println( a[i] + " , " + a[j] );
                }
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < a.length; i++) {
            Integer occur = map.get(a[i]);
            if(occur==null) {
                map.put(a[i], i);
            }
        }

        for(Integer el : map.keySet()) {
            Integer keyLook1 = el + k;
            Integer keyLook2 = el - k;
            if(map.containsKey(keyLook1)) {
                System.out.println( el + " , " + keyLook1);

            }
            if(map.containsKey(keyLook2)) {
//                System.out.println( el + " , " + keyLook2);

            }


        }

    }


}
