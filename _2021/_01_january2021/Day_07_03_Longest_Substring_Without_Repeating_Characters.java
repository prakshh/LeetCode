import main.cp.leetcode.ListNode;

public class Day_07_03_Longest_Substring_Without_Repeating_Characters {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
          int l = 0;
          int r = arr.length;
          while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] - (m + 1) >= k)
              r = m;
            else
              l = m + 1;
          }
          return l + k;
        }
      }
}