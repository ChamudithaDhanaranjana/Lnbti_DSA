class DepthFirstSearch {
	class Node {
		int data;
		Node left;
		Node right;
		
		private Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	public void depthFirstSearch(Node root) {
		if(root == null) {
			return;
		}
		
	Stack<Node> nodestack = new Stack<Node>();
	nodestack.push(root);
		
		while(!nodestack.isEmpty()) {
			Node node = nodestack.pop();
			System.out.print(node.data + " ");
			
			if(node.right != null) {
				nodestack.push(node.right);
			}
			if(node.left != null) {
				nodestack.push(node.left);
			}
		}
	}
	
	public static void main(String args[]) {
		Node root = new Node(11);
		root.left = new Node(7);
		root.right = new Node(23);
		root.left.left = new Node(3);
		root.left.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(28);
		root.right.left.left = new Node (14);
		root.right.left.right = new Node(20);
		
		DepthFirstSearch dfs = new DepthFirstSearch();
		dfs.depthFirstSearch(root);
	}
}
 

