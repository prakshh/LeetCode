public class Day_12_203_Remove_Linked_List_Elements {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        // TC: O(n)
        // SC : O(1)
        public ListNode removeElements(ListNode head, int target) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode prev = dummy;
            ListNode curr = dummy.next;
            while(curr!=null){
                while(curr!=null && curr.val==target){
                    prev.next = curr.next;
                    curr=curr.next;

                }
                prev = prev.next;
                if(curr!=null)
                    curr=curr.next;
            }
            return dummy.next;
        }
    }
}