
public class Day_06_109_Convert_Sorted_List_to_Binary_Search_Tree {
	
	class Solution {
	    public TreeNode sortedListToBST(ListNode head) {
	        if(head==null){
	            return null;
	        }

	         return helper(head, null);
	    }

	    private TreeNode helper(ListNode start, ListNode end){
	        ListNode fast =start;
	        ListNode slow = start;
	        if(start == end) {
	            return null;
	        }

	        while(fast!=end && fast.next!=end){
	            fast = fast.next.next;
	            slow = slow.next;
	        }

	        TreeNode newNode = new TreeNode(slow.val);

	        newNode.left = helper(start, slow);
	        newNode.right = helper(slow.next, end);

	        return newNode;

	    }

	}
	    
	    

}
