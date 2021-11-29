public class Day_20_540_Single_Element_in_a_Sorted_Array {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            if (nums == null || nums.length == 0) { return 0; }
            int ans = 0;
            for (int num: nums) {
                ans ^= num;
            }
            return ans;
        }
    }




}