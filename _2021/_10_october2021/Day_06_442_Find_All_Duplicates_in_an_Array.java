public class Day_06_442_Find_All_Duplicates_in_an_Array {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> ans = new ArrayList<>();

            for(int i = 0; i < nums.length; i++) {
                // Map the value of num into the nums array again
                int index = Math.abs(nums[i]) - 1;

                if(nums[index] < 0) {
                    // Have visited the element before, duplicate index + 1
                    ans.add(index + 1);

                } else {
                    // First time visit the element
                    nums[index] = -nums[index];
                }
            }

            return ans;
        }
    }
}