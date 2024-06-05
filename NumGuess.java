
import java.util.Scanner;
import java.util.Random;

 class NumGuess {
	public static void main(String args[]) {	
		Random r=new Random();
		Scanner in = new Scanner(System.in);
		int rnum=r.nextInt(101);
		
		
		while(true) {
		
		System.out.println("Guess the number : ");
		int userin=in.nextInt();
		
		if(rnum==userin) {
			System.out.println("Hurray!!! Your Guess was Correct");
			break;
		}
		else {
			int feednum;
			if (rnum>userin) {
				feednum=rnum-userin;
				
				if (feednum>0 && feednum<=10) {
					System.out.println("Almost there. Go Little bit high");
				}
				else if (feednum<=30) {
					System.out.println("You are in right track. Go a bit high");
				}
				else if (feednum<=50) {
					System.out.println("Too low. Try to guess high");
				}
				else {
					System.out.println("Your Guess is not in track. Try to go up");
				}
			}
			else {
				feednum=userin-rnum;
				
				if (feednum>0 && feednum<=10) {
					System.out.println("Almost there. Go Little bit low");
				}
				else if (feednum<=30) {
					System.out.println("You are in right track. Go a bit low");
				}
				else if (feednum<=50) {
					System.out.println("Too high. Try to guess low");
				}
				else {
					System.out.println("Your Guess is not in track. Try to go down");
				}
			}
		}
		
		}	
	}
}
