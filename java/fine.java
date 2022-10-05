import java.util.Scanner;

public class fine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. od days the member is late- ");
        int late= sc.nextInt();
        if(late>0 && late<=5)
        { System.out.println("Fine- Rs. 0.5");}
        else if(late>=6 && late<=10)
        { System.out.println("Fine- Rs. 1");}
        else if( late>10)
        { 
            System.out.println("Fine- Rs. 5");
            if(late>30)
            { System.out.println("Membership Cancelled!");}

        }

    }
}
