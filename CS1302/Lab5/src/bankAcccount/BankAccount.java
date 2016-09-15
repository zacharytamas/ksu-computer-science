package bankAcccount;

/**
 * Created by Ben on 8/11/2015.
 */
public class BankAccount {

    private double balance;  // account balance
    private String accountId;  // unique account identifier
    private Person owner;  // owner of the account
    private double minBalance;



    /**
     * Initializes the account id to the parameter value and initializes
     * the balance to 0.
     * The owner of the account is set to null.
     *
     * @param initialAccountId  Should be a valid account id. (can't check it at this time)
     */
    public BankAccount(String initialAccountId) {
        accountId = initialAccountId;
        balance = 0.0;  // not necessary since balance will default to 0.0 if nothing else is done
                        // to initialize it.
        resetMinBalance();
    }

    /**
     * Initializes the account id and balance from the parameter values.
     * The owneer of the account is set to null;
     *
     * @param initialAccountId  Should be a valid account id. (can't check it at this time)
     * @param initialBalance  Should be positive
     */
    public BankAccount(String initialAccountId, double initialBalance) {
        accountId = initialAccountId;
        if(initialBalance <= 0) {
            // error
            System.err.println("Initial balance for an account should be positive: " + initialBalance);
            System.exit(1);
        } else {
            balance = initialBalance;
        }
        resetMinBalance();
    }

    public BankAccount(String initialAccountid, double initialBalance, Person initialOwner) {
        accountId = initialAccountid;
        owner = initialOwner;
        if(initialBalance <= 0) {
            // error
            System.err.println("Initial balance for an account should be positive: " + initialBalance);
            System.exit(1);
        } else {
            balance = initialBalance;
        }
        resetMinBalance();
    }





    public String getAccountId() {
        return accountId;
    }


    public double getBalance() {
        return balance;
    }

    /**
     * Deposit the given amount in this bank account.
     * This will add amount to the balance.
     *
     * @param amount Should be a positive number, that is, greater than 0
     */
    public void deposit(double amount) {
        if(amount > 0) {
            // go ahead and process the deposit
            balance += amount;
        } else {
            // report an error
            System.err.println("Amount of deposit should be positive: " + amount);
            System.exit(1);
        }
        updateMinBalance();
    }


    /**
     * Withdraw the given amount from this bank account.
     * The amount will be deducted from the account balance.
     *
     * @param amount  Should be a positive value.
     *                Should be no bigger than the current balance.
     */
    public void withdraw(double amount) {
        if(amount <= 0) {
            // error: amount should be positive
            System.err.println("Amount of withdrawal should be positive: " + amount);
            System.exit(1);
        } else if(amount > balance) {
            // error: amount should be no bigger than the balance
            System.err.println("Amount of withdrawal should be no bigger than the balance: " + amount + " " + balance);
            System.exit(1);
        } else {
            // amount  is ok, process the withdrawal
            balance -= amount;
        }
        updateMinBalance();
    }

    public void setOwner(Person newOwner) {
        owner = newOwner;
    }

    public Person getOwner() {
        return owner;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public void resetMinBalance() {
        this.minBalance = this.balance;
    }

    private void updateMinBalance() {
        if (this.minBalance > this.balance) {
            this.resetMinBalance();
        }
    }
}
