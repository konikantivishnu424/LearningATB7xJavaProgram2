package Todays_Tasks;

public class RightTriangleStarpattern {
    public static void main(String[] args) {
        // Write a  Right Triangle Star Patern program
        //*****
        // ****
        // ***
        //**
        //*

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("*");
        }
    }
}