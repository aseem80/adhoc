package io.practice.assignment;

/**
 * Created by bmwi on 3/12/18.
 */

import java.util.Stack;

public class BTPreOrderIteratorStack<T extends Comparable<T>> {

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
        BTPreOrderIteratorStack<Character> itr = new BTPreOrderIteratorStack<>(rootNode);
        while (itr.hasNext()) {
            System.out.println(itr.next().data);
        }

    }


    public BTPreOrderIteratorStack(Node node) {
        Node root = node;
        while (node.left != null) {
            stack.push(node.left);
            node = node.left;
        }
        stack.push(root);
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
            while(right.left!=null) {
                stack.push(right.left);
                right = right.left;
            }
            stack.push(result.right);
        }

        return result;


    }


}
