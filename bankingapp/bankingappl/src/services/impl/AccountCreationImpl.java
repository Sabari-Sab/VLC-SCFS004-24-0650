// package services.impl;

// import java.util.InputMismatchException;
// import java.util.Scanner;

// import model.BankAccountModel;
// import pojo.BankAccount;
// import services.AccountCreation;

// public class AccountCreationImpl implements AccountCreation{

//     @Override
//     public BankAccount createAccount(BankAccountModel bankAccountModel) {
        
//         BankAccount ba = new BankAccount();
//         ba.accNum = bankAccountModel.accNum;
//         ba.accHolderName = bankAccountModel.accHolderName;
//         ba.NRIC = bankAccountModel.NRIC;
//         ba.initialDeposit = bankAccountModel.initialDeposit;

//          System.out.println("Your Account has been created successfully");
//          return ba;
//     }

//     @Override
//     public BankAccountModel getBankAccountModel(Scanner sc, BankAccountModel bankAccountModel) throws InputMismatchException {
        
//         System.out.println("Please Fill up the necessary fields to create an account : ");
//         sc.nextLine();
        
//         System.out.print("Enter the account holder name : ");
//         bankAccountModel.accHolderName = sc.nextLine();
//         System.out.print("Enter the account holder NRIC : ");
//         bankAccountModel.NRIC = sc.nextLine();
//         System.out.print("Enter the initial deposit amount : ");
//         bankAccountModel.initialDeposit = sc.nextDouble();
//         sc.nextLine();

//         return bankAccountModel;
    
//     }


    

// }
