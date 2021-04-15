package algo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;


public class GraphAlgo {
	
	
//	Input: n = 4, e = 6
//	0 -> 1, 0 -> 2, 1 -> 2, 2 -> 0, 2 -> 3, 3 -> 3
	
	private int V;
	
	private List<Integer>[] adj;
	
	public GraphAlgo(int v){
		V=v;
		
		adj=new LinkedList[v];
		
		for(int i=0;i<v;i++) {
			adj[i]= new LinkedList<>();
		}
	
	}
	
	
	 //Function to add an edge into the graph 
    public void addEdge(int v, int w) 
    { 
        adj[v].add(w);  // Add w to v's list. 
    }


	@Override
	public String toString() {
		return "GraphAlgo [V=" + V + ", adj=" + Arrays.toString(adj) + "]";
		
	} 
	
	
	// A function used by DFS 
    void DFSUtil(int v,boolean visited[]) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" "); 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> i = adj[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited); 
        } 
    } 
	
    
    // The function to do DFS traversal. It uses recursive DFSUtil() 
   public void DFS(int v) 
    { 
        // Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V]; 
  
        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited); 
    } 

}
