package assg3_Hernandez;

/**
 * 
 * @author Johnnie Hernandez
 * @version assignment 3
 * 
 * Rewards Account is a child of Students account
 * in order to track rewards offered to each account
 * This will be defined as a student reward account.
 */
public class RewardsAccount extends StudentAccount {

	private double rewards;
	
	public RewardsAccount () {
		super();
		this.rewards = 0;
	}
	
	public RewardsAccount (double balance) {
		super(balance);
		if (balance >= 100) {
			this.rewards = 5;
		} else {
			this.rewards = 0;
		}
	}
	
	/**
	 * Gets the current rewards balance from student reward account.
	 * @return Rewards of student reward account as a double.
	 */
	public double getRewards () {
		return this.rewards;
	}
	
	/**
	 * Checks the student rewards accounts current rewards value.  If greater
	 * then $25 then deposit the rewards into account then set rewards to 0.
	 */
	public void redeemRewards () {
		if (this.rewards > 25.00) {
			this.deposit(this.rewards);
			this.rewards = 0;
		} else {
			System.out.println("\n insufficent amount for redeeming rewards. "
					+ "Rewards must be at least $25");
		}
	}

	/**
	 * This method gets a formated String with the Account Number, Current Balance,
	 * and Rewards balance of student rewards account.
	 * @return Formated String of student rewards account.
	 */
	@Override
	public String toString () {
		return "\nAccount Number: " + this.getAcctNo() + "\nCurrent Balance:" 
				+ this.getBalance() + "\n Rewards Balance:" + this.rewards + "\n";
	}
	
	/**
	 * Adds a given balance to the student rewards account.
	 * If balance is at least 100 then student rewards balance will
	 * increase by 5.
	 */
	@Override
	public void deposit (double depositedAmount) {
		if (depositedAmount >= 100) {
			this.rewards += 5;
		}
		this.deposit(depositedAmount);
	}
	
	/**
	 * Prints to console the student rewards account number, balance, and rewards.
	 */
	@Override
	public void printInfo () {
		System.out.println("\n Account Number: " + this.getAcctNo());
		System.out.println("Current Balance: " + this.getBalance());
		System.out.println("Rewards Balance: " + this.rewards);
	}
}
