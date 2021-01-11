public class Day_08_1662_Check_If_Two_String_Arrays_are_Equivalent {
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            return helper(word1).equals(helper(word2));
        }

        private String helper(String[] words) {
            StringBuilder sb = new StringBuilder();
            for (String word : words)
                sb.append(word);
            return sb.toString();
        }
    }

    // Using .join function from String class
    class Solution2 {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            return String.join("", word1).equals(String.join("", word2));
        }
    }
}