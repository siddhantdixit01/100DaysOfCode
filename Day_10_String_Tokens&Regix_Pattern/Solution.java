import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr = s.split("[ !,?._'@]+");
        int n=arr.length;
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        scan.close();
    }
}