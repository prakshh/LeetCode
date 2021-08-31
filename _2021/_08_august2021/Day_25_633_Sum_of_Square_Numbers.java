public class Day_25_633_Sum_of_Square_Numbers {

    class Solution {
        public boolean judgeSquareSum(int c) {
            int left = 0;
            int right = (int) Math.sqrt(c);

            while (left <= right) {
                int total = left * left + right * right;
                if (total == c) {
                    return true;
                } else if (total > c) {
                    right--;

                } else {
                    left++;
                }
            }
            return false;
        }
    }

}