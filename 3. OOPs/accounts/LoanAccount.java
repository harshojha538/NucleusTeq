package accounts;

public class LoanAccount extends Account {

    private float loanAmount;
    private float emiAmount;

    public LoanAccount(String accountNo, String name, String address, String phoneNo, String dob, float balance, float loanAmount, float emiAmount) {
        super(accountNo, name, address, phoneNo, dob, balance);
        this.loanAmount = loanAmount;
        this.emiAmount = emiAmount;
    }

    public void payEMI() {
        if (getBalance() >= emiAmount) {
            setBalance(getBalance() - emiAmount);
            System.out.println("EMI of " + emiAmount + " paid for account " );
        } else {
            System.out.println("Insufficient balance to pay EMI for account " );
        }
    }

    public void topUpLoan(float amount) {
        loanAmount += amount;
        setBalance(getBalance() + amount);
        System.out.println("Loan amount topped up by " + amount );
    }

    public void repayment(float amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            loanAmount -= amount;
            System.out.println("Loan repayment of " + amount );
        } else {
            System.out.println("Insufficient balance for loan repayment ");
        }
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public float getEmiAmount() {
        return emiAmount;
    }

    public void setEmiAmount(float emiAmount) {
        this.emiAmount = emiAmount;
    }
}
