package io.practice.assignment;

/**
 * Created by bmwi on 3/12/18.
 */

import java.util.Stack;

public class BTInOrderIteratorStack<T extends Comparable<T>> {

    Stack<Node> stack = new Stack<>();


    public static void main(String args[]) {
        Node rootNode = new Node();
        rootNode.data = 'd';
        rootNode.insert(rootNode, 'b');
        rootNode.insert(rootNode, 'f');
        rootNode.insert(rootNode, 'a');
        rootNode.insert(rootNode, 'c');
        rootNode.insert(rootNode, 'e');
        rootNode.insert(rootNode, 'g');
        BTInOrderIteratorStack<Character> itr = new BTInOrderIteratorStack<>(rootNode);
        while (itr.hasNext()) {
            System.out.println(itr.next().data);
        }

    }


    public BTInOrderIteratorStack(Node node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public Node next() {
        if (!hasNext()) {
            return null;
        }
        Node result = stack.pop();
        if(result.right!=null) {
            Node right = result.right;
            while(right!=null) {
                stack.push(right);
                right = right.left;
            }
        }

        return result;


    }


}
