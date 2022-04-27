package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyTest {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6};

        List<Integer> ll= new ArrayList<>();

        List<Integer> arr1=  Arrays.stream(arr).boxed().toList();

        System.out.println("list is "+arr1);

        int index=arr1.indexOf(3);
        System.out.println("index :: "+index);

        List finalList=  arr1.subList(index+1,arr1.size());
        List inList= arr1.subList(0,index+1);

        ll.addAll(finalList);
        ll.addAll(inList);

        System.out.println(ll);
    }
}
