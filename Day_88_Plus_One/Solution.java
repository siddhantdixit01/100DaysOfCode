/*
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Code 
*/

class Solution {
    public int[] plusOne(int[] digits) {
     int n=digits.length;
     for(int i=n-1;i>=0;i--){
         if(digits[i]!=9){
             digits[i]++;
             break;
         }
         else
            digits[i]=0;
     }
     if(digits[0]==0){
         int arr[]=new int[n+1];
         arr[0]=1;
         return arr;
     }   
     return digits;
    }
}
