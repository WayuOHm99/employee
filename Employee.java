package employee;

public class Employee {
    protected int id;
    protected double income;

    public Employee(int id, double income) {
        this.id = id;
        this.income = income;
    }

    public int getId() {
        return id;
    }

    public double getIncome() {
        return income;
    }
}
