package io.practice.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aseem80 on 2/11/17.
 */
public class PowerSet {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>(  );
        list.add( 10 );
        list.add( 20 );
        list.add( 30 );

        List<List<Integer>> allsubsets = new ArrayList<>();

        getPowerList(list, allsubsets, 0);

        System.out.println(allsubsets);


    }


    public static void getPowerList(List<Integer> set, List<List<Integer>> allsubsets, int index) {

        if(set.size()==index) {
            allsubsets.add(new ArrayList<Integer>( ) );
        } else {
            getPowerList(set, allsubsets, index+1);
            Integer el = set.get( index );
            List<List<Integer>> moresubsets =  new ArrayList<>();
            for(List<Integer> subset : allsubsets) {
                List<Integer> newsubset = new ArrayList<>();
                newsubset.addAll( subset );
                newsubset.add(el);
                moresubsets.add(subset);
            }
            allsubsets.addAll(moresubsets);
        }



    }


}
