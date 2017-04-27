package io.practice.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by aseem80 on 2/11/17.
 */
public class DesignPath {

    public static void main(String args[]) {
        boolean[][] a = new boolean[5][6];
        for(int r = 0 ; r < 5; r++) {
            for(int c=0; c < 6; c++) {
                a[r][c] = true;
            }
        }
        a[0][0] = true;
        a[4][5] = true;
        a[3][5] = true;
        a[0][1] = true;
        for(int r = 0 ; r < 5; r++) {
            for(int c=0; c < 6; c++) {
                if(c!=0) {
                    System.out.print("  ");
                }
                if(a[r][c]) {
                    System.out.print("T" );
                } else {
                    System.out.print("F" );

                }
            }
            System.out.println();
        }

        List<Path> paths = new ArrayList<>();
                findPath(a, paths, 4, 5);
        System.out.println(paths);


    }

    public static boolean findPath(boolean a[][],  List<Path> paths, int row, int column) {

        if(row < 0 || column < 0 || !a[row][column]) {
            return false;
        }

        boolean isAtOrigin = (row==0) && (column==0);
        if(isAtOrigin || findPath(a, paths, row-1, column) || findPath(a, paths, row, column-1)) {
            Path path = new Path(row, column);
            paths.add(path);
            return true;
        }

        return false;

    }


}


