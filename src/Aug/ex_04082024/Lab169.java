package Aug.ex_04082024;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        ATBPerson p1 = new ATBPerson("vishnu");
        ATBPerson p2 = new ATBPerson("Hari");
        ATBPerson p3 = new ATBPerson("Damu",987654321);

        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p1.name);    //hari ??????
        System.out.println(p1.phone);
        System.out.println(p3.phone);


    }


}
