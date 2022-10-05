import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any no.-");
        int n=s.nextInt(),c=0;
        for(int i=2;i<n;i++){
            if(n%i==0)
                c=1;
        }
        if(c==0){
            System.out.println("Prime Number...");
        }
        else{
            System.out.println("Not a Prime Number...");
        }
    }
}
