package ex_14072024;

public class Lab058 {
    public static void main(String[] args) {
       int course =100;
       float Gst = 18.45f;
       // int total_price = course+ Gst  //Implicit Narrowing -Jvm
       int total_price = course+ (int)Gst;//Explicit Narrowing -Real time -money loss
        System.out.println(total_price); //.45 is loss
    }
}
