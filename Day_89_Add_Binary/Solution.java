/*
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

Code
*/
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str= new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0; // for carry of binary addition
        while(i>=0 || j>=0){
            int sum=c;
            if(i>=0)
                sum+= a.charAt(i) - '0';
            if(j>=0)
                sum+= b.charAt(j) - '0';
            str.append(sum % 2);   //add 0/1 to last of string
            c= sum/2;
            i--; j--;
        }   
        if(c!=0)    
            str.append(c); //add carry to last of string
        return str.reverse().toString();    //reversing the string 
    }
}
