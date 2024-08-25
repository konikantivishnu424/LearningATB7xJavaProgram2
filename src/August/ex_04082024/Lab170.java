package August.ex_04082024;

public class Lab170 {
    public static void main(String[] args) {
        BankAccount ba1= new BankAccount();
        System.out.println(ba1.bankname);
        System.out.println(ba1.balance);
        System.out.println(ba1.bankcode);


        BankAccount baICICI = new BankAccount("ICICI",2000,"ICICI000005");
        System.out.println(baICICI.bankname);
        System.out.println(baICICI.balance);
        System.out.println(baICICI.bankcode);
  //we can get details from user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Name of the Bank!");
//        String bName = sc.next();
//        System.out.println("Enter your Name of the Bal!");
//        int bal = sc.nextInt();
//        System.out.println("Enter your Name of the Bank cODE!");
//
//        String bCode = sc.next();
//
//        BankAccount baicici = new BankAccount(bName, bal, bCode);
//
//
//        baicici.printDetails();
//
//        sc.close();
    }
}
