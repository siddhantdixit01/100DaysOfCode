import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner value = new Scanner(System.in);
        
        
            try
        {
            int x = value.nextInt();
            int y = value.nextInt();
            int result = x / y;
            System.out.println(result);
           
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e)    
        {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        }
    }
}