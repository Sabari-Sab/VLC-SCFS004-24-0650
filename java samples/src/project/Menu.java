package project;

import java.util.Scanner;

public class Menu {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        byte choice;
        Scanner opt = new Scanner(System.in);
        System.out.println("Choose from the options");
        System.out.println("---------------------");
        System.out.println("1. Open Account");
        System.out.println("2. View Accounts");
        System.out.println("3. View Account Details");
        System.out.println("4. Perform Transaction");
        System.out.println("5. Exit");
        choice = opt.nextByte();

        opt.close();

    }
}
