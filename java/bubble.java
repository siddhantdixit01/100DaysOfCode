
import java.util.Scanner;
public class bubble {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of value in array -");
		int n = s.nextInt(); 
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements in array-");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        Bubble(a,n);
        System.out.println("Sorted array-");  
                for(int i=0; i < n; i++){  
                        System.out.print(a[i] + " ");  
                } 
        long end = System.nanoTime();
        long execution = (end - start)/1000000000;
        System.out.println("");
        System.out.println("Execution time: "+ execution + " seconds");
    }
    static void Bubble(int[] a, int n){
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=a.length-1;j>i;j--)
                if(a[j]<a[j-1])
                {
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
        }
    }
}
