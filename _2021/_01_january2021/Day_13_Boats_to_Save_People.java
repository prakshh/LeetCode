package _2021/_01_january2021;
import LeetCode.ListNode;

public class Day_13_Boats_to_Save_People {
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int i = 0, j = people.length - 1;
            int boats = 0;
            
            while(i <= j){
                if(people[i] + people[j] <= limit)
                    i++;
                j--;
                boats++;
            }
            return boats;
        }
    }
}