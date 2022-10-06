import java.util.*; 

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        while (start<end) {
            System.out.print(S.charAt(start));
            start++;
        }
    }
}