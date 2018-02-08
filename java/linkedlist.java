/'''
Print: LinkedList:		[1][2][3]
Size of the LinkedList:		3
Get the Element at index 3	3
Remove the Element at index 2	true
Size of LinkedList		2
Print: LinkedList		[1][2]
'''/

public class linkedlist
{
  // Declaring a LinkedList as linklist
 public static LinkedList linklist;
 public static void main(String args[])
 {
  // Allocating memory for the linkedlist
 	linklist = new LinkedList();

  // add some elements
  linklist.add("1");
  linklist.add("2");
  linklist.add("3");

  // Using some function of it
  System.out.println("Print: LinkedList:\t\t"+linklist);
  System.out.println("Size of the LinkedList:\t\t"+linklist.size());
  System.out.println("Get the Element at index 3\t"+linklist.get(2));
  System.out.println("Remove the Element at index 2\t"+linklist.remove(2));
  System.out.println("Size of LinkedList\t\t"+linklist.size());
  System.out.println("Print: LinkedList\t\t"+linklist);
 }
}

class LinkedList
{
	private static int counter;
	// Creating the head node
	private Node head;

    // Default Linkedlist Constructor
	public LinkedList(){}

    // appends the specified element to the end of this list
    public void add(Object data)
    {
    	if(head==null) head=new Node(data);

    Node temp_node=new Node(data);
    Node current_node=head;

    if(current_node!=null)
    {
    	//Starting at the head Node,crawl to end of the list
    	while(current_node.getNext()!=null)
    	{
    		current_node=current_node.getNext();
    	}

    	current_node.setNext(temp_node);
    }

    // increment the number of elements variable
    incrementCounter();
    }

    private static int getCounter()
    {
    	return counter;
    }

    private static void incrementCounter()
    {
    	counter++;
    }

    private void decrementCounter()
    {
    	counter--;
    }

    //inserts the specified element to a specific position in the linked list
    public void add(Object data,int index)
    {
    	Node temp_node=new Node(data);
    	Node current_node=head;

    	if(current_node!=null)
    	{
    		// Search for the index to be inserted
    		for(int i=0;i<index && current_node!=null;i++)
    		{
    			current_node=current_node.getNext();
    		}
    	}
        // Set the temp next node refernce to the current node next
    	temp_node.setNext(current_node.getNext());

    	current_node.setNext(temp_node);

    	incrementCounter();

    }

    public Object get(int index)
    {
    	// Returns the value at the index node

    	//Check for index higher than one
    	if(index < 0) return null;

    	Node current_node=null;
    	if(head!=null)
    	{
        current_node=head.getNext();
    		for(int i=0;i<index;i++)
    		{
    			if(current_node.getNext()==null) return null;

    			current_node=current_node.getNext();
    		}

    		return current_node.getData();
    	}
    	return current_node;
    	}

    public boolean remove(int index)
    {
    	//if index is out of range,exit
    	if(index<1 || index > size()) return false;

    	Node current_node=head;

        if(head!=null)
        {
        	for (int i=0;i<index;i++)
        	{
        		if(current_node.getNext()==null) return false;
                current_node=current_node.getNext();
        	}

        	current_node.setNext(current_node.getNext().getNext());

        	decrementCounter();
        	return true;
        }

        return false;
    }

   public int size()
   {
   	// Return the size of the Linked List
     return getCounter();
   }

   public String toString()
   {
   	String output="";

   	if(head!=null)
   	{
   		Node current_node=head.getNext();
   		while(current_node!=null)
   		{
   			output+="["+current_node.getData().toString()+"]";
   			current_node=current_node.getNext();

   		}
   	}
   	return output;
   }


private class Node
{
	// Creating a Node for the next one
	Node next;

    // Data carried by this node may be of any type
	Object data;

	//Node constructor
	public Node(Object dataValue){
		next=null;
		data=dataValue;
	}

	public Object getData()
	{
		return data;
	}

	public void setData(Object dataValue)
	{
		data=dataValue;
	}

	public Node getNext()
	{
		return next;
	}

	public void setNext(Node nextValue)
	{
		next=nextValue;
	}
}
}
