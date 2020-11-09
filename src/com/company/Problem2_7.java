package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of week. ");
        String monthName = scanner.nextLine();

        switch (monthName) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December": {
                System.out.print("31 days.");
                break;
            }
            case "April":
            case "June":
            case "September":
            case "November": {
                System.out.print("30 days.");
                break;
            }
            case "February": {
                System.out.print("Wednesday.");
                break;
            }
            default: {
                System.out.print("There is no such month name.");
            }
        }
    }
}
