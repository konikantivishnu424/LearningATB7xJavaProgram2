package JULY.ex_20072024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = Sc.nextInt();

        if ( age >18){
            System.out.println("Eligible for voting");
        }else{
            System.out.println("Not Eligible for Voting");
        }

    }
}
