public class Day_11_1413_Minimum_Value_to_Get_Positive_Step_by_Step_Sum {
    class Solution {
        // TC : O(n)
        // SC: O(1)
        public int minStartValue(int[] nums) {
            int min = 0;
            int prefixSum = 0;
            for(int el: nums){
                prefixSum += el;
                min = Math.min(min, prefixSum);
            }
            return min <0 ? Math.abs(min) + 1 : 1;

        }
    }
}