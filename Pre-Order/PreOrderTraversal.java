class PreOrder
{
	TreeNode root;
	
	public static void main(String[] args) throws Exception 
	{
		PreOrder po = new PreOrder(); 
		PreOrder.TreeNode root = new PreOrder.TreeNode("A"); 
		po.root = root; 
		po.root.left = new PreOrder.TreeNode("B"); 
		po.root.left.left = new PreOrder.TreeNode("C"); 
		po.root.left.right = new PreOrder.TreeNode("D"); 
		po.root.right = new PreOrder.TreeNode("E"); 
		po.root.right.right = new PreOrder.TreeNode("F");
		
		System.out.println("Binary Tree in Pre-Order using recusion"); 
		po.preOrder();
	}
	
	static class TreeNode 
	{ 
		String data; 
		TreeNode left, right; 
		
		TreeNode(String value) 
		{ 
			this.data = value; 
			left = right = null; 
		} 
		
		boolean isLeaf() 
		{ 
			return left == null ? right == null : false; 
		} 
	}
	
	public void preOrder() 
	{ 
		preOrder(root); 
	}
	
	private void preOrder(TreeNode node) 
	{ 
		if (node == null) 
			{
			return; 
			} 
		System.out.printf("%s ", node.data); 
		preOrder(node.left); 
		preOrder(node.right); 
	} 
}