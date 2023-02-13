/*
Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Code
*/

class Solution {
    public int climbStairs(int n) {
        int already[]=new int[n+1];   //for storing the steps for already used or implemented steps
        int ways=recur(n,already);
        return ways;
    }
    private static int recur(int n,int already[]){
        if(n<=1) 
            return 1;
        if(already[n]>0)
            return already[n];
        int op1=recur(n-1,already);
        int op2=recur(n-2,already);
        already[n]=op1+op2;
        return op1+op2;
    }
    
}
