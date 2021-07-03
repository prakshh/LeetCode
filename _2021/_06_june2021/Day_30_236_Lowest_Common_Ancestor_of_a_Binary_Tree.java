
public class Day_30_236_Lowest_Common_Ancestor_of_a_Binary_Tree {
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	class Solution {
	  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    if(root == null || root == p || root == q)
	      return root;

	    TreeNode left = lowestCommonAncestor(root.left, p, q);
	    TreeNode right = lowestCommonAncestor(root.right, p, q);

	    if(left != null && right != null)
	      return root;
	    if(left != null) return  left;
	    if(right!=null) return right;
	    return null;
	  }

	}

}
