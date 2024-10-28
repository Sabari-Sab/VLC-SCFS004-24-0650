package service;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import pojo.AccountType;
import pojo.BankAccount;
import util.Utils;

public class AccountManager {

    static Map<String,BankAccount> accList = new HashMap<>();
    static int seq = 0;

    public static void createAccount(Scanner inp) {

        String name, nric;
        double deposit;
        byte choice;
        AccountType acc = null;
        System.out.println();
        System.out.println(Utils.ANSI_YELLOW + "**************** Account Creation *****************");
        System.out.println();
        System.out.println("Please Fill up the necessary fields to create an account : ");
        inp.nextLine();

        System.out.print("Enter the account holder name : ");
        name = inp.nextLine();
        System.out.print("Enter the account holder NRIC : ");
        nric = inp.nextLine();
        System.out.print("Choose the account Type from below : ");
        System.out.println();
        System.out.println("1. Savings");
        System.out.println("2. Current");
        System.out.println("3. Special");
        System.out.println("4. NRI");
        choice = inp.nextByte();
        switch(choice){
            case 1:
            acc = AccountType.SAVINGS;
            break;
            case 2:
            acc = AccountType.CURRENT;
            break;
            case 3:
            acc = AccountType.SPECIAL;
            break;
            case 4:
            acc = AccountType.NRI;
            break;
        }

        System.out.print("Enter the initial deposit amount : ");
        inp.nextLine();
        deposit = inp.nextDouble();
        seq++;
        inp.nextLine();

        BankAccount ba = new BankAccount(name,nric,deposit,seq,acc);
    
        accList.put(ba.getAccNum(),ba);

        
        System.out.println();
        System.out.println(Utils.ANSI_GREEN + "Your Account has been created successfully" + Utils.ANSI_RESET);
        System.out.println();
        System.out.println(Utils.ANSI_YELLOW + "**************** Account Creation *****************" + Utils.ANSI_RESET);
    }

    public static void displayAccount(Scanner inp) {

        inp.nextLine();
        System.out.println();
        System.out.println(Utils.ANSI_YELLOW + "Enter acc number to view the account : " +Utils.ANSI_RESET);
        String accNum = inp.nextLine();
        BankAccount ba = accList.get(accNum);
        System.out.println();
        System.out.println(Utils.ANSI_YELLOW + "Checking if account exists ... " + Utils.ANSI_RESET);
        if(ba != null) {
            System.out.println();
            System.out.println(Utils.ANSI_GREEN + "Account exists. Fetching account details." + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_CYAN + "=============== View Account Details =============" + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_GREEN + "Account Num : " + ba.getAccNum());
            System.out.println("Account Holder Name: " + ba.getAccHolderName());
            System.out.println("Account Holder NRIC: " + ba.getNRIC());
            System.out.println("Account type : " + ba.getAcc());
            System.out.println("Account Holder Balance: " + ba.getBalance() + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_CYAN + "==================================================" + Utils.ANSI_CYAN);

        } else {
        System.out.println(Utils.ANSI_YELLOW + "Account not found " + Utils.ANSI_RESET);
        System.out.println(Utils.ANSI_YELLOW + "Please enter the valid Account Number " + Utils.ANSI_RESET);
        }

    }

    public static void displayAccountList() {

        if(accList.size() !=0) {
       
        System.out.println(Utils.ANSI_CYAN + "=============== View Account Details =============" + Utils.ANSI_RESET);
      
        for(Map.Entry<String,BankAccount> ba : accList.entrySet()) {

        System.out.println();
        System.out.println(Utils.ANSI_GREEN + "Account Num: " + ba.getValue().getAccNum());
        System.out.println("Account Holder Name: " + ba.getValue().getAccHolderName());
        System.out.println("Account Holder NRIC: " + ba.getValue().getNRIC());
        System.out.println("Account type : " + ba.getValue().getAcc());
        System.out.println("Account Holder Balance: " + ba.getValue().getBalance() + Utils.ANSI_RESET);
        System.out.println();
        System.out.println(Utils.ANSI_CYAN + "==================================================" + Utils.ANSI_RESET);

        }
    } else 
      System.out.println(Utils.ANSI_YELLOW+ "No accounts to display." + Utils.ANSI_RESET);
    }

