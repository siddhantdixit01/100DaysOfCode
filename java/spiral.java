import java.util.Scanner;;
public class spiral {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]= new int[n][n];
        int s=0,e=n-1,d=01;
        while(d<=(n*n)){
            for(int i=s;i<=e;i++){
                a[s][i]=d;
                d++;
            }
            for(int j=s+1;j<=e;j++){
                a[j][e]=d;
                d++;
            }
            for(int k=e-1;k>=s;k--){
                a[e][k]=d;
                d++;
            }
            for(int l=e-1;l>s;l--){
                a[l][s]=d;
                d++;
            }
            s++;
            e--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }            
    }
}


// 1 2 3  00 01 02
// 8 9 4  10 11 12
// 7 6 5  20 21 22