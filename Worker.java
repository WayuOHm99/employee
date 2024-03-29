package employee;

public class Worker {
    private int id;
    private double income;
    private double bonus;

    public Worker(int id, double income) {
        this.id = id;
        this.income = income;
    }

    public void calculateBonus() {
        bonus = income * 4;
    }

    public int getId() {
        return id;
    }

    public double getIncome() {
        return income;
    }

    public double getBonus() {
        return bonus;
    }
}
