
public class Day_10_138_Copy_List_with_Random_Pointer {
	"""
	# Definition for a Node.
	class Node:
	    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
	        self.val = int(x)
	        self.next = next
	        self.random = random
	"""

	class Solution:
	    def copyRandomList(self, head: 'Node') -> 'Node':
	        if not head:
	            return None

	        mapping = {}
	        
	        current = head
	        
	        while current != None:
	            mapping[current] = Node(current.val)    
	            current= current.next

	        for node in mapping:
	            if node.next:
	                mapping[node].next = mapping[node.next]
	            if node.random:
	                mapping[node].random = mapping[node.random]
	            
	            
	        return mapping[head]

}
