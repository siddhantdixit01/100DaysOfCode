import java.util.Scanner;

public class CollegeRules {
	
	public static void main(String args[])
	{
	int A,B;
	
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Main Subject Percentage A ");
	A = sc.nextInt();
	System.out.println("Enter Subsidiary Subject Percentage B ");
	B = sc.nextInt();
	
	if(A>=55 &&B>=45)
	{
		System.out.println("Qualify for degree");
	}
	else if(A>=45 &&B>=55)
	{
		System.out.println("Qualify for degree");
	}
	else if(A>=65 &&B<45)
	{
		System.out.println("Reappear to Exam B");
	}
	else
	{
		System.out.println("Declared failed");
	}
	
	}
}
}
