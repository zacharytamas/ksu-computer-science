package bankAcccount.test;


import bankAcccount.BankAccount;
import bankAcccount.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by Ben on 8/29/2015.
 */
public class TestOwnershipTest {



    private final static double EPS = 1e-10;

    private Person p1, p2, p3;
    private BankAccount ba1_1, ba1_2, ba1_3, ba2_1, ba2_2;


    @Before
    public void init() {
        p1 = new Person("id001");
        p2 = new Person("id002");
        p3 = new Person("id003");

        ba1_1 = new BankAccount("act001", 100);
        ba1_2 = new BankAccount("act001", 200);
        ba1_3 = new BankAccount("act001", 300);
        ba2_1 = new BankAccount("act001", 400);
        ba2_2 = new BankAccount("act001", 500);

        ba1_1.setOwner(p1);
        ba1_2.setOwner(p1);
        ba1_3.setOwner(p1);

        p1.getAccountsOwned().add(ba1_1);
        p1.getAccountsOwned().add(ba1_2);
        p1.getAccountsOwned().add(ba1_3);

        p2.getAccountsOwned().add(ba2_1);
        p2.getAccountsOwned().add(ba2_2);
        p2.getAccountsOwned().add(ba1_3);
    }

    @Test
    public void test_ownership1() {
        // Ownership is consistent
        assertTrue(p1.ownerOfAllAccountsOwned());
    }

    @Test
    public void test_ownership2() {
        // Ownership is not consistent
        assertFalse(p2.ownerOfAllAccountsOwned());
    }


    @Test
    public void test_ownership3() {
        // Ownership is consistent even when there are no accounts owned
        assertTrue(p1.ownerOfAllAccountsOwned());
    }


}




