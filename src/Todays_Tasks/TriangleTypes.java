package Todays_Tasks;

import java.util.Scanner;

public class TasksFOrToday {
    public static void main(String[] args) {
        //All sides are Equal means Equalaeral Triangle
        //only two sides are Equal means Isosceles Triangle
        //All sides are Different means Scalene Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1 value");
        int side1 = sc.nextInt();
        System.out.println("Enter Side 2 value");
        int side2 = sc.nextInt();
        System.out.println("Enter Side 3 value");
        int side3 = sc.nextInt();
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
        sc.close();
    }
}
