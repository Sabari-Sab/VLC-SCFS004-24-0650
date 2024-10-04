package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pojo.BankAccount;

public class AccountManager {

    static List<BankAccount> accList = new ArrayList<>();
    static int id = 0;

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
        
        System.out.println("Your Account has been created successfully");
    }

    public static void displayAccount(Scanner inp) {

        inp.nextLine();
        System.out.println("Enter acc holder name to view the account : ");
        String name = inp.nextLine();
        System.out.println("=============== View Account Details =============");
        int index = -1;
       
        for(int i = 0; i < accList.size(); i++) {
           if(accList.get(i).getAccHolderName().equals(name)) {
                index = i;
                break;
            }
        }

        if(index != -1) {

            System.out.println("Account Num " + accList.get(index).getAccNum());
            System.out.println("Account Holder Name " + accList.get(index).getAccHolderName());
            System.out.println("Account Holder NRIC " + accList.get(index).getNRIC());
            System.out.println("Account Holder Balance " + accList.get(index).getInitialDeposit());

            System.out.println("===================================================");

        } else 
        System.out.println(" Account not found ");

    }

    public static void displayAccountList() {

        if(accList.size() !=0) {

        System.out.println("=============== View Account Details =============");
      
        for(BankAccount ba : accList) {

        System.out.println("Account Num " + ba.getAccNum());
        System.out.println("Account Holder Name " + ba.getAccHolderName());
        System.out.println("Account Holder NRIC " + ba.getNRIC());
        System.out.println("Account Holder Balance " + ba.getInitialDeposit());
        System.out.println("===================================================");

        }
    } else 
      System.out.println("No accounts to display.");
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

            System.out.println("The below account has been removed successfully. ");
            System.out.println("Account Num " + accList.get(index).getAccNum());
            System.out.println("Account Holder Name " + accList.get(index).getAccHolderName());
            System.out.println("============================================================");

            accList.remove(index);

        } else 
        System.out.println(" Account not found ");

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
