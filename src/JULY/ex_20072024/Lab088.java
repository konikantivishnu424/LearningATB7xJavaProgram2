package JULY.ex_20072024;

import java.util.Scanner;

public class Lab088 {
    private static int Num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int num1=sc.nextInt();
        System.out.println("Enter the num 2");
        int num2=sc.nextInt();
        //System.out.println(Math.max(num1,num2));
        if (num1>num2){
            System.out.println(num1);
        }else if (num2>num1){
            System.out.println(num2);

        }else {
            System.out.println("EquaL");
        }
    }
}
