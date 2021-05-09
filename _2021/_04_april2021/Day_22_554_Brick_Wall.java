import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day_22_554_Brick_Wall {
	
	class Solution {
	    public int leastBricks(List<List<Integer>> wall) {
	        if(wall.size() == 0) return 0;      
	        int count = 0;
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        // iterate through each line
	        for(List<Integer> list : wall){
	            int length = 0;
	            // Count all occurrences of length and update to the map
	            for(int i = 0; i < list.size() - 1; i++){ //Do not consider the rightmost brick
	                length += list.get(i);
	                map.put(length, map.getOrDefault(length, 0) + 1);
	                // Update the number of gaps that pass through the most
	                count = Math.max(count, map.get(length));
	            }
	        }
	        // number of bricks passed = total number of rows-number of gaps passed
	        return wall.size() - count;
	    }
	}

}
