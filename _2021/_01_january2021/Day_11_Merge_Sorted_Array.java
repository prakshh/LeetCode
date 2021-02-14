package _2021/_01_january2021;
import LeetCode.ListNode;

public class Day_11_Merge_Sorted_Array {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n <= 0)
                    return;
                if (m > 0 && nums1[m - 1] > nums2[n - 1])
                    nums1[m + n - 1] = nums1[--m];
                else
                    nums1[m + n - 1] = nums2[--n];
                merge(nums1, m, nums2, n);
        }
    }
}