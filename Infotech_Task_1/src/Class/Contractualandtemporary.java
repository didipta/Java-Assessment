package Class;

import interfaces.Checker;

public class Contractualandtemporary extends Employee implements Checker {
    public Contractualandtemporary(int id, String name, int amount) {
        super(id, name, amount);
    }

    public Contractualandtemporary() {
    }

    @Override
    public double bonus(int amount) {
        return 0;
    }

    @Override
    public boolean providentfund() {
        return false;
    }
}
