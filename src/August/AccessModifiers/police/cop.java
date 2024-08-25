package August.AccessModifiers.police;

public class cop {

    private int gun;
    private String idcard;


    public cop(int gun){
      this.gun =gun;
    }
    protected void canIshoot(){
        System.out.println("Yes you can shoot");
    }
}
