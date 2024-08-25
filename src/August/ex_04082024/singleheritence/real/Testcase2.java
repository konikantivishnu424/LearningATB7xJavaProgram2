package August.ex_04082024.singleheritence.real;

public class Testcase2 extends BaseTest{
    void testcases2(){

        startbrowser(); //Base Test
        getdatafromsql();  //Grand Base Test
        System.out.println(gold); //Grand Base Test
        stopbrowser();
    }

    public static void main(String[] args) {
        new Testcase2().testcases2();
    }
}
