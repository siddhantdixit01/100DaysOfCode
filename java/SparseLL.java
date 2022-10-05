import java.util.*;
 
public class SparseLL {
    static Node first = null;
 
    public static class Node {
        int row;
        int col;
        int data;
        Node next;
    };

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
 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (sparseMatrix[i][j] != 0) {
                    create_new_node(i, j,
                                    sparseMatrix[i][j]);
                }
            }
        }
        printList(first);
    }
    private static void
    create_new_node(int row_index, int col_index, int x)
    {
        Node temp = first;
        Node r;
 
        if (temp == null) {
            temp = new Node();
            temp.row = row_index;
            temp.col = col_index;
            temp.data = x;
            temp.next = null;
            first = temp;
        }
 
        // If link list is already created
        // then append newly created node
        else {
            while (temp.next != null)
                temp = temp.next;
 
            r = new Node();
            r.row = row_index;
            r.col = col_index;
            r.data = x;
            r.next = null;
            temp.next = r;
        }
    }
 
    // Function prints contents of linked list
    // starting from start
    public static void printList(Node start)
    {
        Node ptr = start;
        System.out.print("row_position:");
        while (ptr != null) {
            System.out.print(ptr.row + " ");
            ptr = ptr.next;
        }
        System.out.println("");
        System.out.print("column_position:");
 
        ptr = start;
        while (ptr != null) {
            System.out.print(ptr.col + " ");
            ptr = ptr.next;
        }
        System.out.println("");
        System.out.print("Value:");
        ptr = start;
 
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}