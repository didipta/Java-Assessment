package Class;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts;
    List<Transaction> transactions;

    private int i=0;

    public Bank() {
        this.accounts=new ArrayList<Account>();
        this.transactions=new ArrayList<Transaction>();
    }
    //Add account
    public void addaccount(Account account)
    {
        this.accounts.add(account);
        System.out.println("Account is Successfully Registered");
    }
    //Add transaction
    public void addtransaction(Transaction transaction)
    {
        this.transactions.add(transaction);

    }

    public void removeaccount(int id)
    {
        Account account=Searchaccount(id);
        if(account!=null)
        {
            this.accounts.remove(account);
            System.out.println("Account is Successfully Removed");
        }
        else
        {
            System.out.println("Account is not found");
        }

    }
    public Account Searchaccount(int id)
    {
        Account account=null;
        if(accounts.size()!=0)
        {
            for (Account a:accounts)
            {
                if(a.getId()==id)
                {
                    return a;
                }
            }
        }
        return account;
    }
    //deposit

    public void Depositeamount(int id,int amount)
    {
        i+=1;
        Account account=Searchaccount(id);
        if(account!=null)
        {
            int previousamount=account.getAmount();
            account.setAmount((previousamount+amount));
            System.out.println("Amount is Successfully Deposite");
            Transaction transaction=new Transaction(i,account.getId(),"Depositeamount",amount);
            addtransaction(transaction);
        }
        else
        {
            System.out.println("Account is not found");
        }

    }

    //Withdraw

    public void Withdrawamount(int id,int amount)
    {

        Account account=Searchaccount(id);
        if(account!=null)
        {
            int amount1=account.getAmount();
            if(amount<amount1)
            {
                i+=1;
                int previousamount=account.getAmount();
                account.setAmount((previousamount-amount));
                System.out.println("-------------------------");
                System.out.println("Amount is Successfully withdraw");
                System.out.println("----------------------------");
                Transaction transaction=new Transaction(i,account.getId(),"Withdrawamount",amount);
                addtransaction(transaction);
            }
            else
            {
                System.out.println("-------------------------");
                System.out.println("don't have enough money");
                System.out.println("-------------------------");
            }
        }
        else
        {
            System.out.println("Account is not found");
        }

    }

    //Send money
    public void Sendmoney(int id,int anotherid,int amount)
    {
        Account account1=Searchaccount(id);
        Account account2=Searchaccount(anotherid);
        if(account1!=null && account2!=null)
        {

            if(amount<account1.getAmount())
            {
                i+=1;
                account1.setAmount(account1.getAmount()-amount);
                account2.setAmount(account2.getAmount()+amount);
                System.out.println("-------------------------");
                System.out.println("Successfully Send the money");
                System.out.println("----------------------------");
                Transaction transaction=new Transaction(i,account2.getId(),"Sendmoney",amount);
                addtransaction(transaction);
            }
            else
            {
                System.out.println("-------------------------");
                System.out.println("don't have enough money");
                System.out.println("-------------------------");
            }


        }
        else
        {
            System.out.println("Account is not found");
        }
    }

    public void Showaccounts()
    {
      if(accounts.size()!=0)
      {
          for(Account a:accounts)
          {
              System.out.println("--------------------");
              a.Showdetailes();
              System.out.println("--------------------");
          }
      }
      else
      {
          System.out.println("No data added");
      }
    }

    public void Showtransaction()
    {
        if(transactions.size()!=0)
        {
            for(Transaction T:transactions)
            {
                System.out.println("-------------------");
                T.Showdetails();
                System.out.println("------------------");
            }
        }
        else
        {
            System.out.println("No data added");
        }
    }
}
