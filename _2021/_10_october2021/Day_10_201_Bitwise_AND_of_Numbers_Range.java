public class Day_10_201_Bitwise_AND_of_Numbers_Range {
    class Solution {
        // TC : O(32)
        public int rangeBitwiseAnd(int left, int right) {
            int shiftCount = 0;
            while(left!=right) {
                left >>= 1;
                right>>= 1;
                shiftCount++;
            }
            return left << shiftCount;
        }
    }
}