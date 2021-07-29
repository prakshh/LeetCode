
public class Day_22_915_Partition_Array_into_Disjoint_Intervals {
	
	class Solution {

		  // TC : O(n)
		  // SC : O(1)
		  public int partitionDisjoint(int[] nums) {
		    int maxUntilI = nums[0];
		    int maxInleftPartition = nums[0];
		    int partitionId = 0;
		    for (int i = 1; i < nums.length; i++) {
		      maxUntilI = Math.max(maxUntilI, nums[i]);
		      if (nums[i] < maxInleftPartition) {
		        maxInleftPartition = maxUntilI;
		        partitionId = i;
		      }
		    }
		    return partitionId + 1;
		  }


		}

}
