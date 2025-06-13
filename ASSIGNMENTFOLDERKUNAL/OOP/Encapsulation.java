class BankAccount{
    private double balance;
    public void deposite(double amount){
        balance+=amount;
    }
    public double getBalance(){
        return balance;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        myAccount.deposite(1234);
        System.out.println("The current balance is: $"+myAccount.getBalance());
    }
}
