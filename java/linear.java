import java.util.Scanner;
public class linear {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of value in array -");
		int n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements in array-");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Enter element to be searched in array-");
        int key=s.nextInt();
        boolean b=search(a,key);
        if(b==true)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
        long end = System.nanoTime();
        long execution = (end - start)/1000000000;
        System.out.println("");
        System.out.println("Execution time: "+ execution + " seconds");
        
    }
    static boolean search(int[] a, int key){
        int i=0;
        while(i<a.length && a[i]!=key)
            i++;
        if(i<a.length)
            return true;
        else
         return false;
    }
}
