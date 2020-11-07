package main.cp.leetcode.november;

public class Day_05_1217_Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for(int i: position){
            if(i%2 == 1) ++odd;
            else ++even;
        }
        return Math.min(odd, even);
    }
}