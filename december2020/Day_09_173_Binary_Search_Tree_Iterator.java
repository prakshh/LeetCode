//package main.cp.leetcode.december;

//import main.cp.leetcode.TreeNode;

import java.util.Stack;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Day_09_173_Binary_Search_Tree_Iterator {
    class BSTIterator {

        Stack<TreeNode> stack;

        public BSTIterator(TreeNode root) {
            stack = new Stack();
            pushLeft(root);
        }

        public int next() {
            TreeNode node = stack.pop();
            if (node.right != null)
                pushLeft(node.right);
            return node.val;
        }

        public boolean hasNext() {
            return stack.size() > 0;
        }

        private void pushLeft(TreeNode root) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
        }
    }
}