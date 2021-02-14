import java.awt.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Day_29_Vertical_Order_Traversal_of_a_Binary_Tree {
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
	class Solution {
	    public List<List<Integer>> verticalTraversal(TreeNode root) {
	        
	        List<List<Integer>> result = new ArrayList();
	            if (root == null) return result;

	            TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap();
	            vtUtil(root, 0, 0, map);

	            for (Map.Entry<Integer, TreeMap<Integer, PriorityQueue<Integer>>> entry : map.entrySet()) {
	                List<Integer> line = new ArrayList();
	                for (PriorityQueue<Integer> pq : entry.getValue().values()) {
	                    while (pq.size() > 0)
	                        line.add(pq.poll());
	                }
	                result.add(line);
	            }

	            return result;
	        }

	        private void vtUtil(TreeNode root, int x, int y, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {
	            if (root == null)
	                return;

	            TreeMap<Integer, PriorityQueue<Integer>> m = new TreeMap<>();
	            PriorityQueue<Integer> pq = new PriorityQueue();
	            if (map.containsKey(x)) {
	                m = map.get(x);
	                if (m.containsKey(y)) {
	                    pq = m.get(y);
	                }
	            }
	            pq.add(root.val);
	            m.put(y, pq);
	            map.put(x, m);

	            vtUtil(root.left, x - 1, y + 1, map);
	            vtUtil(root.right, x + 1, y + 1, map);
	        
	        
	    }
	}
	 
}
