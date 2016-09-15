package bankAcccount;

import java.awt.*;
import java.util.ArrayList;

public class Person {

	private String name;
	private String personId;
	private String e_mail;
	private ArrayList<BankAccount> accountsOwned;

	/**
	 * Initialize the properties of this object to the given parameter values.
	 * If a value is not known, use null.
	 */
	public Person(String name, String personId, String e_mail) {
		this.name = name;
		this.personId = personId;
		this.e_mail = e_mail;
        this.accountsOwned = new ArrayList<>();
	}
	
	public Person(String personId) {
		this.personId = personId;
        this.accountsOwned = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getPersonId() {
		return personId;
	}


	public ArrayList<BankAccount> getAccountsOwned() {
		return accountsOwned;
	}

	public boolean ownerOfAllAccountsOwned() {
        for (BankAccount account : accountsOwned) {
            if (account.getOwner() != this) {
                return false;
            }
        }
		return true;
	}

    public double totalBalanceOfAccountsOwned() {
        double balance = 0;
        for (BankAccount account : accountsOwned) {
            balance += account.getBalance();
        }
        return balance;
    }
}
