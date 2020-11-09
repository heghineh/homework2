package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        System.out.println("Here are the numbers: " + number1 + " and " + number2);

        System.out.println("Enter an operator.");
        int operator = scanner.next().charAt(0);

        switch (operator) {
            case '+': {
                System.out.print("Addition: " + (number1 + number2));
                break;
            }
            case '-': {
                System.out.print("Subtraction: " + (number1 - number2));
                break;
            }
            case '*': {
                System.out.print("Multiplication: " + (number1 * number2));
                break;
            }
            case '/': {
                if (number2 == 0) {
                    System.out.println("Division by zero is undefined.");
                    break;
                }
                System.out.print("Division: " + (number1 / number2));
                break;
            }
            default: {
                System.out.print("Please select proper operator.");
            }
        }
    }
}
