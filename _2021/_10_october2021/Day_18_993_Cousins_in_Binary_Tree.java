public class Day_18_993_Cousins_in_Binary_Tree {
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

// Solution I : DFS
    class Solution {
        private int xDepth = -1;
        private int yDepth = -2;

        private TreeNode xParent = null;
        private TreeNode yParent = null;


        public boolean isCousins(TreeNode root, int x, int y) {
            if(root == null){
                return true;
            }

            isCousinsHelper(root, x, y, 0,  null);
            return xDepth==yDepth && xParent !=yParent;
        }

        private  void isCousinsHelper(TreeNode root, int x, int y, int depth, TreeNode parent){
            if(root == null){
                return ;
            }
            else if(root.val == x){
                xParent = parent;
                xDepth = depth;
            } else if(root.val == y){
                yParent = parent;
                yDepth = depth;
            } else {
                isCousinsHelper(root.left, x, y, depth+1, root);
                isCousinsHelper(root.right, x, y, depth+1, root);
            }
        }
    }
}