package Todays_Tasks;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //✅ Triangle Classifier:
// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine



// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.



// side1, side2, side3 ->


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
