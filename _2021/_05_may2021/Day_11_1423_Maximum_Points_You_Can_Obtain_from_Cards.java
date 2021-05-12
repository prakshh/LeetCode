
public class Day_11_1423_Maximum_Points_You_Can_Obtain_from_Cards {
	
	class Solution {

	    // TC : O(k)
	    // SC : O(1)
	    public int maxScore(int[] cardPoints, int k) {
	        int sumOfKEls = 0;
	        for(int i=0;i<k;i++){
	            sumOfKEls = sumOfKEls + cardPoints[i];
	        }
	        int len = cardPoints.length;
	        int maxSum = sumOfKEls;

	        int i =0;
	        while(i<k){
	            sumOfKEls = sumOfKEls - cardPoints[k-i -1] + cardPoints[len-1-i];
	            maxSum = Math.max(maxSum, sumOfKEls);
	            i++;
	        }

	        return maxSum;
	    }
	}

}
