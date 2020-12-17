public class Day_11_80_Remove_Duplicates_from_Sorted_Array_II {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int n=nums.length;
            if(n<3)
                return n;
            int s=2;
            for(int f=s; f<n; f++)
                if(nums[f]!=nums[s-2])
                    nums[s++]=nums[f];
            
            return s;
            
        }
    }
}