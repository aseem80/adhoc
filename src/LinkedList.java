import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by aseem80 on 2/4/17.
 */
public class LinkedList<T extends Comparable> implements List<T> {

    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;
    private int size = 0;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    public boolean addNew(T t) {
        LinkedListNode<T> newNode = new LinkedListNode<>(t);
        size++;
        if(head==null) {
            head = newNode;
        } else {
            LinkedListNode<T> current = head;
            while(current.getNext()!=null) {
                current = head.getNext();
            }
            current.setNext(newNode);
        }
        newNode.setPrev(tail);
        tail = newNode;
        return true;

    }


    @Override
    public boolean add(T t) {
        LinkedListNode<T> node = new LinkedListNode<>(t);
        if(this.head==null) {
            this.head = node;
        } else {
            LinkedListNode<T> nextNode = this.head.getNext();
            LinkedListNode<T> currentNode = nextNode;
            while(nextNode!=null) {
                currentNode = nextNode;
                nextNode = nextNode.getNext();
            }
            currentNode.setNext(node);
            currentNode.setPrev(nextNode);
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {

        boolean found = false;
        if(head==null) {
            return false;
        } else {
            LinkedListNode<T> current = head;
            if(o.equals(head.getData())) {
                head = head.getNext();
                return true;
            } else {
                while (current.getNext() != null) {
                    if (o.equals(current.getNext().getData())) {
                        current.setNext(current.getNext().getNext());
                        found = true;
                    }
                    current = current.getNext();
                }

                return found;
            }
        }

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        LinkedListNode<T> referenceNode = head;
        if(null!=head) {
            if (index == 0) {
                return head.getData( );
            }
            else if (index - 1 == size) {
                return tail.getData( );
            }
            else if (index >= size) {
                throw new ArrayIndexOutOfBoundsException( );
            }
            else {
                int local = 0;
                LinkedListNode<T> nextNode = head.getNext();
                while(nextNode!=null && local < index) {
                    nextNode = nextNode.getNext();
                    local++;
                }
                return nextNode.getData();
            }
        } else {
            throw new ArrayIndexOutOfBoundsException( );
        }
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
        int local = 0;

        LinkedListNode<T> currentNode = head.getNext();
        while( local <= index) {
            currentNode = currentNode.getNext();
            local++;
        }

        LinkedListNode<T> node = new LinkedListNode<>(element);
        if(currentNode!=null) {
            node.setNext( currentNode.getNext( ) );
            currentNode.setNext(node);
        } else {

        }

        size++;


    }

    @Override
    public T remove(int index) {
        LinkedListNode<T> currentNode = head.getNext();
        int local = 0;
        while( local <= index) {
            currentNode = currentNode.getNext();
            local++;
        }
        T data = currentNode.getNext().getData();
        currentNode.setNext(currentNode.getNext().getNext());
        return data;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
