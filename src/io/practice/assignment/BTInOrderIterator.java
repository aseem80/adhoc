package io.practice.assignment;

/**
 * Created by bmwi on 3/12/18.
 */
public class BTInOrderIterator<T extends Comparable<T>> {

    Node node;



    public static void main(String args[]) {
        Node rootNode = new Node();
        rootNode.data = 'd';
        rootNode.insert(rootNode, 'b');
        rootNode.insert(rootNode, 'f');
        rootNode.insert(rootNode, 'a');
        rootNode.insert(rootNode, 'c');
        rootNode.insert(rootNode, 'e');
        rootNode.insert(rootNode, 'g');
        BTInOrderIterator<Character> itr = new BTInOrderIterator<>(rootNode);
        while(itr.hasNext()) {
            System.out.println(itr.next().data);
        }

    }


    public BTInOrderIterator(Node root) {
        this.node = root;
        while(node.left!=null) {
            node = node.left;
        }
    }

    public boolean hasNext() {
        if(node==null) {
            return false;
        } else {
            return true;
        }
    }

    public Node next() {
        if(!hasNext()) {
            return null;
        }
     Node result = node;
        if(node.right!=null) {
            node = node.right;
            while(node.left!=null) {
                node = node.left;
            }
            return result;
        }
        while(true) {
            if(node.parent==null) {
                node = null;
                return result;
            }
            if(node.parent.left==node) {
                node = node.parent;
                return result;
            } else {
                node = node.parent;
            }
        }



    }






}
