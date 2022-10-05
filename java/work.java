import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int rate;
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<10; i++){
            rate=0;
            System.out.println("enter working time of employee no. "+(i+1)+" -");
            arr[i]= sc.nextInt();
            if(arr[i]>40){
                rate=(arr[i]-40)*12;
            }
            System.out.println("Overtime pay-"+rate);
        }
    }
}
