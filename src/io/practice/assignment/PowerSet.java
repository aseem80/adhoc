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
        list.add( 40 );




        System.out.println(getPowerList(list));


    }


    public static List<List<Integer>> getPowerList(List<Integer> set) {
        List<List<Integer>> list = new ArrayList<>();

        for(int index = 0 ; index < (1 << set.size()); index++) {
            List<Integer> sub = new ArrayList<>();
            for(int inner = 0 ; inner < set.size(); inner++) {
                if((index & (1<<inner)) > 0){
                    sub.add(set.get(inner));
                }
            }
            list.add(sub);
        }
        return list;

    }


}
