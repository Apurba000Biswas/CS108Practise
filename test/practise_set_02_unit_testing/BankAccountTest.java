package practise_set_02_unit_testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BankAccountTest {
	
	

	@Test(expected = NegativeAmountException.class)
	public void testBankAccountCreation() throws Exception {
		BankAccount acc = new BankAccount(-50);
	}
	
	@Test
	public void testBankAccountCreationInitialAmount() throws Exception {
		int initialBalance = 50;
		BankAccount bankAccount = new BankAccount(initialBalance);
		
		assertEquals(initialBalance, bankAccount.getBalance());
	}
	
	@Test
	public void testDeposite() throws Exception {
		BankAccount acc = new BankAccount();
		int depositeAmount = 120;
		acc.deposite(depositeAmount);
		
		assertEquals(depositeAmount, acc.getBalance());
	}
	
	@Test(expected = NegativeAmountException.class)
	public void testNegativeDepositeAmount() throws Exception {
		BankAccount acc = new BankAccount(-50);
		int depositeAmount = -120;
		
		acc.deposite(depositeAmount);
	}
	
	@Test
	public void testWithdraw() throws Exception {
		int initialBalance = 250;
		
		BankAccount acc = new BankAccount(initialBalance);
		acc.withdraw(200);
		
		assertEquals(50, acc.getBalance());
	}
	
	@Test(expected = NegativeAmountException.class)
	public void testNegativeWithdraw() throws Exception {
		BankAccount acc = new BankAccount();
		int withdrawAmount = -120;
		acc.withdraw(withdrawAmount);
	}
	
	@Test(expected = NotSufficientBalanceException.class)
	public void testInsufficientBalance() throws Exception {
		BankAccount acc = new BankAccount();
		int withdrawAmount = 120;
		acc.withdraw(withdrawAmount);
	}
	
}
