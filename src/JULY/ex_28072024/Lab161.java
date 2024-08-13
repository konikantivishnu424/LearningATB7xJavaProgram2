package JULY.ex_28072024;

import java.util.Scanner;

public class Lab161 {
    // Create a program that determines whether a given year is a leap year.
    // A leap year is divisible by 4,
    // but not by 100 unless it is also divisible by 400.
    // Use an if-else statement to make this determination.

    // 1. Get clarity on the inputs - year -. int  2024

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
    int year = scanner.nextInt();

    boolean isLeapYear = false;

    // Leap year logic
        if (year % 4 == 0) {
        if (year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        }
    }

        if (isLeapYear) {
        System.out.println(year + " is a leap year.");
    } else {
        System.out.println(year + " is not a leap year.");
    }
}

}

//Divisibility by 4: If a year is divisible by 4, it might be a leap year.
//Divisibility by 100: However, if it’s also divisible by 100, it’s not a leap year unless...
//Divisibility by 400: If a year is divisible by 400, it’s definitely a leap year.
//For example:
//
//        2000 is a leap year (divisible by 400).
//        1900 is not a leap year (divisible by 100 but not by 400).
//        2024 is a leap year (divisible by 4 but not by 100).