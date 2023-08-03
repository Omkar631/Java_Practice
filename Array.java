package thurs_lab_3aug;

import java.util.Scanner;

public class Array 
{
	
	int i,grt,sml;
	int[]arr;
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Array obj=new Array();
		obj.Display();
		
	}
	
	
	public void Array_Function() 
	{
		arr=new int[10];
		System.out.println("Enter 10 Number: ");
		for(i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		grt=arr[0];
		sml=arr[0];
		for(i=0;i<arr.length;i++) {
			if(grt<arr[i]) {
				grt=arr[i];
			}
			else if(sml>arr[i]) {
				sml=arr[i];
			}
		}
		return;
	}
	

	public void Display() 
	{
		 Array_Function();
		    System.out.println("The Smallest no is = "+sml);
			System.out.println("The Greatest no is = "+grt);//Prints The Greatest No
	}

}
