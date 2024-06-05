
import java.util.Scanner;

 class Grade {
    public static void main(String args[]) { 
	int sub=0;
	System.out.println("Enter the number of subjects : ");
	Scanner in =new Scanner(System.in);
	sub=in.nextInt();
	int sum=0;
	for(int i=1;i<=sub;i++) {
		System.out.println("Enter the marks of subjects "+i+" : ");
		int temp=in.nextInt();
		sum+=temp;
	}
	char grade;
	
	double avg=sum/(sub+0.0);
	
	if (avg>=90)
		grade='A';
	else if(avg>=80)
		grade='B';
	else if(avg>=70)
		grade='C';
	else if(avg>=60)
		grade='D';
	else if(avg>=50)
		grade='E';
	else 
		grade='F';
	
	System.out.println("--Results--");
	System.out.println("Total marks : "+sum);
	System.out.println("The Percentage : "+avg+"%");
	System.out.println("The Grade Assigned : "+grade+" grade.");
}
}
