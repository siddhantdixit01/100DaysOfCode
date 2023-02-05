/*



Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]


Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

Code-
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        
        int addIndex = 1;  

        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] < nums[i + 1]){ 
              nums[addIndex] = nums[i + 1];
              addIndex++;
            }
        }
        return addIndex;
    }
}  
