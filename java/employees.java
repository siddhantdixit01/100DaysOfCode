import java.util.Scanner;
public class employees {
	
	public static void main(String args[]) {
	
		int employ[]=new int[10];
		int h;	
		int otp = 12;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter hours ");
			employ[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{ 
			if(employ[i]>40) {
			System.out.println(otp*(employ[i]-40));
		}
		
	}

}
}
