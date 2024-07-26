package ex_14072024;

public class LAb076 {
    public static void main(String[] args) {
        String s1 = "vishnu";
        //String s1 = "vishnu";
        //          |0|1|2|3|4|5|
        char c = s1.charAt(5);
        System.out.println(c);
        s1 = s1.concat("vardhan"); // vishnu vardhan
        System.out.println(s1);
    }
}
