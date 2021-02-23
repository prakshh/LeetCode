
public class Day_23_524_Longest_Word_in_Dictionary_through_Deleting {
	
	class Solution {
	    public String findLongestWord(String s, List<String> d) {
	        Collections.sort(d, (a, b) -> a.length() == b.length() ?
	            a.compareTo(b) : b.length() - a.length());

	        for (String word : d) {
	            if (isSubsequence(word, s)) {
	                return word;
	            }
	        }
	        return "";
	    }

	    public boolean isSubsequence(String str1, String str2) {
	        int index1 = 0;
	        for (int index2 = 0; index2 < str2.length() && index1 < str1.length(); index2++) {
	            if (str1.charAt(index1) == str2.charAt(index2)) {
	                index1++;
	            }
	        }
	        return index1 == str1.length();
	    }
	}

}
