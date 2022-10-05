import java.util.Scanner;

public class fizz_buzz {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Integer");
        x=sc.nextInt();
        if(x%3==0 && x%5==0)
        System.out.println("FizzBuzz");
        else if (x%5 ==0)
        System.out.println("Buzz");
        else if (x%3==0)
        System.out.println("Fizz");
        else
        System.out.println(x+" ");
        }
       
}
