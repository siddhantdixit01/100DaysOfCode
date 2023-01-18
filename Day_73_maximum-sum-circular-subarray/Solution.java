/*
Maximum Sum Circular Subarray || LeetCode

Example 1:

Input: nums = [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3.
Example 2:

Input: nums = [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.
Example 3:

Input: nums = [-3,-2,-3]
Output: -2
Explanation: Subarray [-2] has maximum sum -2.
*/

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int minValue=Integer.MAX_VALUE,maxValue=Integer.MIN_VALUE;
        int min=0,max=0,sum=0;
        for(int i:nums){
            sum+=i;
            min+=i;
            max+=i;
            if(min>i){
                min=i;
            }
            minValue=Math.min(min,minValue);
            maxValue=Math.max(max,maxValue);
            if(max<0){
                max=0;
            }
        }
        if(sum!=minValue)
        return Math.max(sum-minValue,maxValue);
        return maxValue;
    }
}
