package pojo;
public class BankAccount {

   private String accNum = "A000";
   private String accHolderName;
   private String NRIC;
   private double initialDeposit;
   private double balance;
   int accId;

   public BankAccount() {
   }

   public BankAccount(String accHolderName, String nRIC, double initialDeposit, int accId) {
      accNum += accId;
      this.accHolderName = accHolderName;
      NRIC = nRIC;
      this.initialDeposit = initialDeposit;
      if(initialDeposit > 0){
         balance += initialDeposit;
      }
   }

   public void deposit(double amount){
      this.balance += amount;
   }

   public void withdraw(double amount){
      this.balance -= amount;
   }


   public String getAccNum() {
      return accNum;
   }


   public void setAccNum(String accNum) {
      this.accNum = accNum;
   }


   public String getAccHolderName() {
      return accHolderName;
   }


   public void setAccHolderName(String accHolderName) {
      this.accHolderName = accHolderName;
   }


   public String getNRIC() {
      return NRIC;
   }


   public void setNRIC(String nRIC) {
      NRIC = nRIC;
   }


   public double getInitialDeposit() {
      return initialDeposit;
   }


   public void setInitialDeposit(double initialDeposit) {
      this.initialDeposit = initialDeposit;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   @Override
   public String toString() {
      return "BankAccount : accNum=" + accNum + ", accHolderName=" + accHolderName + ", NRIC=" + NRIC
            + ", initialDeposit=" + initialDeposit;
   }

   

}
