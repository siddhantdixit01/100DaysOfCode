import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int L = A.length() + B.length();
        System.out.println(L);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        String E = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
        String F = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
        System.out.print(E+" "+F);
        sc.close();
    }
}