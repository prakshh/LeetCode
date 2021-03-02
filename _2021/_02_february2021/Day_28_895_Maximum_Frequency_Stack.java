
public class Day_28_895_Maximum_Frequency_Stack {
	
	class FreqStack {
	    
	    private HashMap<Integer , Integer > freq ;
	    private HashMap<Integer , Stack<Integer> > group;
	    private int maxFreq;
	    

	    public FreqStack() {
	        freq = new HashMap<>();
	        group = new HashMap<>();
	        maxFreq = 0;
	    }
	    
	    public void push(int x) {
	        int f = freq.getOrDefault(x , 0) + 1;
	        freq.put(x , f);
	        if(f > maxFreq )
	            maxFreq = f;
	        Stack<Integer> st = group.getOrDefault(f , new Stack<Integer>());
	        st.push(x);
	        group.put(f,st);
	    }
	    
	    public int pop() {
	        int x = group.get(maxFreq).pop();
	        freq.put(x , freq.get(x) - 1);
	        if(group.get(maxFreq).size() == 0){
	            group.remove(maxFreq);
	            maxFreq--;
	        }
	        return x;
	    }
	}

	/**
	 * Your FreqStack object will be instantiated and called as such:
	 * FreqStack obj = new FreqStack();
	 * obj.push(x);
	 * int param_2 = obj.pop();
	 */

}
