package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        //Take user input and check if number is Even or Odd


        //Logical Building - Ready
        //1.Figure out the Inputs
        //Data type input
        //How to take input in the Java ->scanner -class
        //nextInt()  -->Input
        //2.Data Type
        //3.Do we need Conversion or Directly
        //4.Rough Logic  num%2==0 even,odd
        //5.Optimise
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int user_input=sc.nextInt();
        System.out.println(user_input);
        if (user_input%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
