package Oops.Encapsulation;
class BankAccount {
    private double balance;
    public int deposit;
    public int withdraw;



    public void getBalance(double balance) {
        this.balance = balance;
        System.out.println(this.balance);
    }

    public void deposit(int deposit) {
        this.deposit = deposit;
        deposit = (int) (balance + deposit);
        System.out.println(deposit);
    }

    public void withdraw(int withdraw) {
        this.withdraw = withdraw;
        if (balance >= withdraw) {
            balance -= withdraw;
            System.out.println(balance);
            ;
        } else {
            System.out.println("insufficient balance");

        }

    }

//    public int getAccountNumber(int accountNumber) {
//        return accountNumber;
//    }
}


public class BankAcc {
    public static void main(String[] args) {
        BankAccount BAcc=new BankAccount();
        BAcc.getBalance(5000);
        BAcc.withdraw(6000);
        BAcc.deposit(4000);

    }
}
