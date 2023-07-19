

import java.util.*;

public class Functions {
	int r,rev=0,i=0,n1=0,num,fact=1;
	static int choice;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Choose Your Option ");
		System.out.print("\n1.Factorial\n2.Prime No\n3.Reverse\n");
		System.out.print("Your Option: ");
		
		Functions obj=new Functions();
	    choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			obj.fact();
			break;
		case 2:
			obj.Primeno();
			break;
			
		case 3:
			obj.Reverseno();
			break;
		}
		

	}
	
	//To get the Factorial of a No
	public void fact() {
		System.out.print("\nEnter a No: ");
		num=sc.nextInt();
		
		while(num>1) {
			
			fact=fact*num;
			num--;
		}
		System.out.print("The Factorial is "+fact);
		
	}
	
	//To get Prime NO From 1 to 1000
	public void Primeno() 
	{
		System.out.print("\nEnter a No: ");
		n1=sc.nextInt();
		String Primeno=" ";
		
		
		for(i=1;i<=1000;i++) 
		{
			int counter=0;
			for(n1=i;n1>1;n1--)
			{
				if(i%n1==0) 
				{
					counter=counter+1;
			
				}
			}
			if(counter==2)
			{
				Primeno=Primeno+i+" ";
				
			}	
		}
		System.out.println("Prime No's From 1 to 1000 are: ");
		System.out.println(Primeno);		
	}
			
	
	// To Reverse the entered no
	public void Reverseno()
	{
		System.out.print("\nEnter your No: ");
		num=sc.nextInt();
		
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;	
		}
		System.out.println("The Reverse is "+rev);
	}

}
