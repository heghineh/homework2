package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------MENU-----------\n" +
                "-- Enter 1 for calculating area of the circle\n" +
                "-- Enter 2 for calculating perimeter of the circle\n" +
                "-- Enter 3 for exit.");

        int number = scanner.nextInt();
        double radius = 5;
        double pi = Math.PI;

        switch (number) {
            case 1: {
                double area = pi * Math.pow(radius, 2);
                System.out.println("Area of the circle is " + area);
                break;
            }
            case 2: {
                double perimeter = 2 * pi * radius;
                System.out.print("Perimeter of the circle is " + perimeter);
                break;
            }
            case 3: {
                break;
            }
            default: {
                System.out.print("There is no such point in the menu.");
            }
        }
    }
}
