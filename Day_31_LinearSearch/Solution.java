// Java code for linearly searching x in arr[]. If x
// is present then return its location, otherwise
// return -1
import java.util.Scanner;
class Solution {
    public static int search(int arr[], int x)
    {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
 
    // Driver's code
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements in array-");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be found-");
        int x = sc.nextInt();
 
        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
    }
}