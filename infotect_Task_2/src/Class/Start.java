package Class;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("------Welcome to My Bank----------------");
        System.out.println("---------------------------------------");

        Scanner input = new Scanner(System.in);
        Bank bank=new Bank();

        boolean Choice=true;
        do {
            System.out.println("\n1)Create Account \n2)Login Account \n3)Exit");
            System.out.println("please Enter your option\n");
            int option=input.nextInt();
            System.out.println("------------------------------------");
            switch (option)
            {
                case 1:
                    input=new Scanner(System.in);
                    System.out.println("--------Create Account--------");
                    System.out.println("Please Enter your id");
                    int id=input.nextInt();
                    System.out.println("Please Enter your name");
                    String name=input.next();
                    System.out.println("Please Enter your Amount Add");
                    int amount=input.nextInt();
                    System.out.println("Please Enter your password");
                    String password=input.next();

                    Account account=new Account(id,name,amount,password);
                    bank.addaccount(account);
                    break;

                case 2:
                    System.out.println("--------Please Login---------------");
                    System.out.println("Please enter your id");
                    int userid=input.nextInt();
                    System.out.println("Please enter your password ");
                    String userpassword=input.next();
                    Account account1=bank.Searchaccount(userid);
                    if(account1!=null)
                    {
                        int useroption;
                        do{
                            System.out.println("\n1)Depositeamount \n2)Withdrawamount \n3)Show Account Detailes \n4) Send Money \n5)Show Transaction History \n6) Logout");
                            System.out.println("--------------");
                            System.out.println("Please Enter the option");
                            useroption=input.nextInt();
                            switch (useroption)
                            {
                                case 1:
                                    System.out.println("---------------Depositeamount---------");
                                    System.out.println("Please Enter your Deposite Amount");
                                    int Depositeamount=input.nextInt();
                                    bank.Depositeamount(account1.getId(),Depositeamount);
                                    break;
                                case 2:
                                    System.out.println("--------------Withdrawamount-----------");
                                    System.out.println("Please Enter your Withdraw Amount");
                                    int Withdrawamount=input.nextInt();
                                    bank.Withdrawamount(account1.getId(),Withdrawamount);
                                    break;
                                case 3:
                                    System.out.println("--------Show Account Detailes--------");
                                    account1.Showdetailes();
                                    break;
                                case 4:
                                    System.out.println("---------Send Money------------");
                                    System.out.println("Please Enter the Sender id");
                                    int senderid=input.nextInt();
                                    System.out.println("Please Enter the Amount");
                                    int sendeamount=input.nextInt();
                                    bank.Sendmoney(account1.getId(),senderid,sendeamount);
                                    break;
                                case 5:
                                    System.out.println("--------------Show Transaction History----------------");
                                    bank.Showtransaction(account1.getId());
                                    break;
                                case 6:
                                    System.out.println("-----Logout-----");

                            }

                        }while (useroption!=6);

                    }
                    break;

                case 3:
                    System.out.println("------Thank You-------");
                    return;
            }



        }while (Choice);

//        Account account1=new Account(1,"Dipta saha",8000,"12345");
//        Account account2=new Account(2,"Dipta saha2",7000,"65444");
//        Bank bank=new Bank();
//        bank.addaccount(account1);
//        bank.addaccount(account2);
//        System.out.println("----------------------");
//        System.out.println("List of Account");
//        bank.Showaccounts();
//        bank.Depositeamount(1,2000);
//        bank.Withdrawamount(2,1000);
//        bank.Sendmoney(1,2,4000);
//        System.out.println("--------------------------");
//        System.out.println("List of Account");
//        bank.Showaccounts();
//        System.out.println("-------------------------");
//        System.out.println("List of Transaction");
//        bank.Showtransaction();
    }
}
