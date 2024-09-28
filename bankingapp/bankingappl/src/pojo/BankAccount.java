package pojo;
public class BankAccount {

   public String accNum;
   public String accHolderName;
   public String NRIC;
   public double initialDeposit;
   @Override
   public String toString() {
      return "BankAccount [accNum=" + accNum + ", accHolderName=" + accHolderName + ", NRIC=" + NRIC
            + ", initialDeposit=" + initialDeposit + "]";
   }

   

}
