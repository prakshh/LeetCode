package main.cp.leetcode.november;

import java.util.LinkedList;
import java.util.Queue;

public class Day_14_938_Range_Sum_of_BST {
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)
            return 0;
        if(root.val > high)
            return rangeSumBST(root.left,low,high);
        else if(root.val < low)
            return rangeSumBST(root.right,low,high);
        return root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
    }
}