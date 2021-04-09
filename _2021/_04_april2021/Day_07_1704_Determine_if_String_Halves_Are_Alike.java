package LeetCode._2021._04_april2021;
public class Day_07_1704_Determine_if_String_Halves_Are_Alike {

    class Solution {
        // TC : O(len)
        // SC : O(1)
        public boolean halvesAreAlike(String s) {
            Set<Character> vowelSet = new HashSet<>();
            vowelSet.add('a');
            vowelSet.add('e');

            vowelSet.add('i');

            vowelSet.add('o');
            vowelSet.add('u');
            vowelSet.add('A');
            vowelSet.add('E');
            vowelSet.add('I');
            vowelSet.add('O');
            vowelSet.add('U');
            int len = s.length();
            return countVowels(0,len/2,s, vowelSet) == countVowels(len/2,len, s, vowelSet);

        }

        private int countVowels(int startIndex, int endIndex, String s, Set<Character> vowelSet){
            int countV = 0;
            for(int i=startIndex;i<endIndex;i++){
                if(vowelSet.contains(s.charAt(i)))
                {
                    countV++;
                }
            }
            return countV;
        }
    }




}
