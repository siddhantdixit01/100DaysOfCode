import java.util.Scanner;
import java.lang.Math;

public class Distance1{
	public static void main(String args[])
	{
		int x1,x2,y1,y2;

        Scanner sc=new Scanner(System.in);

System.out.println("Enter x1 point");

x1=sc.nextInt();

System.out.println("Enter y1 point");

y1=sc.nextInt();

System.out.println("Enter x2point");

x2=sc.nextInt();

System.out.println("Enter y2 point");

y2=sc.nextInt();
			
	System.out.println(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
	}
	
}
