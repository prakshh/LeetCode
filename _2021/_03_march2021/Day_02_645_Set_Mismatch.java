
public class Day_02_645_Set_Mismatch {
	
	class Solution {
	    public int[] findErrorNums(int[] nums) {
	        int[] ans = new int[2];
	        Set<Integer> set = new HashSet<>();
	        for(int el : nums){
	            if(set.contains(el)){
	                ans[0] = el;
	            } else{
	                set.add(el);
	            }
	        }

	        for(int i=1;i<=nums.length;i++){
	            if(!set.contains(i)){
	                ans[1] = i;
	                break;
	            }
	        }
	        return ans;
	    }
	}

}
