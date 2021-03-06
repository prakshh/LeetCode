public class Day_10_1649_Create_Sorted_Array_through_Instructions {
    class Solution {
    public int createSortedArray(int[] instructions) {
        int max = 0; 
        for(int i : instructions){
            max = Math.max(i, max);
        }
        
        Fenwick fenwick = new Fenwick(max+2);
        int res = 0;
        for(int i = 0; i < instructions.length; i++) {
            int curr = instructions[i];
            int lower = fenwick.sumRange(0, curr-1);
            int higher = fenwick.sumRange(curr+1, max);
            res = res + Math.min(lower, higher);
            res = res % 1000000007;
            fenwick.update(curr, 1);
        }
        
        return res;
    }
}

class Fenwick {
    int[] arr;
    Fenwick(int len){
        this.arr = new int[len];
    }
    
    //Sum
    public int sumRange(int beg, int end){
        return sum(end+1) - sum(beg);
    }
    
    public int sum(int i){
        int sum = 0;
        while(i > 0){
            sum = sum + arr[i];
            i  = i - (i & -i);
        }
        return sum;
    }
    
    //Update Count
    public void update(int i, int val){
        i++;
        while(i < arr.length){
            arr[i] = arr[i] + val;
            i = i + (i&-i);
        }
    }
    
}
        
    

}