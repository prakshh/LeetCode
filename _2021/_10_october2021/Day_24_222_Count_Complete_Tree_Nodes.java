public class Day_24_222_Count_Complete_Tree_Nodes {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
// Tree (iterative) + Binary search solution: Count only one of the subtree
// Time: T(n) = T(n/2) + O(logn), T(n) = O(log^2(n)), 0ms
// Space: O(1), 39.1mb
    class Solution {
        public int countNodes(TreeNode root) {
            int ans = 0;
            TreeNode node = root;

            while(node != null) {
                // Get the leftDepth of left subtree and right subtree to check which one is unfull tree
                int left = leftDepth(node.left);
                int right = leftDepth(node.right);

                if(left == right) {
                    // Left subtree is a full tree, and right subtree could be a non-full tree
                    ans += (1 << left);
                    node = node.right;

                } else {
                    // Right subtree is a full tree, and left subtree could be a non-full tree
                    ans += (1 << right);
                    node = node.left;
                }
            }

            return ans;
        }

        private int leftDepth(TreeNode root) {
            int ans = 0;

            while(root != null) {
                ans++;
                root = root.left;
            }

            return ans;
        }
    }
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
}