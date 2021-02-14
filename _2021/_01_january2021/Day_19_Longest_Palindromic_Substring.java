
public class Day_19_Longest_Palindromic_Substring {
	class Solution {
	    public String longestPalindrome(String s) {
	        String lps = "";
	            int n = s.length();
	            for (int i = 0; i < n; i++) {
	                String odd = expandPalindrome(s, i, i);
	                String even = expandPalindrome(s, i, i + 1);
	                if (lps.length() < odd.length()) {
	                    lps = odd;
	                }

	                if (lps.length() < even.length()) {
	                    lps = even;
	                }
	            }

	            return lps;
	    }
	    
	    private String expandPalindrome(String s, int l, int r) {
	            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
	                l--;
	                r++;
	            }
	            return s.substring(l + 1, r);
	        }
	    
	}
}
