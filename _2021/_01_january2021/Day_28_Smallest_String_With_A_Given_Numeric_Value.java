import java.util.Arrays;

public class Day_28_Smallest_String_With_A_Given_Numeric_Value {
	class Solution {
	    public String getSmallestString(int n, int k) {
	        char[] result = new char[n];
	            Arrays.fill(result, 'a');
	            k -= n;
	            while (k > 0) {
	                result[--n] += Math.min(25, k);
	                k -= Math.min(25, k);
	            }
	            return String.valueOf(result);
	    }
	}
}
