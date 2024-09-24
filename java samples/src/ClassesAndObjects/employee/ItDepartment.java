package classesandobjects.employee;

import java.util.Scanner;

public class ItDepartment {
    String department = "IT";

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Scanner scan = new Scanner(System.in);
        employees[0] = new Employee();
        employees[0] = new Employee();
        employees[0] = new Employee();
        employees[0] = new Employee();
        employees[0] = new Employee();

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

            // Department can be pre-assigned or user input can be added here if needed
            employees[i].department = department; // Replace with desired department or prompt for user input
        }

    }
}
