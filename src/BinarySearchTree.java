import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by aseem80 on 2/1/17.
 */
public class BinarySearchTree<T extends Comparable<T>> {

    BSTNode<T> root;

    public BinarySearchTree(T data) {
        root = new BSTNode<>(data);
    }

    public BSTNode<T> getRoot() {
        return root;
    }

    public void addElement(T data) {
        BSTNode<T> newNode = new BSTNode<T>( data );
        insert( root, newNode );
    }



    public void insertAgain(BSTNode<T> node, BSTNode<T> newNode) {
        if(node==null) {
            node = newNode;
            return;
        } else {
            if(newNode.getData().compareTo(node.getData()) < 0) {
                insertAgain(node.getLeft(), newNode);
            } else{
                insertAgain(node.getRight(), newNode);
            }
        }
    }

    public void insert(BSTNode<T> node, BSTNode<T> newNode) {
        T data = newNode.getData( );
        if (data.compareTo(node.data) < 0) {
            BSTNode<T> leftNode = node.getLeft( );
            if (leftNode != null) {
                insert( leftNode, newNode );
            }
            else {
                node.setLeft( newNode );
            }
        }
        else {
            BSTNode<T> rightNode = node.getRight( );
            if (rightNode != null) {
                insert( rightNode, newNode );
            }
            else {
                node.setRight( newNode );
            }

        }
    }

    public BSTNode<T> getElement(T data, BSTNode<T> startNode) {
        BSTNode<T> node = null;
        if(startNode==null) {
            return node;

        } else {
            if (data.compareTo( startNode.data ) == 0) {
                return startNode;
            }
            else if (data.compareTo( startNode.data ) < 0) {
                node = getElement(data, startNode.left);
            } else if(data.compareTo( startNode.data ) > 0) {
                node = getElement(data, startNode.right);

            }
            return node;

        }

    }

    public boolean containsElement(T data) {
        if(null!=getElement(data, root)) {
            return true;
        } else{
            return false;
        }
    }



    public void collectAllElements(List<T> collection, BSTNode<T> startNode) {
        if (startNode != null) {
            collectAllElements(collection, startNode.getLeft());
            collection.add(startNode.getData());
            collectAllElements(collection, startNode.getRight());
        }
    }

    public void collectAllElementsBreadthWise(List<T> collection, BSTNode<T> startNode) {
        java.util.LinkedList<BSTNode<T>> queue = new java.util.LinkedList<BSTNode<T>>();
        queue.add(startNode);
        while(!queue.isEmpty()) {
            BSTNode<T> currentNode = queue.poll();
            collection.add(currentNode.getData());
            if(currentNode.getLeft()!=null) {
                queue.add(currentNode.getLeft());
            }
            if(currentNode.getRight()!=null) {
                queue.add(currentNode.getRight());
            }
        }
    }

    public int getHeight(BSTNode<T> startNode) {
        if (startNode == null) {
            return 0;
        }
        int lHeight = getHeight(startNode.getLeft()) + 1;
        int rHeight = getHeight(startNode.getRight()) + 1;
        return Math.max(lHeight,rHeight);
    }




}
