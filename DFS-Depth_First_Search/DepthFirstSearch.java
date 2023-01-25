class DepthFirstSearch {
	
	private class Node {
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
		
		Stack<Node> nodeStack = new Stack<Node>();
		nodeStack.push(root);
		
		while(!nodeStack.isEmpty()) {
			Node node = nodeStack.pop();
			System.out.print(node.data + " ");
			
			if(node.right != null) {
				nodeStack.push(node.right);
			}
			if(node.left != null) {
				nodeStack.push(node.left);
			}
		}
	}
}

