package employee;

public class Manager {
    private int id;
    private double income;
    private double tax;

    public Manager(int id, double income) {
        this.id = id;
        this.income = income;
    }

    public void calculateTax() {
        if (income > 50000) {
            tax = 0.04 * income;
        } else {
            tax = 0.03 * income;
        }
    }

    public int getId() {
        return id;
    }

    public double getIncome() {
        return income;
    }

    public double getTax() {
        return tax;
    }
}
