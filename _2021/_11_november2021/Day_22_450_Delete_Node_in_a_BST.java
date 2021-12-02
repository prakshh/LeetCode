public class Day_22_450_Delete_Node_in_a_BST {
    //we should do this in a recursion way, otherwise we have to store its parent which will make
//the logic very confused. since we need to assign the key.parent.right = key.right; not key = key.right; pay
//attenion here the solution always use root.left = not root = which makes senses
//since recursion here, no loops then
//take this function as always returning a whole tree.

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if(root==null)
                return root;
            if(key < root.val){
                // root=root.left; // not the search idea, while think this as a whole tree
                root.left = deleteNode(root.left, key);
            }
            else if(key > root.val){
                root.right = deleteNode(root.right, key);
            }
            else{
                if(root.left == null){
                    return root.right;
                } else if(root.right == null){
                    return root.left;
                } else {
                    TreeNode findMin = root.right;
                    int val = findMin.val;
                    while(findMin!=null){
                        val = findMin.val;
                        findMin = findMin.left;
                    }
                    root.val = val;
                    root.right = deleteNode(root.right, val);
                }

            }
            return root;
        }
    }
}