
public class Day_31_42_Trapping_Rain_Water {
	
	 class Solution {

	     // TC: O(n)
	     // SC : O(n)
	     public int trap(int[] height) {
	         if(height.length <=0){
	             return 0;
	         }
	         int n = height.length;

	         int[] left = new int[n];
	         int max =height[0];
	         for(int i=0;i<n;i++){
	             max = Math.max(max, height[i]);
	             left[i] = max;
	         }


	         int[] right = new int[n];
	         max =height[n-1];
	         for(int i=n-1;i>=0;i--){
	             max = Math.max(max, height[i]);
	             right[i] = max;
	         }
	         int totalWater = 0;
	         for(int i=0;i<n;i++){
	             totalWater += Math.min(left[i] , right[i]) - height[i];
	         }
	         return totalWater;
	     }
	 }



}
