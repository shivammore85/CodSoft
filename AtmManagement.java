
import java.util.Scanner;

class Banking {
	private int balance;
	
	Banking(int initialBal){
		balance=initialBal;
	}
	
	void depBal(int amt){
		if(amt<0) {
			System.out.println("Depositing Failed......");
			System.out.println("Amount should be more than 0");
		}
		else {
			balance+=amt;
			System.out.println("Amount Deposited Successfully");
		}
	}
	void withBal(int amt){
		if(amt<0) {
		System.out.println("Withdrewing Failed......");
		System.out.println("Amount should be more than 0");
	}
		else if(amt>balance) {
			System.out.println("Withdrewing Failed......");
			System.out.println("Insufficient Balance");
		}
	else {
		balance-=amt;
		System.out.println("Amount Withdraw Successfully");
	}
	}
	void checkBal(){
		System.out.println("Current Balance : "+balance+"/- cr.");
	}
	
}
 class AtmManagement {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the initial Balance :");
		int bal=in.nextInt();
		Banking obj=new Banking(bal);
		
	 while(true) {
		 printMenu();
		 int ch=in.nextInt();
		 if(ch==4) {
			 System.out.println("Quitting ....");
			 break;
		 
		 }
		 switch(ch) {
		 case 1:
		 {
			 System.out.println("Depositing : ");
			 System.out.print("Enter the Amount to deposit : ");
			 int val=in.nextInt();
			 obj.depBal(val);
			 break;
		 }
		 case 2:
		 {
			 System.out.println("Withdrewing : ");
			 System.out.print("Enter the Amount to withdraw : ");
			 int val=in.nextInt();
			 obj.withBal(val);
			 break;
		 }
		 case 3:
		 {
			 System.out.print("Balance Checking : ");
			 obj.checkBal();
			 break;
		 }
		 default:
			 System.out.print("Invalid Option entered. ");
		 }
	 }
	 System.out.print("Exited Successfully. ");
	}
	
	static void printMenu() {
		System.out.println("--Menu--");
		System.out.println("1.Deposit\n2.Withdraw\n3.Balance Check\n4.Exit");
		System.out.print("Enter your choice :");
	}
}
