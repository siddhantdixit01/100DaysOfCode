import java.io.*;
import java.util.*;

public class solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int k=0,c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sum = new int[n];
        for(int i = 0;i<n;i++){
            int addval =0;
            for(int j=i;j<n;j++){
                addval= addval + arr[j];
                sum[j]=addval;
                if(sum[j]<0){
                    c++;
                }
            }
        }
    System.out.println(c);
    sc.close();
    }
}