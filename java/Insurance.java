import java.util.Scanner;

public class Insurance {
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
System.out.println("Enter Health (G for Good & P for Poor)= ");
        char Health =sc.next().charAt(0);
System.out.println("Enter Location (C for city & V for Village)= ");
        char Loc =sc.next().charAt(0);
System.out.println("Enter Gender (M for Male & F for Female)= ");
        char Gen =sc.next().charAt(0);
System.out.println("Enter Age  ");
        int age =sc.nextInt();

        if(Health=='G' &&Loc=='C' && Gen=='M' && (age>=25 && age <=35)){
System.out.println("Premium is Rs. 4 per thousand and his policy amount cannot exceed Rs. 2 lakhs");
        }
        else if(Health=='G' &&Loc=='C' && Gen=='F' && (age>=25 && age <=35)){
System.out.println("premium is Rs. 3 per thousand and her policy amount cannot exceed Rs. 1 lakh");
        }
        else if(Health=='P' &&Loc=='V' && Gen=='M' && (age>=25 && age <=35)){
System.out.println(" premium is Rs. 6 per thousand and his policy cannot exceed Rs. 10,000.");
        }
        else 
System.out.println(" No Insurance!!");

    }
}
