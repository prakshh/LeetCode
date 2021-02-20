
public class Day_11_242_Valid_Anagram {
	
	class Solution {
	    public boolean isAnagram(String s, String t) {
	        char[] sChar = s.toCharArray();
	         char[] tChar = t.toCharArray();

	         Arrays.sort(sChar);
	         Arrays.sort(tChar);
	         return (new String(sChar)).equals(new String(tChar));
	    }
	}

}
