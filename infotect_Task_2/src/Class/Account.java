package Class;

public class Account {
    private int id;
    private String name;
    private int amount;
    private String Password;

    public Account(int id, String name, int amount, String password) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        Password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void Showdetailes()
    {
        System.out.println("id="+getId());
        System.out.println("Name="+getName());
        System.out.println("Amount="+getAmount());
    }
}
