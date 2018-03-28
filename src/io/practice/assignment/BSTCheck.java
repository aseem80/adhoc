package io.practice.assignment;

/**
 * Created by bmwi on 3/14/18.
 */
public class BSTCheck {

    public static void main(String args[]) {

        Node<Integer> root = new Node(10);
        Node<Integer> left = new Node(7);
        root.left = left;
        Node<Integer> right = new Node(39);
        root.right = right;


        System.out.println(isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));


    }




    private static boolean isValidBST(Node<Integer> node, int l, int h) {
        if(node == null)
            return true;
        return node.data > l
                && node.data < h
                && isValidBST(node.left, l, node.data)
                && isValidBST(node.right, node.data, h);
    }


}
