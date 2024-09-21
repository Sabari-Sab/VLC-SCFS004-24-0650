package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /* Scanner class which is in the java.util package */
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Welcome! " + name);
    }
}
