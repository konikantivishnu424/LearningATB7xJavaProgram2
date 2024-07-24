package ex_14072024;

public class Lab064 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + a++ +  ++a);
        System.out.println(a);
        // Part -> a  ++a,  Exp 1=11, a =11
        // Part ->b   a++,  Exp 2=11, a =12
        // part ->c   ++a,  Exp 3=12, a=13
        // op = exp1+ exp2 + exp3
        //a =13

    }
}
