import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Day_23_Sort_the_Matrix_Diagonally {
	class Solution {
	    public int[][] diagonalSort(int[][] mat) {
	        int m = mat.length;
	        int n = mat[0].length;
	        // i-j
	        Map<Integer, PriorityQueue<Integer>> map =new HashMap<>();


	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                int diagonalKey = i-j;
	                PriorityQueue<Integer> pq = map.getOrDefault(diagonalKey, new PriorityQueue<>());
	                pq.offer(mat[i][j]);
	                map.put(diagonalKey, pq);
	            }
	        }

	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                int diagonalKey = i-j;
	                PriorityQueue<Integer> pq = map.get(diagonalKey);

	                mat[i][j] =pq.poll();
	            }
	        }

	        return mat;
	    }
	}
}
