package ex_14072024;

public class Lab069 {
    public static void main(String[] args) {
        String s1 = "vishnu";  //String constant pool
        // 1 , SCP
        s1 = "vardhan";
        // 2 , SCP
        s1 = "Reddy";
        // 3 . SCP
        s1 = "vishnuvardhan";
        // 3, SCP
    }
}
