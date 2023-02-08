/*
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
Code */

class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        while(n>0 && s.charAt(n-1)==' ')
            n--;
        int i=n-1;
        while(i>-1 && s.charAt(i) !=' ')
            i--;
        return n-i-1;
    }
}
