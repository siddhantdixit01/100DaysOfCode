import java.util.Scanner;
public class LibraryCharges {
	public static void main(String args[])
	{
		int days;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter days ");
		days = sc.nextInt();
		
		if(days>=1 &&days<=5)
		{
			System.out.println("You will have to pay 50 paise per day \nFine- " +0.5*days);
		}
		else if(days>=6 &&days<=10)
		{
			System.out.println("You will have to pay 1 rupee per day \nFine- " +1*days);
		}
		else if(days>10)
		{
			System.out.println("You will have to pay 5 rupee per day \nFine- " +5*days);
		}
		else if(days>30)
		{
			System.out.println("Your membership cancelled ");
		}
		System.out.println("Please return the book within the time otherwise you will have to take fine and may be membership cancelled");
		
	}

}
