package abstraction;

public class Checking_Account extends Bank_Account
{
	
	public static void main(String[] args)
	{
		Checking_Account obj=new Checking_Account();
		do {
			System.out.println("\n1: Deposit Amount \n2: Withdraw Amount");
			System.out.print("\nEnter Your Option: ");
			choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1: obj.deposit();
			      break;
			case 2: obj.withdraw();
		      break;
			}
			System.out.print("\nDo want to go to Main Menu? y/n: ");
			choice=sc.next().charAt(0);
		   }while(choice=='y');
	     	System.out.print("The Process is Ended!!!! ");

	}

	@Override
	public void deposit() 
	{
		detail();
		if (getPinno() == check_pin) {
			System.out.println("\nEnter Deposit Amount: ");
			credit = sc.nextInt();

			setBal(getBal() + credit);
			System.out.println("\nYour balance is: " + getBal() + " /-");

		} else {
			System.out.println("Invalid pin number...");
		}

	}

	@Override
	public void withdraw() 
	{
		detail();
		if (getPinno() == check_pin) {
			System.out.println("\nEnter Withdrawal Amount: ");
			debit = sc.nextInt();

			if (credit < getBal()) {
				setBal(getBal() - debit);
				System.out.println("\nYour balance is: " + getBal());
			} else {
				System.out.println("insufficient balance.....");
				System.out.println("Your balance is : " + getBal() + "/-");
				withdraw();
			}

		} else {
			System.out.println("Invalid pin number");
		}

	}
	

	public void detail()
	{
		System.out.println("Enter Your Account No: ");
		a=sc.nextInt();
		System.out.println("Enter Your Password: ");
		check_pin=sc.nextInt();
		
	}


}
