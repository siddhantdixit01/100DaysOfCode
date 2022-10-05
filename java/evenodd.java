// series of even or odd from 1-20
// prime
// largest no among 3 no
//pallindrome
import java.util.Scanner;
public class evenodd{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter 1 for even series or 2 for odd series-");
        int key=s.nextInt();
        switch (key) {
            case 1:System.out.println("Even Series-");
                    for(int i=1;i<=20;i++){
                        if(i%2==0){
                            System.out.print(i+" ");
                        }
                    }
                break;
            case 2:System.out.println("Odd Series-");
                    for(int i=1;i<=20;i++){
                        if(i%2!=0){
                            System.out.print(i+" ");
                        }
                    }
                
                break;
        
            default:System.out.print("Invalid Entry...");
                break;
        }
    }
}