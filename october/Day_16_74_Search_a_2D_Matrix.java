package main.cp.leetcode.problems;

public class Day_16_74_Search_a_2D_Matrix {
class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        if(mat.length==0 || mat[0].length==0) return false;
        int m=mat.length, n=mat[0].length;
        int start=0, end=m*n-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(mat[mid/n][mid%n] == target) return true;
            else if(mat[mid/n][mid%n] < target) start=mid+1;
            else end=mid-1;
        }
        return false;
    }
}