package main.cp.leetcode.november;

public class Day_04_310_Minimum_Height_Trees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if ( n == 1) {
            return Collections.singletonList(0);
        }        
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for ( int[] edge : edges ){
            List<Integer> nodes = graph.containsKey(edge[0]) ? graph.get(edge[0]) : new ArrayList<>();
            nodes.add(edge[1]);
            graph.put(edge[0],nodes);
            nodes = graph.containsKey(edge[1]) ? graph.get(edge[1]) : new ArrayList<>();            
            nodes.add(edge[0]);
            graph.put(edge[1],nodes);
        }
        
        List<Integer> leaves = new ArrayList<>();
        for ( Integer node : graph.keySet() ){
            if ( graph.get(node).size() == 1){
                leaves.add(node);
            }
        }
        
        while ( n > 2 ){
            n-=leaves.size();
            List<Integer> nleaves = new ArrayList<>();
            for ( Integer node : leaves ){
                List<Integer> nbs = graph.get(node);
                Integer nl = nbs.get(0);
                graph.get(nl).remove(node);
                if ( graph.get(nl).size() == 1 ){
                    nleaves.add(nl);
                }
            }
            leaves = nleaves;
        }
        return leaves;
    }
}