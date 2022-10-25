import java.io.*;
import java.util.*;
import java.math.BigDecimal;

public class Big_Decimal {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        String temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                BigDecimal a=new BigDecimal(s[j]);
                BigDecimal b=new BigDecimal(s[j+1]);
                if (a.compareTo(b)<0) {
                    temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
