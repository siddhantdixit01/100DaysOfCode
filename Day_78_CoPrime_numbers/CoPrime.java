import java.util.*;

public class CoPrime {
    static int GCD(int a,int b)
    {
        if(a==0)
            return b;
        return GCD(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Range");
        int b= sc.nextInt();
        int count=0;
        System.out.println("All Co-Prime Pairs till "+b);
        for(int a=1;a<b;a++){
            if((GCD(a,b)==1))
            {
                count++;
                System.out.println(+a+","+b);
            }
        }
        System.out.println("Total pairs = " +count);

    } 
}
