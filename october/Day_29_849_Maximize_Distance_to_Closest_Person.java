package main.cp.leetcode.october;

public class Day_29_849_Maximize_Distance_to_Closest_Person {
    class Solution {
        public int maxDistToClosest(int[] seats) {
            int l = -1, n = seats.length, maxDist = 0;
            for(int i = 0; i < n; i++) {
                if(seats[i] == 1) {
                    if(l == -1)
                        maxDist = i;
                    else
                        maxDist = Math.max(maxDist, (i - l) / 2);
                    l = i;
                }
            }

            if(seats[n - 1] == 0)
                maxDist = Math.max(maxDist, n - 1 - l);

            return maxDist;
        }
    }
}
