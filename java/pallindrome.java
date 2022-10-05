import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number-");
        int n=s.nextInt();
        int a=n,d,b=0;
        while(a>0){
            d=a%10;
            b=(b*10)+d;
            a/=10;
        }
        if(n==b){
            System.out.println("Pallindrome.."); 
        }
        else{
            System.out.println("Not a Pallindrome.."); 
        }
    }
}
