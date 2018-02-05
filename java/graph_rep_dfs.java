import java.util.*;
import java.io.*;

public class graph_rep_dfs
{

static class Graph
{
	int V;
	LinkedList<Integer> adj[];

	public Graph(int V)
	{
		this.V=V;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++) adj[i]=new LinkedList();
	}

void addEdge(int v,int w)
{
	adj[v].add(w);
}


void DFS_HELPER(int s,boolean visited[])
{
	visited[s]=true;
	System.out.println(s+" ");
	Iterator<Integer> i=adj[s].listIterator();
	while(i.hasNext())
	{
		int n=i.next();
		if(!visited[n])
		{
           DFS_HELPER(n,visited);
		}
	}
}

void DFS(int s)
{
	boolean visited[]=new boolean[V];

	DFS_HELPER(s,visited);
}


}

	public static void main(String args[])
	{
		Graph gp=new Graph(4);

		gp.addEdge(0,1);
		gp.addEdge(0,2);
		gp.addEdge(1,3);
		gp.addEdge(3,0);

		gp.DFS(0);

	}
}