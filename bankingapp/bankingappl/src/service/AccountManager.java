package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pojo.BankAccount;
import util.Utils;

public class AccountManager {

    static List<BankAccount> accList = new ArrayList<>();
    static int id = 0;
  //  static BankAccount bankAccount = new BankAccount();

    public static void createAccount(Scanner inp) {

        String name, nric;
        double deposit;
        

        System.out.println("Please Fill up the necessary fields to create an account : ");
        inp.nextLine();

        System.out.print("Enter the account holder name : ");
        name = inp.nextLine();
        System.out.print("Enter the account holder NRIC : ");
        nric = inp.nextLine();
        System.out.print("Enter the initial deposit amount : ");
        deposit = inp.nextDouble();
        id++;
        inp.nextLine();
    
        accList.add(new BankAccount(name,nric,deposit,id));
        
        System.out.println(Utils.ANSI_GREEN + "Your Account has been created successfully" + Utils.ANSI_GREEN);
    }

    public static void displayAccount(Scanner inp) {

        inp.nextLine();
        System.out.println("Enter acc holder name to view the account : ");
        String name = inp.nextLine();
        System.out.println(Utils.ANSI_CYAN + "=============== View Account Details =============" + Utils.ANSI_RESET);
        int index = -1;

        for(int i = 0; i < accList.size(); i++) {
           if(accList.get(i).getAccHolderName().equals(name)) {
                index = i;
                break;
            }
        }

        if(index != -1) {

            System.out.println(Utils.ANSI_GREEN + "Account Num : " + accList.get(index).getAccNum());
            System.out.println("Account Holder Name: " + accList.get(index).getAccHolderName());
            System.out.println("Account Holder NRIC: " + accList.get(index).getNRIC());
            System.out.println("Account Holder Balance: " + accList.get(index).getBalance() + Utils.ANSI_RESET);

            System.out.println(Utils.ANSI_CYAN + "==================================================" + Utils.ANSI_CYAN);

        } else {
        System.out.println(Utils.ANSI_YELLOW + " Account not found " + Utils.ANSI_RESET);

        System.out.println(Utils.ANSI_YELLOW + " Please enter the valid account name " + Utils.ANSI_RESET);

        System.out.println(Utils.ANSI_CYAN + "==================================================" + Utils.ANSI_CYAN);
        }

    }

    public static void displayAccountList() {

        if(accList.size() !=0) {

        System.out.println(Utils.ANSI_CYAN + "=============== View Account Details =============" + Utils.ANSI_RESET);
      
        for(BankAccount ba : accList) {

        System.out.println(Utils.ANSI_GREEN + "Account Num: " + ba.getAccNum());
        System.out.println("Account Holder Name: " + ba.getAccHolderName());
        System.out.println("Account Holder NRIC: " + ba.getNRIC());
        System.out.println("Account Holder Balance: " + ba.getBalance() + Utils.ANSI_RESET);
        System.out.println(Utils.ANSI_CYAN + "==================================================" + Utils.ANSI_RESET);

        }
    } else 
      System.out.println(Utils.ANSI_YELLOW+ "No accounts to display." + Utils.ANSI_YELLOW);
    }

    public static void removeAccount(Scanner inp) {

        inp.nextLine();
        System.out.println("Enter acc holder name to remove the account : ");
        String name = inp.nextLine();
        int index = -1;
       
        for(int i = 0; i < accList.size(); i++) {
           if(accList.get(i).getAccHolderName().equals(name)) {
                index = i;
                break;
            }
        }

        if(index != -1) {

            System.out.println(Utils.ANSI_CYAN + "The below account has been removed successfully." + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_GREEN + "Account Num " + accList.get(index).getAccNum());
            System.out.println("Account Holder Name " + accList.get(index).getAccHolderName() + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_CYAN + "============================================================" + Utils.ANSI_RESET);

            accList.remove(index);

        } else 
        System.out.println(Utils.ANSI_YELLOW + " Account not found " + Utils.ANSI_RESET);

    }

      public static void depositAmount(Scanner inp) {

        inp.nextLine();
        System.out.println("Enter acc holder name to deposit the amount : ");
        String name = inp.nextLine();
        System.out.println("Enter the amount to deposit : ");
        double amount = inp.nextDouble();
        for(int i = 0; i < accList.size(); i++) {
            if(accList.get(i).getAccHolderName().equals(name)) {
                accList.get(i).deposit(amount);
                System.out.println("The account Balance :" + accList.get(i).getBalance());
                 break;
             }
         }

       }

       public static void withdrawAmount(Scanner inp) {

        inp.nextLine();
        System.out.println("Enter acc holder name to withdraw the amount : ");
        String name = inp.nextLine();
        System.out.println("Enter the amount to withdraw : ");
        double amount = inp.nextDouble();
        for(int i = 0; i < accList.size(); i++) {
            if(accList.get(i).getAccHolderName().equals(name)) {
                accList.get(i).withdraw(amount);
                if(accList.get(i).getBalance() > 0){
                System.out.println("The account Balance :" + accList.get(i).getBalance());
                } else {
                    System.out.println("The account Balance : " + 0); 
                }
                 break;
             }
         }

       }

}
