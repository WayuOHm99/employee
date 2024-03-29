package employee;

import java.util.Scanner;

public class Command3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your id: ");
        int id = input.nextInt();
        System.out.print("Enter your income: ");
        double income = input.nextDouble();

        if (id > 100) {
            Worker worker = new Worker(id, income);
            worker.calculateBonus();
            System.out.printf("You are Worker, ID %d.\n", worker.getId());
            System.out.printf("If your income is %.2f, ", worker.getIncome());
            System.out.printf("you'll get %.2f Baht for Bonus!!\n", worker.getBonus());
        } else if (id > 0) {
            System.out.printf("You are Manager, ID %d.\n", id);
            Manager manager = new Manager(id, income);
            manager.calculateTax();
            System.out.printf("If your income is %.2f, ", manager.getIncome());
            System.out.printf("you need to pay %.2f Baht for Tax!!\n", manager.getTax());
        } else {
            System.out.println("Invalid ID " + id + "!!");
        }

        input.close();
    }
}
