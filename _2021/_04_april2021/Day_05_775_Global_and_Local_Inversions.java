
public class Day_05_775_Global_and_Local_Inversions {
	
	class Solution {

	    // TC : O(n)
	    // SC : O(1)
	    public boolean isIdealPermutation(int[] A) {

	        int cMax = A[0];
	        for(int i=0;i<A.length-2;i++){
	            cMax = Math.max(cMax, A[i]);
	            if(cMax>A[i+2]){
	                return false;
	            }
	        }
	        return true;
	    }
	    }
	    
	    
	    


}
