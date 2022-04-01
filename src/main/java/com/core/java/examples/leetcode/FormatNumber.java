package com.core.java.examples.leetcode;

import java.text.DecimalFormat;

public class FormatNumber {
    public static void main(String[] args) {
        formatNumber(20000000);
    }
    public static void formatNumber(double d){

        DecimalFormat df = new DecimalFormat("#,###.00");
        String s = df.format(d);
        System.out.println(s);
    }
}
