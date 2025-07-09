package Task_3.Interface;

import java.util.Scanner;

public class mainMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee Input
        System.out.println("Enter Employee ID, Name, Salary:");
        int empId = sc.nextInt();
        sc.nextLine();
        String empName = sc.nextLine();
        double salary = sc.nextDouble();
        Employee emp = new Employee(empId, empName, salary);
        emp.calcTax();

        // Product Input
        System.out.println("\nEnter Product ID, Price, Quantity:");
        int pid = sc.nextInt();
        double price = sc.nextDouble();
        int qty = sc.nextInt();
        Product prod = new Product(pid, price, qty);
        prod.calcTax();
    }
}
