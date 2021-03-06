
public class Day_03_268_Missing_Number {
	
	class Solution {
	    public int missingNumber(int[] nums) {
	        int total = 0;
	        for(int el: nums){
	            total += el;
	        }
	        int n = nums.length;
	        return ((n)*(n+1))/2 - total;
	    }
	}

}
