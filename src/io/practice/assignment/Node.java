package io.practice.assignment;

/**
 * Created by bmwi on 3/12/18.
 */
import java.util.Stack;
public class Node<T extends Comparable<T>> {

    T data;
    Node left;
    Node right;
    Node parent;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void insert(Node root, T data) {
        Node node = new Node();
        node.data = data;
        insert(root, node);
    }

    private void insert(Node node, Node newNode) {
        if(newNode.data.compareTo(node.data) < 0) {
            if(node.left!=null) {
                insert(node.left, newNode);
            } else {
                newNode.parent = node;
                node.left = newNode;
            }
        } else{
            if(node.right!=null) {
                insert(node.right, newNode);
            } else {
                newNode.parent = node;
                node.right = newNode;
            }
        }


    }


    public static void visit(Node node) {
        if(node!=null) {
            visit(node.left);
            System.out.println(node.data);
            visit(node.right);

        }
    }

    public static void visitItr(Node node) {
        Stack<Node> stack = new Stack<>();
        while(node!=null) {
            stack.add(node);
            node = node.left;
        }

        while(!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.println(current.data);
            if(current.right!=null) {
                current = current.right;
                while(current!=null) {
                    stack.add(current);
                    current = current.left;
                }
            }
        }

    }




}
