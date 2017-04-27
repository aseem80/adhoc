import java.util.ArrayList;
import java.util.List;

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

        if (root.data.compareTo( data ) < 0) {
            insert( root, newNode );
        }
        else {
            insert( root, newNode );
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
            collectAllElements( collection, startNode.getLeft( ) );
            collection.add( startNode.getData( ) );
            collectAllElements( collection, startNode.getRight( ) );
        }



    }
}
