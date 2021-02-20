
public class Day_18_413_Arithmetic_Slices {
	
	class Solution {
	    
	    public int numberOfArithmeticSlices(int[] A) {
	        int previousCount = 0;
	        int total = 0;
	        for(int i=2;i<A.length;i++){
	            if(A[i] - A[i-1] == A[i-1] - A[i-2]){
	                previousCount = previousCount +1;
	            } else{
	                previousCount = 0;
	            }
	            total += previousCount;
	        }
	        return total;
	    }
	    
	    }
	    
	    
	    
	           

}
