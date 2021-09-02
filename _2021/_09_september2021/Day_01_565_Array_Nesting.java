public class Day_01_565_Array_Nesting {

    class Solution {

        public int arrayNesting(int[] a) {
            int maxsize = 0;
            for (int i = 0; i < a.length; i++) {
                int size = 0;
                for (int k = i; a[k] >= 0; size++) {
                    int ak = a[k];
                    a[k] = -1; // mark a[k] as visited;
                    k = ak;
                }
                maxsize = Integer.max(maxsize, size);
            }

            return maxsize;
        }


    }

}