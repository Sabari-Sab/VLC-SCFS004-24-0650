package services;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.BankAccountModel;
import pojo.BankAccount;


public interface AccountCreation {

    BankAccount createAccount(BankAccountModel bankAccountModel);
    
    BankAccountModel getBankAccountModel(Scanner sc, BankAccountModel bankAccountModel) throws InputMismatchException;
    

}
