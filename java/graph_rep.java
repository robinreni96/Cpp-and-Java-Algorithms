import java.util.*;

public class graph_rep{

  static class Graph
  {
     int V;
     LinkedList<Integer> adjListarray[];

     public Graph(int V){
     	// Number of Vertices
     	this.V=V;

     	//Creating the nodes
     	adjListarray=new LinkedList[V];

     	for(int i=0;i<V;i++) adjListarray[i]=new LinkedList<>();

     }

   }

    static void addEdge(Graph gp,int src,int dest)
   {
   	gp.adjListarray[src].addFirst(dest);
   	gp.adjListarray[dest].addFirst(src);
   }

    static void printGraph(Graph gp)
   {
   	for(int v=0;v< gp.V;v++)
   	{
   		System.out.println("Adjacency list of vertex "+ v);
   		System.out.println("head");
   		for(Integer pcrwal: gp.adjListarray[v])
   		{
   			System.out.println(" -> "+ pcrwal);
   		}
   		System.out.println("\n");
   	}
   }

	public static void main(String args[])
	{
		Graph gp=new Graph(6);
		addEdge(gp,2,1);
		addEdge(gp,0,3);
		addEdge(gp,1,5);
		addEdge(gp,3,4);
		addEdge(gp,3,5);

		printGraph(gp);

	}
}