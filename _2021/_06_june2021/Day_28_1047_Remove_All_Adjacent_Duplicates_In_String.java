
public class Day_28_1047_Remove_All_Adjacent_Duplicates_In_String {
	
	// TC : O(n)
	// SC : O(n)
	class Solution {
	     public String removeDuplicates(String s) {
	         Stack<Character> st = new Stack<>();
	         for(char c : s.toCharArray()){
	             if(!st.empty() && st.peek() == c){
	              st.pop();
	             } else {
	                 st.push(c);
	             }

	         }
	         String ans = "";
	         while(!st.empty()){
	             ans = st.pop() + ans;
	         }
	         return ans;
	     }

	}

}
