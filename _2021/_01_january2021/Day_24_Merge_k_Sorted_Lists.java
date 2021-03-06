import java.util.Comparator;
import java.util.List;
//import LeetCode.ListNode;
import java.util.PriorityQueue;

public class Day_24_Merge_k_Sorted_Lists {
	
	  //Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public List mergeKLists(ListNode[] lists) {
	        if(lists == null || lists.length ==0){
	            return null;
	        }

	        Comparator<ListNode> customCompare = new Comparator<ListNode>(){
	            @Override
	            public int compare(ListNode a, ListNode b){
	                return a.val -b.val;
	            }
	        };

	        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode> (customCompare);

	        for(ListNode list : lists){
	            if(list !=null){
	                pq.offer(list);
	            }
	        }


	        ListNode dummy = new ListNode(-1);
	        ListNode t = dummy;

	        while(!pq.isEmpty()){
	            ListNode lowesetValNode = pq.poll();
	            t.next = lowesetValNode;
	            t   =   t.next;

	            if(lowesetValNode.next!=null){
	                pq.offer(lowesetValNode.next);
	            }
	        }

	        return (List) dummy.next;
	    }
	}
}
