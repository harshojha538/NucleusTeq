package accounts;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNo, String name, String address, String phoneNo, String dob, float balance) {
        super(accountNo, name, address, phoneNo, dob, balance);
    }

    public void withdraw(float amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn " + amount + "Remaining Balance is " + getBalance());
        } else {
            System.out.println("Insufficient balance" );
        }
    }

    public void deposit(float amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + " into account ");
    }

    public void fixedDeposit(float amount, int years) {
        System.out.println("Fixed deposit of " + amount + " for " + years );
    }
}
