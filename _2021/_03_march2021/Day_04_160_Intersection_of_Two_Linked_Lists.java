
public class Day_04_160_Intersection_of_Two_Linked_Lists {
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	    // TC : O(l1+l2)
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode a = headA;
	        ListNode b = headB;

	        while(a!=b){
	            if(a == null){
	                a = headB;
	            } else{
	                a = a.next;
	            }


	            if(b == null){
	                b = headA;
	            } else{
	                b = b.next;
	            }
	        }

	        return a;
	    }
	}

}
