import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle-");
        int l=s.nextInt();
        int b=s.nextInt();
        System.out.println("Area of rectangle-"+l*b);

    }
}
