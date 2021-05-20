
public class Day_19_462_Minimum_Moves_to_Equal_Array_Elements_II {
	
	class Solution {
    // TC : O(nlogn)
    // SC : O(1)
     public int minMoves2(int[] nums) {

         Arrays.sort(nums);

         int len = nums.length;
         int medianEl = nums[len/2];

         int count = 0;

         for(int el: nums){
             count += Math.abs(el-medianEl);
         }
         return count;
     }
        
    
}

}
