class Inorder
{
	Node root;
	class Node // used as a nested class since node is created inside a tree
	{
		int value;
		Node LeftChild;
		Node RightChild;
		
		Node (int item) {
		
			this.value = item;
			
		}
	}
	
	public void inorder (Node node)
	{
		if (node!=null)
		{
			
			inorder (node.LeftChild);
			System.out.print (node.value+" ");
			inorder (node.RightChild);
		}
	}

	void print (Node node)
	{
		System.out.print ("In-order\t:");
		inorder (node);
		System.out.println ("\n");
	}
	
	
	public Node insert (Node node , int value) {
		
		if (node == null){
			return new Node (value);
		}
		if (value < node.value){
			
			node.LeftChild = insert (node.LeftChild, value);
		}
		else if (value> node.value) {
			node.RightChild = insert (node.RightChild,value);
		}
		return node;
	}

	
	public static void main (String args[]) {
		Inorder bst = new Inorder ();
		Node root = bst.root;		
		root = bst.insert (bst.root ,12);
		root = bst.insert (root , 26);
		root = bst.insert (root , 80);
		root = bst.insert (root , 54);
		root = bst.insert (root, 38);
		root = bst.insert (root, 42);
		root = bst.insert (root, 65);
		root = bst.insert (root, 10);
		root = bst.insert (root, 55);
		root = bst.insert (root, 43);
		
		bst.print(root);
		
	}
	
}