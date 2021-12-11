public class Day_06_1217_Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    class Solution {
        public int minCostToMoveChips(int[] position) {
            int chipsAtOddPosition = 0;
            int chipsAtEvenPosition = 0;
            for (int i = 0; i < position.length; i++) {
                if (position[i] % 2 == 0) {
                    chipsAtEvenPosition++;
                } else {
                    chipsAtOddPosition++;
                }
            }
            return chipsAtEvenPosition > chipsAtOddPosition ? chipsAtOddPosition : chipsAtEvenPosition;
        }
    }
}