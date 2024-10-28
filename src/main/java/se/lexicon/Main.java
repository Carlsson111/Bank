package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000, "Anders Johansson","Anders-Johansson@test.se","070-856-89-11");

        System.out.println(myAccount.getAccountInfo());

         // deposits the amount
        myAccount.deposit(502.1);

        System.out.println(myAccount.getAccountInfo());

        //withdraws the amount
        myAccount.withdraw(200);

        System.out.println(myAccount.getAccountInfo());

        //withdrawing more then balance
        myAccount.withdraw(2000);

        System.out.println(myAccount.getAccountInfo());



    }
}




