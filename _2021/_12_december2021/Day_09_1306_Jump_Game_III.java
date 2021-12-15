public class Day_09_1306_Jump_Game_III {
    class Solution {
        public boolean canReach(int[] arr, int start) {
            return dfs(arr, new HashSet<>(), start);
        }

        private boolean dfs(int[] arr, Set<Integer> visited, int index) {
            if (arr[index] == 0) return true;
            if (!visited.add(index)) return false;
            if (visited.size() == arr.length) return false;

            int left = index - arr[index], right = index + arr[index];

            return (left >= 0 && dfs(arr, visited, left))
                    || (right < arr.length && dfs(arr, visited, right));
        }
    }
}