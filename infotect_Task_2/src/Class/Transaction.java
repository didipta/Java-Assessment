package Class;

public class Transaction {
    private int id;
    private int user_id;

    private int sender_id;
    private String type;
    private int amount;

    public Transaction(int id, int user_id, int sender_id, String type, int amount) {
        this.id = id;
        this.user_id = user_id;
        this.sender_id = sender_id;
        this.type = type;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void Showdetails()
    {
        System.out.println("id="+getId());
        System.out.println("User id="+getUser_id());
        System.out.println("Recevier id="+getSender_id());
        System.out.println("Transaction="+getType());
        System.out.println("Amount="+getAmount());
    }
}
