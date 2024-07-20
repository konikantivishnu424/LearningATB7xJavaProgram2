package Todays_Tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //✅ Leap Year Program - 2024
        // Leap Year Or Not
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Year");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Year is a leap year");
        else
            System.out.println("year is not a leap year");
    }

    }

