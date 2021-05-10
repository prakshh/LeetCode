
public class Day_02_630_Course_Schedule_III {
	
	class Solution {
	    public int scheduleCourse(int[][] courses) {
	        
	    	Arrays.parallelSort(courses,(a,b)->a[1]-b[1]);
	    	PriorityQueue<Integer> q=new PriorityQueue<Integer>((a,b)->b-a);
	    	int time=0;
	    	
	    	for(int i=0;i<courses.length;i++) {
	    		if(time+courses[i][0]<=courses[i][1]) {
	    			q.offer(courses[i][0]);
	    			time+=courses[i][0];
	    		}
	    		else if(!q.isEmpty() && q.peek()>courses[i][0]) {
	    			time+=courses[i][0]-q.poll();
	    			q.offer(courses[i][0]);
	    		}
	    	}
	    	
	    	return q.size();
	    }
	}
	        
	    


}
