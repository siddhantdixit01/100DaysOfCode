/*
Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

Code
*/

class Solution {
    public int mySqrt(int x) {
        long low=0;
        long high=x;
        while(low+1 < high){
            long mid=low+(high-low) / 2;       
            if(mid*mid == x)
                return (int)mid;
            else if(mid*mid < x)
                low=mid;
            else
                high=mid;
        }
        if(high*high ==x){
            return (int)high;   //last element is checked too if the input is 1
        }
        return (int)low;
    }
}
