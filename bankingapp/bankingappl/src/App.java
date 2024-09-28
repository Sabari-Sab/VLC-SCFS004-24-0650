import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.BankAccountModel;
import pojo.BankAccount;
import services.AccountCreation;
import services.DisplayAccount;
import services.impl.AccountCreationImpl;
import services.impl.DisplayAccountImpl;


public class App {

    static void menu(){
        System.out.println("Choose from the options");
        System.out.println("---------------------");
        System.out.println("1. Create a new account");
        System.out.println("2. List all accounts");
        System.out.println("3. View Account Details");
        System.out.println("4. Delete an account");
        System.out.println("5. Deposit");
        System.out.println("6. Withdraw");
        System.out.println("7. Exit");
       
    }
    public static void main(String[] args) throws Exception {

        AccountCreation ac = new AccountCreationImpl();
        DisplayAccount da = new DisplayAccountImpl();
        int accID = 0;
        boolean validInput = false;

        
        Scanner scan = new Scanner(System.in);
        byte choice;
        menu();
        
        BankAccount ba = new BankAccount();
        BankAccountModel bam = new BankAccountModel();
        ArrayList<BankAccount> list = new ArrayList();
       while(!validInput) {  
        try {
        choice = scan.nextByte();
        while(choice != 7){
        switch(choice){
            case 0:
            menu();
            break;
            case 1:
            accID++;
            bam.accNum = "A000" + "" + accID;
            bam = ac.getBankAccountModel(scan, bam);
            ba = ac.createAccount(bam);
            list.add(ba);
            System.out.println("Please enter 0 for main menu or 7 to exit the app.");
            break;
            case 2:
            da.displayAccountList(list);
            System.out.println("Please enter 0 for main menu or 7 to exit the app.");
            break;
            case 3:
            System.out.println("Enter the Account holder name to view the account: ");
            scan.nextLine();
            ba.accHolderName = scan.nextLine();
            da.displayAccount(ba, list);
            System.out.println("Please enter 0 for main menu or 7 to exit the app.");
            break;

        }
        choice = scan.nextByte();
       // scan.nextLine();
            if(choice == 7){
                break;
            }
        validInput = true;   
        }
        } catch(InputMismatchException ie) {
            System.out.println("Entered input is invalid, please try again");
            scan.nextLine();
            menu();
            choice = 0;
        }
    }
        scan.close();
    }
}
