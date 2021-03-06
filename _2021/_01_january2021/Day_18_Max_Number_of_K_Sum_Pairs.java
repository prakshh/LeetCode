import java.util.HashMap;
import java.util.Map;

public class Day_18_Max_Number_of_K_Sum_Pairs {
	
	class Solution {
	    public int maxOperations(int[] nums, int k) {
	               Map<Integer, Integer> map = new HashMap();
	            int count = 0;
	            for (int num : nums) {
	                if (map.containsKey(k - num) && map.get(k - num) > 0) {
	                    count++;
	                    map.put(k - num, map.get(k - num) - 1);
	                } else {
	                    map.put(num, map.getOrDefault(num, 0) + 1);
	                }
	            }

	            return count;
	        
	    }
	}

}
