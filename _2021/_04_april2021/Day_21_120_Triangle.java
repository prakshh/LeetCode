
public class Day_21_120_Triangle {
	
	class Solution {
	    public int minimumTotal(List<List<Integer>> triangle) {
	        for (int i = triangle.size() - 2; i >= 0; --i) {
	            List<Integer> cur = triangle.get(i);
	            List<Integer> next = triangle.get(i+1);
	            for (int j = 0; j < i + 1; ++j) {
	                cur.set(j, Math.min(next.get(j), next.get(j+1)) + cur.get(j));   
	            }
	        }
	        return triangle == null ? 0 : triangle.get(0).get(0);
	    }
	}

}
