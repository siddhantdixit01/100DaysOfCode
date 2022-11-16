// Java implementation of recursive Binary Search
class BinarySearch {

    // Returns index of x if it is present in arr[l..

    // r], else return -1

    int binarySearchR(int arr[], int l, int r, int x)

    {

        if (r >= l) {

            int mid = l + (r - l) / 2;

 

            // If the element is present at the

            // middle itself

            if (arr[mid] == x)

                return mid;

 

            // If element is smaller than mid, then

            // it can only be present in left subarray

            if (arr[mid] > x)

                return binarySearch(arr, l, mid - 1, x);

 

            // Else the element can only be present

            // in right subarray

            return binarySearch(arr, mid + 1, r, x);

        }

 

        // We reach here when element is not present

        // in array

        return -1;

    }
  
  int binarySearch(int arr[], int l, int r, int x)

{

    while (l <= r) {

        int m = l + (r - l) / 2;

 

        // Check if x is present at mid

        if (arr[m] == x)

            return m;

 

        // If x greater, ignore left half

        if (arr[m] < x)

            l = m + 1;

 

        // If x is smaller, ignore right half

        else

            r = m - 1;

    }

 

    // if we reach here, then element was

    // not present

    return -1;

}

 

    // Driver method to test above

    public static void main(String args[])

    {

        BinarySearch ob = new BinarySearch();

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
        
        System.out.println("Select the method through which you want to perform Binary Search-/n1 for Iterative method/n2 or Recursive method");
        int ch=nextInt();
        switch (ch){
            case 1:int result = ob.binarySearchR(arr, 0, n - 1, x);
                   break;
            case 2:int result = ob.binarySearch(arr, 0, n - 1, x);

                   break;
            default: System.out.println("Wrong choice...");
        }
        

        if (result == -1)

            System.out.println("Element not present");

        else

            System.out.println("Element found at index "

                               + result);

    }

}
