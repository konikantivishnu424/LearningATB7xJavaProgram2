package JULY.ex_14072024;

public class Lab059 {
    public static void main(String[] args) {
        int course =100;
        float Gst = 18.45F;
        // int total_price = course+ Gst  //Implicit Narrowing -Jvm
        float total_price = course+ Gst;//Explicit Narrowing -Real time -money loss
        System.out.println(total_price);
    }
}
