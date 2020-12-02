package com.leetcode.december2020;

public class Day_01_104_Maximum_Depth_Of_Binary_Tree {
	
	  //Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	class Solution {
	    public int maxDepth(TreeNode root) {
	        if(root == null) return 0;
	        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

	    }
	}

}
