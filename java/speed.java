import java.util.Scanner;

public class speed{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter speed of the driver-");
        int speed=s.nextInt();
        if(speed<70){
            System.out.println("OK");
        }
        else{
            int c=(speed-70)/5;
            if(c>12)
            {
                System.out.println("License Suspended");
            }
        }
    }
}