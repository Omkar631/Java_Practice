package interface_;
import java.util.*;

public class Area_cal implements Inf1
{
	int choice;
	char y;
	double a,b,r,area,pi=3.14;
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void area_of_rectangle()
	{
		System.out.println("\nArea of rectangle");
		System.out.println("Enter Breadth: ");
		a=sc.nextInt();
		System.out.println("Enter Height: ");
		b=sc.nextInt();
		area=a*b;
		System.out.println("Area of rectangle= "+area+" Sq.cm");
	}

	@Override
	public void area_of_circle() 
	{
		System.out.println("\nArea of Circle");
		System.out.println("Enter Radius: ");
		r=sc.nextInt();
		area=pi*(r*r);
		System.out.println("Area of Circle= "+area+" Sq.cm");	
	}

	@Override
	public void area_of_triangle() 
	{
		System.out.println("\nArea of Triangle");
		System.out.println("Enter Base: ");
		a=sc.nextInt();
		System.out.println("Enter Height: ");
		b=sc.nextInt();
		area=(a*b)/2;
		System.out.println("Area of rectangle= "+area+" Sq.cm");	
	}

	@Override
	public void area_of_sqaure() 
	{
		System.out.println("\nArea of Square");
		System.out.println("Enter Side of Square: ");
		a=sc.nextInt();
		area=a*a;
		System.out.println("Area of rectangle= "+area+" Sq.cm");
	}
	
	@Override
	public void area_of_cube() 
	{
		System.out.println("\nArea of Cube");
		System.out.println("Enter a Side: ");
		a=sc.nextInt();
		area=6*(a*a);
		System.out.println("Area of rectangle= "+area+" Sq.cm");	
	}

}
