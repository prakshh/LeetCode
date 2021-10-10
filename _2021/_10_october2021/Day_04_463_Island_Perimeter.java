public class Day_04_463_Island_Perimeter {
    class Solution {

        // At every point count the no of surrounding zeros
        public int islandPerimeter(int[][] grid) {
            int m = grid.length;
            if(m<=0){
                return 0;
            }
            int n= grid[0].length;
            if(n<=0){
                return 0;
            }

            int count =0;
            for(int i=0;i<m;i++){

                for(int j=0;j<n;j++) {
                    if(grid[i][j]==1){
                        if(i==0 || grid[i-1][j]==0) count++;

                        if(j==0 || grid[i][j-1]==0) count++;

                        if(i+1==m || grid[i+1][j]==0) count++;

                        if(j+1==n || grid[i][j+1]==0) count++;
                    }
                }

            }

            return count;
        }
    }
}