package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int number1 = 0;
        
        if (number > 100) {
            number1 = random.nextInt(number) + 50;
        } else if (number < 100) {
            number1 = random.nextInt(50);
        }

        String number2 = String.valueOf(number1);
        System.out.println("The output is " + number2 + "\nCasted to string.");
    }
}
