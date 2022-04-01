package com.core.java.examples;

public class Printer<T> {
    private final T someThing;
    Printer(T someThing){
        this.someThing=someThing;
    }

    public void printTheDetails(){
        System.out.println("Printing => " +someThing);
    }
}
