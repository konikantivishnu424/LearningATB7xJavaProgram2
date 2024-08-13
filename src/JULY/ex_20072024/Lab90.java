package JULY.ex_20072024;

import java.util.Scanner;

public class Lab90 {
    public static void main(String[] args) {

        //Grade Calculator
        //Write a Program to calculate and display
        // Grade of the Students
        //A,B,c,D,E
        //A== 90-100
        //B==80-89
        //c==70-79
        //D==60-69
        //E==50-59

        //Find the user Inputs
        //Score - data types - int -90
        //DAA -Dont Assume Anything
        //Interview--->Int ,char
        //Scanner  -->


        //2.Basic Logic
        //if(score  >=90 && score <=100)  -->Return to point Grade A
       //else if <=89 && Score >=80--->Return to Point B
        //else if score<=79 && Score >=70 -->Return to Point c
        //D,E
        //Grade f

        //3.Write The Code


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of the students");
        int score =sc.nextInt();

        char Grade ='f';

        if (score >=90  && score<=100){
            Grade ='A';
        }else if (score >=80  && score<=89) {
            Grade = 'B';
        }else if (score >=70  && score<=79)
        {
            Grade = 'C';
        }else if (score >=60  && score<=69)
        {
            Grade = 'D';
        }else if (score <=0 && score >100);
        {
            System.out.println("LOl, Are you God !!!");
        }Grade ='f';
        System.out.println("Your Grade is --->"+ Grade);
        sc.close();
    }
}
