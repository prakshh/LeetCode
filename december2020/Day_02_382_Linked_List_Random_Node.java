package com.leetcode.december2020;

public class Day_02_382_Linked_List_Random_Node {
    
      //Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

 
class Solution {

    Random r = null;
    ListNode h = null;

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
     Solution(ListNode head) {
        r = new Random();
        h = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int count=1;
        ListNode p = h;
        int result = 0;
        while(p!=null){
            if(r.nextInt(count)==0)
        result= p.val;
        count++;
        p = p.next;
        }
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */


}
