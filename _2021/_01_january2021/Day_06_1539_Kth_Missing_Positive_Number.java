import ListNode;

public class Day_06_1539_Kth_Missing_Positive_Number {
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
