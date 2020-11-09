package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(100) + 10;
        System.out.println("Number is " + number);
        double square = Math.pow(number, 2);

        String square1 = String.valueOf(square);
        System.out.println("Result is " + square1 + "\nCasted to string!");
    }
}
