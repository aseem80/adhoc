import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aseem80 on 2/1/17.
 */
public class FindingSumExists {

    public static void main(String args[]) {

        Integer a[] = {10, 57, 1, 78, 49};
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(a[0]);
        for(int index=1; index < a.length; index++) {
            bst.addElement( a[index] );
        }

        List<Integer> l = new ArrayList<>(  );
        bst.collectAllElements( l, bst.getRoot());
        System.out.println(l );





    }
}
