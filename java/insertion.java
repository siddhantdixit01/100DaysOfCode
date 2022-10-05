
import java.util.Scanner;
public class insertion {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of value in array -");
		int n = s.nextInt(); 
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements in array-");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        sort(a,n);
        System.out.println("Sorted array-");  
                for(int i=0; i < n; i++){  
                        System.out.print(a[i] + " ");  
                } 
        long end = System.nanoTime();
        long execution = (end - start)/1000000000;
        System.out.println("");
        System.out.println("Execution time: "+ execution + " seconds");
    }
    static void sort(int[] a, int n){
        int key=0;
        for(int i=1;i<n;i++){
            key = a[i];
            int j=i-1;
            while (j>=0 && a[j]>key) {
                a[j+1]=a[j];
                j-=1;
            }
            a[j + 1] = key;
        }
    }
}
