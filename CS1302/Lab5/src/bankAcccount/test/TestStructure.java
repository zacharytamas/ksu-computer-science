package bankAcccount.test;






import bankAcccount.BankAccount;
import bankAcccount.Person;
import bankAcccount.SavingsAccount;
import org.junit.Test;


/**
 * This tests whether the class Person has the right fields and methods.
 * 
 * @author Ben Setzer
 *
 */
public class TestStructure {



    @Test
    public  void testFields() {
        Tests.countFields(BankAccount.class, 4);
        Tests.countFields(SavingsAccount.class, 1);
        Tests.countFields(Person.class, 4);
    }

    @Test
    public  void testConstructors() {
        Tests.countConstructors(BankAccount.class, 3);
        Tests.countConstructors(SavingsAccount.class, 2);
        Tests.countConstructors(Person.class, 2);
    }

//    @Test
//    public  void testMethods() {
//        //Tests.countMethods(BankAccount.class, 3);
//    }

	

}