package pac1;

public class Account 
{
	private String name;
	private double balance;
	
	Account(String name,double balance)
	{
		this.balance=balance;
		this.name=name;
	}
	
	public void deposit(double dp_amount)
	{
		balance += dp_amount;
		System.out.println("your deposit amount"+dp_amount+"is deposited successfully\nCurrent balance is "+balance);
	}
	public double getbalance()
	{
		return balance;
	}
	public void setBalance(double balance) {
        this.balance = balance;
    }
	public boolean withdraw(double wd_amount) {
        if (balance >= wd_amount) {
            balance -= wd_amount;
            System.out.println("Amount " + wd_amount + " is debited from your account.\nCurrent balance is " + balance);
            return true;
        } else {
            System.out.println(name + " tried to withdraw " + wd_amount + " but insufficient balance. Current Balance: " + balance);
            return false;
        }
    }
	public static class Savings_Account extends Account {

		private final double mini_balance=500;
		public Savings_Account(String name, double balance) {
			super(name, balance);
		}
		public boolean withdraw(double wd_amount) {
	        if (getbalance() - wd_amount >= mini_balance) {
	            setBalance(getbalance() - wd_amount);
	            System.out.println("Withdrawal of " + wd_amount + " successful. Remaining balance: " + getbalance());
	            return true;
	        } else {
	            System.out.println("Withdrawal of " + wd_amount + " not possible. Minimum balance requirement of " + mini_balance + " would be violated.");
	            return false;
	        }
	    }	
	}
	
	public static class Current_Account extends Account{
		private double overdraft_limit;
		Current_Account(String name, double balance, double overdraft_limit) {
			super(name, balance);
			this.overdraft_limit=overdraft_limit;
		}
		public double getoverdraft_limit()
		{
			return overdraft_limit;
		}
		public void setoverdraft_limit(double overdraft_limit)
		{
			this.overdraft_limit=overdraft_limit;
		}
		public boolean withdraw(double wd_amount) {
	        if (getbalance() + overdraft_limit >= wd_amount) {
	            setBalance(getbalance() - wd_amount);
	            System.out.println("Withdrawal successful. Remaining balance: " + getbalance());
	            return true;
	        } else {
	            System.out.println("Withdrawal not possible. Overdraft limit exceeded.");
	            return false;
	        }
	    }
		
	}
	public static void main(String[] args)
	{
		
		Account ac1= new Account("Smith",3000);
		Account ac2=new Account("Kathy",4000);
		System.out.println(ac1.getbalance());
		ac1.deposit(200);
		ac1.withdraw(400);
		System.out.println(ac1.getbalance());
		System.out.println(ac2.getbalance());
		ac2.withdraw(250);
		ac2.deposit(3000);
		System.out.println(ac2.getbalance());
	//savings	
		Savings_Account sa=new Savings_Account("karthik",2000);
		System.out.println("Initial Balance"+sa.getbalance());
		sa.withdraw(600);  // Should allow
        System.out.println("After withdrawal, balance: " + sa.getbalance());

        sa.withdraw(900);  // Should not allow because of minimum balance constraint
        System.out.println("Final balance: " + sa.getbalance());
       
        //current
        Current_Account ca = new Current_Account("Chris", 1000, 500);  

	      
        System.out.println("Initial balance: " + ca.getbalance());

        boolean success1 = ca.withdraw(800); 
        System.out.println("Withdraw 800: " + success1);

      
        boolean success2 = ca.withdraw(600);  
        System.out.println("Withdraw 600: " + success2);

        
        boolean success3 = ca.withdraw(300);  
        System.out.println("Withdraw 300: " + success3);

        System.out.println("Final balance: " + ca.getbalance());
	}	
}
