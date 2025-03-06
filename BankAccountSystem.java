/*Bank Account System (Encapsulation)
Create a class BankAccount with:
Private attributes: accountNumber, holderName, balance
Constructor to initialize these values
Methods:
deposit(double amount): Adds money to balance.
withdraw(double amount): Deducts money from balance (only if sufficient funds).
displayBalance(): Displays account details.
In the main() method:
Create a BankAccount object.
Deposit and withdraw some money.
Display the final balance.
 */


class BankAccount{
    private int accountNumber;
    private String holderName;
    private double balance;
    
    BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    
    public void deposit(double amount){
        balance=balance+amount;
        System.out.printf("Deposite Amount %.3f",amount);
        System.out.println();
    }
    public void withdraw(double amount){
        if(balance<amount){
            System.out.println("Insufficient Funds for Withdrawal!");
        }
        else{
            balance-=amount;
            System.out.printf("Withdrew Amount: %.3f\n", amount);
        }
    }
    public void displayBalance(){
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Name: "+holderName);
        System.out.printf("Remaining Balace: %.3f\n",balance);
    }
}

public class BankAccountSystem{
    
    public static void main(String[] args){
        BankAccount b=new BankAccount(1234, "Rabs Karki", 10000.33);
        b.deposit(123.45);
        b.withdraw(22345.67);
        b.displayBalance();
    }
}