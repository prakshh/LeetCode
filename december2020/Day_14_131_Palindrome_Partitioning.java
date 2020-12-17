public class Day_14_131_Palindrome_Partitioning {
    class Solution {
    
        public List<List<String>> partition(String s) {
         List<List<String>> result = new ArrayList();
         findAll(s,result,new ArrayList());
         return result;
        }
        
        void findAll(String s,List<List<String>> result,List<String> temp){
            
            if(s.length()==0){
                result.add(new ArrayList(temp));
            }
           for(int i=0;i<s.length();i++){  
               String leftPar= s.substring(0,i+1);
               if(isPalindrome(leftPar)){
                   temp.add(leftPar);
                   findAll(s.substring(i+1),result,temp); 
                   temp.remove(temp.size()-1);
               }
           }
        }
        
        
        boolean isPalindrome(String str){
            int l=0;
            int r=str.length()-1;
            if(l==r)return true;
            while(l<r){
                if(str.charAt(l)!=str.charAt(r))return false;
                l++;r--;
            }
            return true;
       } 
       } 
}