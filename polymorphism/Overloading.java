package polymorphism;
import java.util.*;
public class Overloading
{
	
	Scanner sc=new Scanner(System.in);


	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.grt(5,9);
		obj.grt(9,29,8);
		obj.grt(null);
	
	}
	//For Two Nos
	public void grt(int n1,int n2) 
	{  
		if(n1>n2)
		{
			System.out.println("The Greater No is: "+n1);
		}
		else
		{
			System.out.println("The Greater No is: "+n2);
		}
		
	}//For Three Nos
	public void grt(int n1,int n2,int n3) 
	{  
		if(n1>n2 && n1>n3)
		{
			System.out.println("The Greater No is: "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("The Greater No is: "+n2);
		}
		else
		{
			System.out.println("The Greater No is: "+n3);
		}
		
	}
	//Greatest no using Array
	public void grt(int[]arr) 
	{  
		arr = new int[5];
		System.out.println("Enter values for Array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int grt_no = arr[0];
		
		for(int j=0; j<arr.length;j++) 
		{
			if(grt_no<arr[j]) 
			{
				grt_no=arr[j];
			}
		
		}
		System.out.println("The Greatest no using Array is "+grt_no);
		
		
	}

}
