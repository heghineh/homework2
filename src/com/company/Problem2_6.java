package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of week. ");
        int day = scanner.nextInt();

        switch (day) {
            case 1: {
                System.out.print("Monday.");
                break;
            }
            case 2: {
                System.out.print("Tuesday.");
                break;
            }
            case 3: {
                System.out.print("Wednesday.");
                break;
            }
            case 4: {
                System.out.print("Thursday.");
                break;
            }
            case 5: {
                System.out.println("Friday.");
                break;
            }
            case 6: {
                System.out.println("Saturday.");
                break;
            }
            case 7: {
                System.out.println("Sunday.");
                break;
            }
            default: {
                System.out.print("Invalid number.");
            }
        }
    }
}
