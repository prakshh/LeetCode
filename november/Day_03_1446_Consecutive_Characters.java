package main.cp.leetcode.november;

public class Day_01_1446_Consecutive_Characters {
    public int maxPower(String s) {
        int count = 1, max_count = 1;
 char prev = s.charAt(0);
 for(int i = 1; i < s.length(); ++i){
     if(s.charAt(i) == prev){
         count++;
         max_count = Math.max(max_count, count);
     } else {
         count = 1;
         prev = s.charAt(i);
     }
 }
 return max_count;
}
}