    public static void removeAccount(Scanner inp) {

        inp.nextLine();
        System.out.println(Utils.ANSI_YELLOW + "Enter acc holder Number to remove the account : ");
        String accNum = inp.nextLine();
        String choice;
        System.out.println();
        System.out.println("Checking if account exists.. ");
        BankAccount ba = accList.remove(accNum);

        if(ba != null) {
            System.out.println();
            System.out.println("The account exists.. Checking for account balance to be drawn before account closure.");
            System.out.println();
            System.out.println("Remaining balance of the account :" + ba.getBalance());
            if(ba.getBalance() > 0) {
            System.out.println("Please enter (yes/no) to withdraw the amount now." + Utils.ANSI_RESET);
            choice = inp.next();
            if(choice.equalsIgnoreCase("yes")) {
            System.out.println();
            System.out.println(Utils.ANSI_CYAN + "The below account has been removed and the amount " + ba.getBalance() + " has been drawn successfully." + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_GREEN + "Account Num " + ba.getAccNum());
            System.out.println(Utils.ANSI_GREEN + "Account Type " + ba.getAcc());
            System.out.println("Account Holder Name " + ba.getAccHolderName() + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_CYAN + "============================================================" + Utils.ANSI_RESET);
            } else {
            System.out.println(Utils.ANSI_CYAN + "The below account has been removed successfully." + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_GREEN + "Account Num " + ba.getAccNum());
            System.out.println(Utils.ANSI_GREEN + "Account Type " + ba.getAcc());
            System.out.println("Account Holder Name " + ba.getAccHolderName() + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_CYAN + "============================================================" + Utils.ANSI_RESET);   
            }
            } else {
            System.out.println(Utils.ANSI_CYAN + "The below account has been removed successfully." + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_GREEN + "Account Num " + ba.getAccNum());
            System.out.println(Utils.ANSI_GREEN + "Account Type " + ba.getAcc());
            System.out.println("Account Holder Name " + ba.getAccHolderName() + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_CYAN + "============================================================" + Utils.ANSI_RESET);   
            }
        } else { 
        System.out.println(Utils.ANSI_YELLOW + "Account not found.  Please try again" + Utils.ANSI_RESET);
        }
    }

      public static void depositAmount(Scanner inp) {

        inp.nextLine();
        System.out.println(Utils.ANSI_YELLOW + "Enter acc holder Number to deposit the amount : ");
        String accNum = inp.nextLine();
        System.out.println("Enter the amount to deposit : " + Utils.ANSI_RESET);
        double amount = inp.nextDouble();
        BankAccount ba = accList.get(accNum);
        if(ba != null){
        if(amount > 0) {
        ba.deposit(amount);
        System.out.println();
        System.out.println(Utils.ANSI_GREEN + "The amount " + amount + " has been deposited successfully..");
        System.out.println("Your new Balance is : " + ba.getBalance() + Utils.ANSI_RESET);
        } else {
            System.out.println(Utils.ANSI_YELLOW + "Entered amount input may be negative or invalid. Please enter the valid input." + Utils.ANSI_RESET);
        }
       } else {
            System.out.println(Utils.ANSI_YELLOW + "Entered acc number input may be invalid or does not exist. Please try again." + Utils.ANSI_RESET);
       }
       }

       public static void withdrawAmount(Scanner inp) {

        inp.nextLine();
        System.out.println("Enter acc holder number to withdraw the amount : ");
        String accNum = inp.nextLine();
        System.out.println("Enter the amount to withdraw : ");
        double amount = inp.nextDouble();
        
        BankAccount ba = accList.get(accNum);
        if(ba != null){
        if(amount > 0){
        if(ba.getBalance() >= amount){
        ba.withdraw(amount);
        System.out.println();
        System.out.println(Utils.ANSI_GREEN + "The amount " + amount + " has been withdrawn successfully..");
        System.out.println("Your new Balance is : " + ba.getBalance() + Utils.ANSI_RESET);
        } else {
            System.out.println(Utils.ANSI_YELLOW + "Insufficient acc balance. Please enter sufficient amount to withraw.");
            System.out.println("Your current account balance :" + ba.getBalance() + Utils.ANSI_RESET);
        }
        }
        else {
            System.out.println(Utils.ANSI_YELLOW + "Entered amount input may be negative or invalid. Please enter the valid input." + Utils.ANSI_RESET);
        }
       } else {
        System.out.println(Utils.ANSI_YELLOW + "Entered acc number input may be invalid or does not exist. Please try again." + Utils.ANSI_RESET);
       }  
       }

}
