package myapp;
import util.Options;
import util.Utils;


public class App {

   public static void menu(){
        System.out.println();
        System.out.println(Utils.ANSI_BLUE + "Choose from the options" + Utils.ANSI_RESET);
        System.out.println("---------------------");
        System.out.println(Utils.ANSI_GREEN + "1. Create a new account");
        System.out.println("2. List all accounts");
        System.out.println("3. View Account Details");
        System.out.println("4. Delete an account");
        System.out.println("5. Deposit");
        System.out.println("6. Withdraw");
        System.out.println("7. Exit" + Utils.ANSI_RESET);
       
    }
    public static void main(String[] args) {
        Options.executeOptions();
    }
}
