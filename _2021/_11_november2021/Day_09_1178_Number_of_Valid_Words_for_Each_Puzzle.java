public class Day_09_1178_Number_of_Valid_Words_for_Each_Puzzle {
    class Solution {
        public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
            Map<Integer, Integer> map = new HashMap<>();
            for (String word : words) {
                int mask = 0;
                for (char c : word.toCharArray()) {
                    mask |= 1 << c - 'a';
                }
                map.put(mask, map.getOrDefault(mask, 0) + 1);
            }

            List<Integer> ans = new ArrayList<>();
            for (String puzzle : puzzles) {
                int mask = 0, first = 1 << puzzle.charAt(0) - 'a';
                for (char c : puzzle.toCharArray()) {
                    mask |= 1 << c - 'a';
                }
                int curr = mask, total = 0;
                while (curr > 0) {
                    if ((curr & first) == first && map.containsKey(curr)) {
                        total += map.get(curr);
                    }
                    curr = (curr - 1) & mask;
                }
                ans.add(total);
            }
            return ans;
        }
    }
}