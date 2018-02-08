package assg3_Hernandez;

/**
 * 
 * @author Johnnie Hernandez
 * @version assignment 3
 * This will be used to test each of the methods
 * in the StudentAccount class and RewardsAccount class.
 *
 */
public class StudentAccountDemo {
	
	public static void main (String[] args) {
		StudentAccount first = new StudentAccount();
		StudentAccount second = new StudentAccount(100);
		StudentAccount third = new StudentAccount(50);
		
		RewardsAccount fourth = new RewardsAccount();
		RewardsAccount fifth = new RewardsAccount(125);
		RewardsAccount sixth = new RewardsAccount(100);
		
		first.printInfo();
		second.printInfo();
		third.printInfo();
		
		fourth.printInfo();
		fifth.printInfo();
		sixth.printInfo();
		
		System.out.println(first.getAcctNo());
		System.out.println(second.getAcctNo());
		System.out.println(third.getAcctNo());
		System.out.println(fourth.getAcctNo());
		System.out.println(fifth.getAcctNo());
		System.out.println(sixth.getAcctNo());
		
		System.out.println(first.getBalance());
		System.out.println(second.getBalance());
		System.out.println(third.getBalance());
		System.out.println(fourth.getBalance());
		System.out.println(fifth.getBalance());
		System.out.println(sixth.getBalance());
		
		System.out.println(StudentAccount.getCounter());
		System.out.println(RewardsAccount.getCounter());
		
		first.setBalance(500);
		System.out.println(first.getBalance());
		third.setBalance(500);
		System.out.println(third.getBalance());
		fifth.setBalance(500);
		System.out.println(fifth.getBalance());
		
		second.deposit(200);
		fourth.deposit(20);
		sixth.deposit(600);
		
		second.printInfo();
		fourth.printInfo();
		sixth.printInfo();
		
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println(third.toString());
		System.out.println(fourth.toString());
		System.out.println(fifth.toString());
		System.out.println(sixth.toString());
				
		fourth.deposit(200);
		fourth.deposit(200);
		fourth.deposit(200);
		fourth.deposit(200);
		fourth.deposit(200);
		fourth.deposit(200);
		fourth.charge(1000);
		fourth.deposit(-100);
		fourth.charge(-100);
		first.deposit(-100);
		first.charge(-100);
		
		System.out.println(fourth.toString());
		fourth.redeemRewards();
		System.out.println(fourth.toString());
		
		System.out.println(sixth.toString());
		sixth.redeemRewards();
		System.out.println(sixth.toString());
		
		System.out.println(first.toString());
		System.out.println(second.toString());
		first.transferIn(second, 100);
		System.out.println(first.toString());
		System.out.println(second.toString());
		second.transferIn(first, 100);
		System.out.println(first.toString());
		System.out.println(second.toString());
		
		System.out.println(fourth.getRewards());
		System.out.println(fifth.getRewards());
		System.out.println(sixth.getRewards());
		
	}
	
}
