package com.company;

import java.util.Random;

public class Problem2_1 {
    public static void main(String[] args) {
        Random random = new Random();

        int number1 = random.nextInt(100) + 10;
        System.out.println("Number 1 is " + number1);
        int number2 = random.nextInt(100) + 10;
        System.out.println("Number 2 is " + number2);

        int sum = number1 + number2;
        Long Sum = (long) sum;

        System.out.println(number1 + " + " + number2 + " = " + Sum);
    }
}
