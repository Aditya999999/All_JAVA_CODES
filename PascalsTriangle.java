package com.test;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    static long m = 1000000007;
    static List<List<Long>> nthRowOfPascalTriangle(int n) {

        // code here
        List<List<Long>> triangle = new ArrayList<List<Long>>();
        ArrayList<Long> row = null;
        for (int i = 0; i < n; i++) {
            row = new ArrayList<Long>();

            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    row.add(1L);
                } else {

                    row.add(Long.valueOf(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j))%m);

                }
            }
            triangle.add(row);

        }
        return triangle;

    }

    public static void main(String[] args) {
        System.out.println(nthRowOfPascalTriangle(4));
    }
}