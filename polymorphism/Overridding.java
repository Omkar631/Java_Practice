/*
 Overriding: method overriding occurs when a subclass (child class) has the same method as the parent class. 
 			In other words, method overriding occurs when a subclass provides a particular implementation of
 			
 			a method declared by one of its parent
 */

package polymorphism;
import java.util.*;
public class Overridding 

{
	int n1,n2,temp=0;
	Scanner sc=new Scanner(System.in);
	 public void Swapping_Nos_without_third_variable() 
	    {
	    	System.out.print("\nFor Swapping Nos without third variable: ");
	    	System.out.print("\nEnter Two Nos: ");
			System.out.print(" \nN1= ");
			n1=sc.nextInt();
			System.out.print("N2= ");
			n2=sc.nextInt();

	    	n1=n1+n2;// no Third Variable is used to Swapp.
			n2=n1-n2;
			n1=n1-n2;
			System.out.print("\nThe Two Swapping Nos without third variable Are: \nN1="+n1+"\t\tN2="+n2);
			
	    }
	    
	    //Swapping_Nos_with_third_variable Function
		public void Swapping_Nos_with_third_variable() 
		{
			System.out.print("\n\nFor Swapping Nos with third variable: ");
			System.out.print("\nEnter Two Nos: ");
			System.out.print(" \nN1= ");
			n1=sc.nextInt();
			System.out.print("N2= ");
			n2=sc.nextInt();
		

			temp=n1;//Using Third Variable to Swapp.
			n1=n2;
			n2=temp;
			
			System.out.print("\nThe Two Swapping Nos without third variable Are: \nN1="+n1+"\t\tN2="+n2);
			
		}

	
}
