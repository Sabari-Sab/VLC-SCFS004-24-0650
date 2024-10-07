package util;

import java.util.InputMismatchException;
import java.util.Scanner;

import myapp.App;
import service.AccountManager;

public class Options {

    static byte choice;

    public static void executeOptions(){
    
        Scanner scan = new Scanner(System.in);
        App.menu();
        
        while(true) {  
        try {
        choice = scan.nextByte();
        while(choice != 7){
        switch(choice){
            case 1:
            AccountManager.createAccount(scan);
            break;
            case 2:
            AccountManager.displayAccountList();
            break;
            case 3:
            AccountManager.displayAccount(scan);
            break;
            case 4:
            AccountManager.removeAccount(scan);
            break;
            case 5:
            AccountManager.depositAmount(scan);
            break;
            case 6:
            AccountManager.withdrawAmount(scan);
            break;

        }
            if(choice == 7)
                break;
            
            App.menu(); 
            choice = scan.nextByte();
        }
        } catch(InputMismatchException ie) {
            System.out.println(Utils.ANSI_RED + "Entered input is invalid, please try again" + Utils.ANSI_RESET);
            System.out.println();
            scan.nextLine();
            App.menu();
        }
        if(choice == 7)
                break;    
        }
        scan.close();
    }

}
