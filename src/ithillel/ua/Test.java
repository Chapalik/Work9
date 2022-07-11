package ithillel.ua;

import ithillel.ua.Calculator;

public class Test {
    public static void main(String[] args) {
        System.out.println(Calculator.add(1, 2));
        System.out.println(Calculator.add(1.1, 2.2));
        System.out.println(Calculator.sub(1, 2));
        System.out.println(Calculator.sub(1.1, 2.2));
        System.out.println(Calculator.mul(1, 2));
        System.out.println(Calculator.mul(1.1, 2.2));
        System.out.println(Calculator.div(1, 2));
        System.out.println(Calculator.div(1.1, 2.2));
    }
}