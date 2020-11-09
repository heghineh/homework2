package com.company;

import java.util.Random;

public class Problem2_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int number1 = random.nextInt(100) + 10;
        int number2 = random.nextInt(100) + 10;

        int sum = number1 + number2;

        if (sum % 2 == 0) {
            Long sum1 = (long) sum;
            System.out.println(number1 + " + " + number2 + " = " + sum1 + "\nCasted to long!");
        } else {
            Double sum2 = (double) sum;
            System.out.println(number1 + " + " + number2 + " = " + sum2 + "\nCasted to double!");
        }
    }
}
