package ex_14072024;

public class Labo56 {
    public static void main(String[] args) {
        //Type casting-source and destination conversion
        //Widining -Implicit ,Explicit - LossLess
        // Narrowing- Implicit ,Explicit(with Data Types),Loss
        byte b = 10;
        int a =b; //valid IMplicit casting
        int a1 =(int)b; //valid Explicit - casting
        System.out.println(a1);
       // Narrowing
        int val =456;  // invalid implicit casting
        byte b1=(byte)val;  //valid =Explicit casting
        System.out.println(b1);  //Loss of Data
    }
}
