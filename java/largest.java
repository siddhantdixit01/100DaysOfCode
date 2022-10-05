import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter any 3 numbers-");
        int a[]=new int[3];
        a[0]=s.nextInt();
        a[1]=s.nextInt();
        a[2]=s.nextInt();
        int l=a[0];
        for(int i=0;i<3;i++){
            if(a[i]>=l)
                l=a[i];
        }
        System.out.println("Largest number-"+l);
    }
}
