
public class Day_25_Check_If_All_1s_Are_at_Least_Length_K_Places_Away {
	class Solution {
	    public boolean kLengthApart(int[] nums, int k) {
	        int prev1Index = Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i] == 1){
	                if(prev1Index  != Integer.MIN_VALUE && i - prev1Index -1<k){
	                    return false;
	                }
	                prev1Index = i;
	            }
	        }
	        return true;
	    }
	}
}
