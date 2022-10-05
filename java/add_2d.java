import java.util.Scanner;;

public class add_2d {
    public static void main(String[] args) {
        int[][] arr= new int[3][3];
        int sr=0,sc=0,s=0;
        Scanner a=new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            for ( int j=0; j<3; j++){
                System.out.println("Enter Element at index " + i +"," + j + " : ");
                arr[i][j] = a.nextInt();
            }
        }
        for (int i = 0; i < 3; i++){
            sc=0;
            sr=0;
            for ( int j=0; j<3; j++){
                sr+=arr[i][j];
                sc+=arr[j][i];
                s+=sc+sr;
            }
            System.out.println("Sum of row "+i+" : "+sr+"\nSum of column "+i+" : "+sc);
        }
        System.out.println("Sum of all elements -"+s);
            
    }
}
