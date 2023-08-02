package abstraction;

public class Area_disp extends Area_cal 
{
	public static void main(String[] args) 
	{
		Area_disp obj=new Area_disp();
		obj.operation();

	}
	public void operation() 
	{
		do {
			System.out.println("****--Area of Calculation--****");
			System.out.println("1.Area_of_rectangle");
			System.out.println("2.Area_of_circle");
			System.out.println("3.Area_of_triangle");
			System.out.println("4.Area_of_sqaure");
			System.out.println("5.Area_of_cube");
			System.out.print("Your Option: ");
			choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
				area_of_rectangle();
				break;
				
			case 2:
				area_of_circle();
				break;
				
			case 3:
				area_of_triangle();
				break;
				
			case 4:
				area_of_sqaure();
				break;
				
			case 5:
				area_of_cube();
				break;
				
			default:
				System.out.println("Enter from Above");
				break;
			}
			
			System.out.print("\nDo want to go to Main Menu? y/n: ");
			choice=sc.next().charAt(0);
			
		}while(choice=='y');
		System.out.print("\nThank You!! You exitted");
	}

}
