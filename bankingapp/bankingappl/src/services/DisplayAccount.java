package services;

import java.util.ArrayList;

import pojo.BankAccount;


public interface DisplayAccount {

    void displayAccount(BankAccount bankAccount, ArrayList<BankAccount> list);

    void displayAccountList(ArrayList<BankAccount> list);

}
