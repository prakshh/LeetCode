
public class Day_24_240_Search_a_2D_Matrix_II {
	
	class Solution {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        int m=matrix.length-1;
	    int n=matrix[0].length-1; 
	 
	    int i=m; 
	    int j=0;
	 
	    while(i>=0 && j<=n){
	        if(target < matrix[i][j]){
	            i--;
	        }else if(target > matrix[i][j]){
	            j++;
	        }else{
	            return true;
	        }
	    }
	 
	    return false;
	    }
	}

}
