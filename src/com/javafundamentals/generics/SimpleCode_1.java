package com.javafundamentals.generics;

import java.util.LinkedList;

public class SimpleCode_1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Integer(1));

        // problem is when you want to access, you need to type cast, which is annoying.

        // Integer i = list.iterator().next();  this statement won't work

        // solution
        Integer i = (Integer) list.iterator().next();
        System.out.println(i);
    }
}
