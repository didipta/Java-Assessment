package Class;

public class Start {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("------Welcome to My Bank----------------");
        System.out.println("---------------------------------------");
        Account account1=new Account(1,"Dipta saha",8000,"12345");
        Account account2=new Account(2,"Dipta saha2",7000,"65444");
        Bank bank=new Bank();
        bank.addaccount(account1);
        bank.addaccount(account2);
        System.out.println("----------------------");
        System.out.println("List of Account");
        bank.Showaccounts();
        bank.Depositeamount(1,2000);
        bank.Withdrawamount(2,1000);
        bank.Sendmoney(1,2,4000);
        System.out.println("--------------------------");
        System.out.println("List of Account");
        bank.Showaccounts();
        System.out.println("-------------------------");
        System.out.println("List of Transaction");
        bank.Showtransaction();
    }
}
