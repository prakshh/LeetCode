public class Day_23_653_Two_Sum_IV_Input_BST {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

// TC : O(n)
// SC : O(n)
    class Solution {
        public boolean findTarget(TreeNode root, int k) {
            Set<Integer> set = new HashSet<>();
            return preorder(root, set, k);
        }

        public boolean preorder(TreeNode root, Set<Integer> set, int k) {
            if (root == null) {
                return false;
            }
            int counterEl = k - root.val;
            if (set.contains(counterEl)) {
                return true;
            }
            set.add(root.val);
            return preorder(root.left, set, k) || preorder(root.right, set, k);
        }
    }

}