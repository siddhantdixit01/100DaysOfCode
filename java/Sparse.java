import java.util.Scanner;
class Sparse
{
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and column-");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("enter elements in matrix-");
        int[][] sparseMatrix=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sparseMatrix[i][j]=sc.nextInt();
            }
        }        
        int size = 0;
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (sparseMatrix[i][j] != 0)
                {
                    size++;
                }
            }
        }
        int compactMatrix[][] = new int[r][size];
        int k = 0;
        System.out.println("R\tC\tV");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (sparseMatrix[i][j] != 0)
                {
                    compactMatrix[i][k] = i;
                    compactMatrix[i][k] = j;
                    compactMatrix[i][k] = sparseMatrix[i][j];
                    k++;
                    System.out.println((i+1)+"\t"+(k+1)+"\t"+sparseMatrix[i][j]);
                }
            }
        }
        System.out.println("New Matrix-");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.printf("%d ", compactMatrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
}