package classesandobjects.employee;

import java.util.Scanner;

public class SalesDepartment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Employees do you wish to add to Sales Department?");
        int count = scan.nextInt();
        scan.nextLine(); // Consume remaining newline character from count input

        Employee[] employees = new Employee[count]; // create the array to hold the employees
        // Create employee objects
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            employees[i].name = scan.nextLine();

            System.out.print("Age: ");
            employees[i].age = scan.nextInt();
            scan.nextLine(); // Consume remaining newline character from age input

            System.out.print("Salary: ");
            employees[i].salary = scan.nextDouble();
            scan.nextLine(); // Consume remaining newline character from salary input

            // Department is pre-assigned for this class and not captured from user
            employees[i].department = "Sales";

        }
        scan.close();

        // print the employee list of sales Department
        for (Employee employee : employees) {
            System.out.println(employee.name);
        }
    }
}
