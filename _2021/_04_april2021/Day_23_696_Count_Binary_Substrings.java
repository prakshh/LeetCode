
public class Day_22_696_Count_Binary_Substrings {
	
	class Solution {
	    public int countBinarySubstrings(String s) {
	                int[] arr = new int[s.length()];
	        int t=0;
	        arr [0] = 1; // 01 or 10 to ensure that the case
	        for(int i = 0;i<s.length()-1;i++){
	            if(s.charAt(i)!=s.charAt(i+1)){
	                arr[++t]=1;
	            }else{
	                arr[t]++;
	            }
	        }
	        
	        int ans = 0;
	        for(int i = 1;i<=t;i++){
	            ans+=Math.min(arr[i-1],arr[i]);
	        }
	        return ans;
	    }
	}

}
