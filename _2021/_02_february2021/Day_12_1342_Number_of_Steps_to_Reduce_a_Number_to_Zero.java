
public class Day_12_1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
	
	class Solution {

	    public int numberOfSteps (int num) {
	        if(num ==0 ){
	            return 0;
	        }
	        return 1 + (num%2 ==0 ? numberOfSteps(num/2) : numberOfSteps(num-1));
	   
	    }
	}

}
