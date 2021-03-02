
public class Day01_575_Distribute_Candies {
	
	class Solution {
	    // TC : O(n)
	    // SC : O(n) // 1 2 3 4 6 ...n
	     public int distributeCandies(int[] candyType) {

	         HashSet<Integer> hashSet = new HashSet<>();
	         for(int type : candyType){
	             hashSet.add(type);
	         }

	         return Math.min(hashSet.size(), candyType.length/2);
	     }


	}
	        
	    


}
