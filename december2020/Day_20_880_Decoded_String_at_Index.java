public class Day_20_880_Decoded_String_at_Index {
    class Solution {
        public String decodeAtIndex(String S, int K) {
            
            long num=0,k=K;
            int n=S.length();
            long[] sum=new long[n];
            long[] sum2=new long[n];
            Map<Integer,String> map=new HashMap<>();
            
            for(int i=0;i<n;i++) {
                if(S.charAt(i)>='a' && S.charAt(i)<='z') {
                    num++;
                    map.put(i, S.substring(i, i+1));
                    sum2[i]=0;
                }
                else {
                    sum2[i]=num;
                    num=num*(S.charAt(i)-'0');	
                }
                sum[i]=num;
            }
            
            while(k>=0) {
                int l=0,r=n-1,p=0;
                while(l<=r) {
                    int mid=(l+r)/2;
                    if(sum[mid]>=k) {
                        p=mid;
                        r=mid-1;
                    }
                    else
                        l=mid+1;
                }
                
                if(sum2[p]==0)
                    return map.get(p);
                
                k=k%sum2[p];
                if(k==0) k=sum2[p];
            }
     
            return "";
        }
    }
    
}