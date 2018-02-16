public class BST_search_insert
{
  class Node
  {
    int key;
    Node right,left;

    public Node(int item)
    {
      key=item;
      right=left=null;
    }
  }

  Node root;

  BST_search_insert()
  {
    root=null;
  }

  void insert(int key)
  {
    root=insertRec(root,key);
  }

  Node insertRec(Node root,int key)
  {
    if(root==null)
    {
      root=new Node(key);
      return root;
    }
    if(key<root.key) root.left=insertRec(root.left,key);
    else if(key>root.key) root.right=insertRec(root.right,key);

    return root;
  }

  void inorder()
  {
    inorderRec(root);
  }

  void inorderRec(Node root)
  {
    if(root!=null)
    {
      inorderRec(root.left);
      System.out.println(root.key);
      inorderRec(root.right);
    }
  }
  public static void main(String args[])
  {
    BST_search_insert bt=new BST_search_insert();

    bt.insert(40);
    bt.insert(50);
    bt.insert(20);
    bt.insert(10);
    bt.insert(25);

    bt.inorder();
  }
}
