abstract class BankAccount{
    abstract void deposit();
    abstract void withdraw();

    }
  class SavingAccount extends BankAccount{
             double min = 1000;
             double balance = 2000;
@Override
             void deposit(){
                 balance+=min;
                 System.out.println("Deposit Successfull"+" "+balance);
             }
             void withdraw(){
                 if(balance<min){
                     System.out.println("Withdrawl not allowed" +min);
                 }
                 else{
                     System.out.println("Withdrawl is allowed");
                 }
             }

    abstract class CurrentAccount extends BankAccount{
            double currentbalance = 3000;
            double overdraft = 5000;
            double withdraw=2000;
            @Override
            void withdraw(){
                if(currentbalance-withdraw<-overdraft){
                System.out.println("Withdraw from a current Balance" +withdraw);
            }
            else{
                System.out.println("Overdraft the limit" +overdraft);
            }

         }
    }

}
public class AbstracctionBankAccount {
    public static void main(String[] args) {
        BankAccount BA = new SavingAccount();
        BA.deposit();
        BA.withdraw();


      //  BankAccount BA=new CurrentAccount();


    }
}
