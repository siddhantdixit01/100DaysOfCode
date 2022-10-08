import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        char a1[] = a.toLowerCase().toCharArray();
        char b1[] = b.toLowerCase().toCharArray();
        
        if(a.length() != b.length()){
            return false;
        }
        
        int c[] = new int[256];
        
        for(int i=0;i<a.length();i++){
            c[a1[i]]++;
            c[b1[i]]--;
        }
        
        for(int i=0;i<256;i++){
            if (c[i] != 0){
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
