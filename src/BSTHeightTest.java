import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmwi on 2/4/18.
 */
public class BSTHeightTest {

    public static void main(String args[]) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>(5);
        bst.addElement(4);
        bst.addElement(6);
        bst.addElement(3);
        bst.addElement(7);
        bst.addElement(8);
        bst.addElement(2);
        bst.addElement(1);
        bst.addElement(0);
        bst.addElement(-1);

        bst.addElement(8);




        List<Integer> list = new ArrayList<>();
        bst.collectAllElements(list,bst.getRoot());

        List<Integer> breadthList = new ArrayList<>();
        bst.collectAllElementsBreadthWise(breadthList, bst.getRoot());
        System.out.println(list);
        System.out.println(breadthList);


    }
}
