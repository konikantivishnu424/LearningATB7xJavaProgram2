package Augest.ex_04082024;

public class BankAccount {

        String bankname;
        int balance;
        String bankcode;


        //Dc
        BankAccount(){
            bankname="SBI";
            balance = 100000000;
            bankcode="SBI001";
        }

        //pc
          BankAccount(String bname,int bal,String bcode){
              this. bankname=bname;
              this. balance = bal;
              this. bankcode=bcode;
        }

        void printDetails(){
            System.out.println("Bank Name ->" + bankname);
            System.out.println("Bank Code->" + bankcode);
            System.out.println("Bal->" + balance);

        }
    }





