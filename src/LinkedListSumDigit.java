/**
 * Created by aseem80 on 2/10/17.
 */
public class LinkedListSumDigit {

    public static void main (String args[]) {
        LinkedListNode<Integer> node11 = new LinkedListNode<>(7);
        LinkedListNode<Integer> node12 = new LinkedListNode<>(1);
        LinkedListNode<Integer> node13 = new LinkedListNode<>(6);



        node11.setNext( node12 );
        node12.setNext( node13 );




        LinkedListNode<Integer> node21 = new LinkedListNode<>(5);
        LinkedListNode<Integer> node22 = new LinkedListNode<>(9);
        LinkedListNode<Integer> node23 = new LinkedListNode<>(2);
        node21.setNext( node22 );
        node22.setNext( node23 );

        System.out.println(recursiveSum(node11, node21, 0, 0));




    }

    public static int sum(LinkedListNode<Integer> node1, LinkedListNode<Integer> node2){
        int result = 0;
        int counter = 0;
        int carryover = 0;
        while(node1!=null || node2!=null){
            int sum = 0;
            if(node1 != null && node2!=null) {
                sum = node1.getData( ) + node2.getData() + carryover;
            } else if(node1 != null && node2==null) {
                sum = node1.getData( ) +  carryover;
            } else {
                sum = node2.getData( )  + carryover;
            }
            int remainder = sum % 10;
            carryover = sum/10;
            result = result + new Double (Math.pow( 10,  counter)).intValue()*remainder;
            counter++;
            if(node1!=null) {
                node1 = node1.getNext( );
            }
            if(node2!=null) {
                node2 = node2.getNext( );
            }

        }

        return result;
    }


    public static int recursiveSum(LinkedListNode<Integer> node1, LinkedListNode<Integer> node2, int length, int
            result){
        if(node1!=null && node2!=null) {
            int sum = recursiveSum(node1.getNext(), node2.getNext(), ++length, result);
            result =  new Double (Math.pow( 10,  length)).intValue()*(sum % 10) + (sum/10);


        }


        return result;
    }



}
