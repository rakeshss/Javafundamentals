package com.javafundamentals.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class firstExample_2 {

    public static void main(String[] args) {
        Integer[] intArray =  {1,2,3,4};
        // call the test method
        List<Integer> integerList= convertArrayToList(intArray);
        System.out.println("Integer list: " + integerList);

        String[] stringArray =  {"Rakesh","Hari","Shashank"};
        // call the test method
        List<String> stringList= convertArrayToList(stringArray);
        System.out.println("String list: " + stringList);
    }

    // It is just a best practice to use capital letters, recommended by Sun/Oracle
    public static <T> List<T> convertArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }
}
