package io.practice.assignment;

import java.util.LinkedList;

/**
 * Created by bmwi on 3/13/18.
 */
public class BTBreadthIterator<T> {

    LinkedList<Node> queue = new LinkedList<>();

    public static void main(String args[]) {
        Node rootNode = new Node();
        rootNode.data = 'd';
        rootNode.insert(rootNode, 'b');
        rootNode.insert(rootNode, 'f');
        rootNode.insert(rootNode, 'a');
        rootNode.insert(rootNode, 'c');
        rootNode.insert(rootNode, 'e');
        rootNode.insert(rootNode, 'g');

        BTBreadthIterator<Character> itr = new BTBreadthIterator<>(rootNode);

        while (itr.hasNext()) {
            System.out.println(itr.next().data);
        }

    }

    public BTBreadthIterator(Node node) {
        queue.add(node);
    }

    boolean hasNext() {
        if(queue.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public Node next() {
        if(!hasNext()) {
            return null;
        } else {
            Node current = queue.poll();
            if(current.left!=null) {
                queue.add(current.left);
            }
            if(current.right!=null) {
                queue.add(current.right);
            }
            return current;
        }
    }


}
