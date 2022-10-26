import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr = s.trim().split("()[!,?._'@ ]+");
         if(s.trim().isEmpty()){
        System.out.println("0");
        }
        else{
        System.out.println(arr.length);
        for (String a : arr) {
            System.out.println(a);
        }
        }       
        scan.close();
    }
}
