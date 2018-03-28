package io.practice.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by bmwi on 2/28/18.
 */
public class Subsets {
    public static void main (String args[]) {
        List<String> superSet = new ArrayList<>();
        superSet.add("a");
        superSet.add("b");
        superSet.add("c");

        for(int i=0; i < (1 << superSet.size()); i++) {
            Set<String> subset = new HashSet<>();
            for (int j = 0; j < superSet.size(); j++) {
                 if((i & (1 << j)) > 0) {
                     subset.add(superSet.get(j));
                 }
            }
            System.out.println(subset);
        }



    }
    }
