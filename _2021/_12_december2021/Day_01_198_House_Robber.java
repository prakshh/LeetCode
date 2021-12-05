public class Day_01_198_House_Robber {
    class Solution {
        public int rob(int[] nums) {
            if(nums.length==0){
                return 0;
            }

            int[] mem = new int[nums.length+1];
            Arrays.fill(mem, -1);

            mem[0] = 0;

            return helper(nums.length, mem, nums);
        }

        private int helper(int size, int[] mem, int[] nums){
            if(size <1){
                return 0;
            }

            if(mem[size]!=-1){
                return mem[size];
            }

            //two cases
            int firstSelected = helper(size-2, mem, nums) + nums[nums.length -size];
            int firstUnselected = helper(size-1, mem, nums);

            return mem[size] = Math.max(firstSelected, firstUnselected);
        }
    }
}