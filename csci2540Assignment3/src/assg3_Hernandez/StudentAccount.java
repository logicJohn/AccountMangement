package assg3_Hernandez;


/**
 * 
 * @author Johnnie Hernandez
 * @version assignment 3
 * This will be used to represent a student account.
 * Three actions can be performed to an account a deposit,
 * charge, and transfer.
 */
public class StudentAccount {
	
	private long acctNo; //Student Account Number
	private double balance; //Account balance
	private long acctCounter = 0; //Account Counter for total Student Accounts
	
	public StudentAccount () {
		this.balance = 0;
		this.acctNo = acctCounter;
		acctCounter++;
	}
	
	public StudentAccount (double balance) {
		this.balance = balance;
		this.acctNo = acctCounter;
		acctCounter++;
	}
	
	/**
	 * Gets the given students account number.
	 * @return Account number as long.
	 */
	public long getAcctNo () {
		return this.acctNo;
	}

	/**
	 * Gets the given students current balance.
	 * @return Account Balance as double.
	 */
	public double getBalance () {
		return this.balance;
	}
	
	/**
	 * Gets the given total accounts counter.
	 * @return Account Counter as long.
	 */
	public long getCounter () {
		return this.acctCounter;
	}
	
	/**
	 * Sets the students account balance to new balance.
	 * @param balance New student account balance.
	 */
	public void setBalance (double balance) {
		this.balance = balance;
	}
	
	/**
	 * Adds the depositedAmount to the student accounts current
	 * balance.  If the deposited amount is less than zero print a statement.
	 * @param depositedAmount Amount to be added to student account balance.
	 */
	public void deposit (double depositedAmount) {
		if (depositedAmount < 0) {
			System.out.println(" Warning: Negative amount depositied ");
		} else {
			this.balance += depositedAmount;
		}
	}
	
	/**
	 * Subtracts the chargedAmount from the student accounts current
	 * balance.  If the charged amount is less than zero print a statement.
	 * @param chargedAmount Amount to be charged to student account balance.
	 */
	public void charge (double chargedAmount) {
		if (chargedAmount < 0) {
			System.out.println(" Warning: Negative amount charged ");
		} else {
			this.balance -= chargedAmount;
		}
	}
	
	/**
	 * Transfers balance from another student account to this account.
	 * @param from Account where balance is transfered from.
	 * @param transferAmount Amount of balance to be transfered.
	 */
	public void transferIn (StudentAccount from, double transferAmount) {
		if (transferAmount < 0) {
			return;
		} else {
			this.balance += transferAmount;
			from.charge(transferAmount);
		}
	}
	
	/**
	 * Transfer balance to another student account from this account.
	 * @param to Account where balance is transfered from.
	 * @param transferAmount Amount of balance to be transfered.
	 */
	public void transferOut (StudentAccount to, double transferAmount) {
		if (transferAmount > 0) {
			return;
		} else {
			to.deposit(transferAmount);
			this.balance -= transferAmount;
		}
	}
	
	/**
	 * Print to console current Account number and Current balance.
	 */
	public void printInfo () {
		System.out.println("\n Account Number: " + this.acctNo);
		System.out.println("Current Balance: " + this.balance);
	}
	
	/**
	 * @return Returns the account number and current balance in formated string.
	 */
	@Override
	public String toString() {
		return "\n Account Number: " + this.acctNo + "\n Current Balance:" 
				+ this.balance + "\n";
	}
	
}
