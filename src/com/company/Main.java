package com.company;

public class Main {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 500;
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Multiplication: " + multiply(num1, num2));
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static void printHello(int name){
        System.out.println("Hello!" + name);
    }
}
