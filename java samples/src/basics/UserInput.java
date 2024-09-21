package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /* Scanner class which is in the java.util package */
        String name, prof;
        byte age;
        int sal;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        sal = scan.nextInt(); // scanning for int type
        scan.nextLine();
        System.out.print("Enter your name: ");
        name = scan.nextLine(); // scanning a line of text
        System.out.print("Enter your age: ");
        age = scan.nextByte(); // scanning for byte type
        System.out.print("Enter your Profession: ");
        prof = scan.next(); // scanning for String type (one word)

        System.out.println("Welcome! " + name + " you are " + age + " years old " + " and earn a salary of " + sal
                + " working as " + prof);
        scan.close();
    }
}
