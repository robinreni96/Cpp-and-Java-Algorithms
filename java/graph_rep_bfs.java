import java.util.*;

public class graph_rep_bfs
{

  static class Graph
  {
    int V;
    private LinkedList<Integer> adj[];

  	public Graph(int V)
  	{
  		this.V=V;
  		// Creating LinkedList for the graph vertices
  		adj = new LinkedList[V];
  		// Creating linkedlist for every nodes to denotes its edges
  		for(int i=0;i<V;i++) adj[i]=new LinkedList();
  	}

  void addEdge(int v,int w)
  {
  	// Gn src and destination mapping it since its directed ,we just denote the correct path
  	adj[v].add(w);
  }

  void BFS(int s)
  {
  	//Mark all vertices are not visited
  	boolean visited[] = new boolean[V];

  	LinkedList<Integer> queue=new LinkedList<Integer>();

  	visited[s]=true;
  	queue.add(s);

  	while(queue.size() != 0)
  	{
  		// Eject from the queue and print it
  		s=queue.poll();
  		System.out.println(s+" ");


        // Create the iterator where it direct to the node which it directs
  		Iterator<Integer> i=adj[s].listIterator();
  		while(i.hasNext())
  		{
  			int n=i.next();
  			if(!visited[n])
  			{
  				visited[n]=true;
  				queue.add(n);
  			}
  		}
  	}
  }


  }


	public static void main(String args[])
	{
		Graph gp=new Graph(4);

		gp.addEdge(2,1);
		gp.addEdge(1,0);
		gp.addEdge(3,2);
		gp.addEdge(0,3);

		System.out.println("Following is BFS "+"With 0 as vertex");
		gp.BFS(0);
	}
}