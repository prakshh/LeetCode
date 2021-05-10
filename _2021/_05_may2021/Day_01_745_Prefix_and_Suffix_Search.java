package _05_may2021;

public class Day_01_745_Prefix_and_Suffix_Search {
	
	class WordFilter {

	     HashMap<String, List<Integer>> prefMap = new HashMap<>();
	        HashMap<String, List<Integer>> suffMap = new HashMap<>();
	        String[] words;

	        void addToPref(String word, int idx) {
	            int wlen = word.length();
	            for (int i = 1; i <= wlen; i++) {
	                prefMap.computeIfAbsent(word.substring(0, i), k -> new ArrayList<>()).add(idx);
	            }
	        }

	        void addToSuff(String word, int idx) {
	            int wlen = word.length();
	            for (int i = 0; i < wlen; i++) {
	                suffMap.computeIfAbsent(word.substring(i), k -> new ArrayList<>()).add(idx);
	            }
	        }

	        public WordFilter(String[] words) {
	            int size = words.length;
	            this.words = words;
	            for (int i = 0; i < size; i++) {
	                addToPref(words[i], i);
	                addToSuff(words[i], i);
	            }
	        }

	        public int f(String prefix, String suffix) {
	            List<Integer> l1 = prefMap.get(prefix);
	            List<Integer> l2 = suffMap.get(suffix);
	            if (prefix.length() == 0 || suffix.length() == 0) {
	                if (prefix.length() == 0 && suffix.length() == 0) {
	                    return words.length-1;
	                }
	                if (prefix.length() == 0) {
	                    return l2 == null ? -1 : l2.get(l2.size()-1);
	                }
	                return l1 == null ? -1 : l1.get(l1.size()-1);
	            }
	            if (l1 == null || l2 == null) return -1;
	            int idx1 = l1.size()-1;
	            int idx2 = l2.size()-1;
	            while (idx1 >= 0 && idx2 >= 0) {
	                int i1 = l1.get(idx1);
	                int i2 = l2.get(idx2);
	                if (i1 == i2) return i1;
	                if (i1 < i2)
	                    idx2--;
	                else idx1--;
	            }
	            return -1;
	        }
	}

	/**
	 * Your WordFilter object will be instantiated and called as such:
	 * WordFilter obj = new WordFilter(words);
	 * int param_1 = obj.f(prefix,suffix);
	 */


	        
	    

	        
	    





}
