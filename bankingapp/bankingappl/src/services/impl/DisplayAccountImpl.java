// package services.impl;
// import java.util.ArrayList;

// import pojo.BankAccount;
// import services.DisplayAccount;

// public class DisplayAccountImpl implements DisplayAccount {

//     @Override
//     public void displayAccount(BankAccount bankAccount, ArrayList<BankAccount> list) {

//         System.out.println("=============== View Account Details =============");

//         int index = -1;
       
//         for(int i = 0; i < list.size(); i++) {
//            if(list.get(i).accHolderName.equals(bankAccount.accHolderName)) {
//                 index = i;
//                 break;
//             }
//         }

//         if(index != -1) {

//             System.out.println("Account Num " + list.get(index).accNum);
//             System.out.println("Account Holder Name " + list.get(index).accHolderName);
//             System.out.println("Account Holder NRIC " + list.get(index).NRIC);
//             System.out.println("Account Holder Balance " + list.get(index).initialDeposit);
//             System.out.println("===================================================");

//         } else {

//             System.out.println(" Account not found ");
//         }

//     }

//     @Override
//     public void displayAccountList(ArrayList<BankAccount> list) {

//         if(list.size() !=0) {

//         System.out.println("=============== View Account Details =============");
      
//         for(BankAccount ba : list) {

//         System.out.println("Account Num " + ba.accNum);
//         System.out.println("Account Holder Name " + ba.accHolderName);
//         System.out.println("Account Holder NRIC " + ba.NRIC);
//         System.out.println("Account Holder Balance " + ba.initialDeposit);
//         System.out.println("===================================================");

//         }
//     } else {

//         System.out.println("No accounts to display.");
//     }

//     }



// }
