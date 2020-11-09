package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number.");
        int number3 = scanner.nextInt();
        System.out.println("Enter second number.");
        int number4 = scanner.nextInt();
        boolean result;
        
        if ((number3 < 25 || number3 > 75) || (number4 < 25 || number4 > 75)) {
            result = false;
            System.out.println("Out of given range.");
        } else if (number3 % 10 == number4 % 10 ||
                number3 % 10 == number4 / 10 ||
                number3 / 10 == number4 % 10 ||
                number3 / 10 == number4 / 10) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(result);
    }
}
