package Practice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		int num,n,r,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a No: ");
		num=sc.nextInt();
	   	
		
		n=num;
		while(num>0)
		{
			
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		
	
		}
		System.out.println("The Reverse no is " +rev);
		
		
		if(rev==n) {
			System.out.print("\nThe Number is Palindrome ");
		}
		else {
			System.out.println("\nThe is Not Plaindrome");
		}
	}

}
