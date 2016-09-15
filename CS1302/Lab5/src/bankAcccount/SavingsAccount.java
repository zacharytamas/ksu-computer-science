package bankAcccount;

/**
 * Created by zacharytamas on 9/15/16.
 */
public class SavingsAccount extends BankAccount {

    private double annualInterestRate;

    public SavingsAccount(String initialAccountId, double annualInterestRate) {
        super(initialAccountId);
        this.annualInterestRate = annualInterestRate;
    }

    public SavingsAccount(String initialAccountid, double initialBalance, double annualInterestRate) {
        super(initialAccountid, initialBalance);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void month_end_process() {
        double monthlyInterestRate = annualInterestRate / 12.0;
        double interestAcrued = getMinBalance() * monthlyInterestRate;
        deposit(interestAcrued);
        super.month_end_process();
    }
}
