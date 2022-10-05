import java.util.*;
public class SparsedMatrixArray {
    int r,c,count;
    int[][] sparce;
    int[][] nonzero;
    Scanner sc = new Scanner(System.in);

    void setNonzero(){
        int k = 0;
        for (int i = 0; i<r; i++) {
            for (int j = 0; j<c; j++) {
                if(sparce[i][j] != 0){
                    count++;
                }
            }
        }
        nonzero = new int[count][3];
        for (int i = 0; i<r; i++) {
            for (int j = 0; j<c; j++) {
                if(sparce[i][j] != 0){
                    nonzero[k][0] = i;
                    nonzero[k][1] = j;
                    nonzero[k][2] = sparce[i][j];
                    k++;
                }
            }
        }
    }

    void insert(int row , int column , int val){
        if(row<r&&column<c){
            if(sparce[row][column] == 0){
                sparce[row][column] = val;
                System.out.println("element inserted successfully...");
            }else{
                System.out.println("element is already has value.");
            }
        }else{
            System.out.println("Please enter right row and column.");
        }
    }

    void Delete(int row, int column){
        if(row<r&&column<c){
            if(sparce[row][column] != 0){
                sparce[row][column] = 0;
                System.out.println("element deleted successfully...");
            }else{
                System.out.println("element is already zero.");
            }
        }else{
            System.out.println("Please enter right row and column.");
        }
    }

    void Search(int val){
        for (int i = 0; i<count; i++) {
           if(nonzero[i][2] == val){
               System.out.println("value " + val + " found in "+ nonzero[i][0]+" row and "+nonzero[i][1]+" column.");
           }
        }
    }

    void Print(){
        for (int i = 0; i<r; i++) {
            for (int j = 0; j<c; j++) {
                System.out.print(sparce[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        SparsedMatrixArray d1 = new SparsedMatrixArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many rows and column do you want");
        d1.r = sc.nextInt();
        d1.c = sc.nextInt();
        d1.sparce = new int[d1.r][d1.c];
        System.out.println("Enter the elemenmts: ");
        for (int i = 0; i<d1.r; i++) {
            for (int j = 0; j<d1.c; j++) {
                d1.sparce[i][j] = sc.nextInt();
            }
        }
        d1.setNonzero();
        while (true){
            System.out.println("1 for search\n2 for insert\n3 for delete\n4 for print\n5 for exit");
            int choice = sc.nextInt();
        switch(choice){
            case 1:{
                System.out.print("enter the value which you want to search : ");
                int val = sc.nextInt();
                d1.Search(val);
                break;
            }
            case 2:{
                System.out.println("enter row and column and element which you want to Insert : ");
                int row = sc.nextInt();
                int column = sc.nextInt();
                int val = sc.nextInt();
                d1.insert(row , column , val);
                break;
            }
            case 3:{
                System.out.println("enter row and column of element which you want to delete : ");
                int row = sc.nextInt();
                int column = sc.nextInt();
                d1.Delete(row , column);
                break;
            }
            case 4:{
                d1.Print();
                break;
            }
            case 5:{
                return;
            }
        }
        }
    }
}
