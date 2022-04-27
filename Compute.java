package com.test;

import java.util.Arrays;

public class Compute {
    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5});
    }
    public static int[] rotate(int[] arr) {
        int n = arr.length;

        int last = arr[n - 1];
        int i = n - 1;
        while (i > 0) {
            arr[i] = arr[i - 1];
            i--;
        }
        arr[0] = last;
        //System.out.println(Arrays.toString(a));
        return arr;
    }
}
