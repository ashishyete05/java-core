package com.core.java.examples;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        shout("Hello");
        shout(12);
        shout(312L);
        shout(33.211);

        Printer<String> printer = new Printer<>("Ashish");
        printer.printTheDetails();
        Printer<Integer> printer1 = new Printer<>(12);
        printer1.printTheDetails();

        List<String> list = new ArrayList<>();
        list.add("ashish");
        printList(list);

    }

    public static <T> void shout(T printSomething){
        System.out.println(printSomething +"!!!");

    }

    public static void printList(List<?> ll){
        System.out.println(ll);
    }

}
