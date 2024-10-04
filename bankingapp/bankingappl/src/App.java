import java.util.InputMismatchException;
import java.util.Scanner;
import util.AccountManager;


public class App {

    static byte choice;

   public static void menu(){
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

        boolean validInput = true; 
        Scanner scan = new Scanner(System.in);
        
        menu();
        
        while(validInput) {  
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
            
            menu(); 
            choice = scan.nextByte();
        }
        } catch(InputMismatchException ie) {
            System.out.println("Entered input is invalid, please try again");
            scan.nextLine();
            menu();
        }
        if(choice == 7)
                break;    
        }
        scan.close();
    }
}
