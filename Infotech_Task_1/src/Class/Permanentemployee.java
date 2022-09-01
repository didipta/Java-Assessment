package Class;

import interfaces.Checker;

public class Permanentemployee extends Employee implements Checker {

    public Permanentemployee() {

    }

    public Permanentemployee(int id, String name, int amount) {
        super(id, name,amount);
    }

    @Override
    public double bonus(int amount) {
        this.setAmount(amount);
        return getAmount()*0.5;
    }

    @Override
    public boolean providentfund() {
        return true;
    }
}
