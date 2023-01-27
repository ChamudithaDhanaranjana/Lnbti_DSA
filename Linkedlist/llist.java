class LinkedList {

	Node head; // head of list

	
	static class Node {

		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		} // Constructor
	}

	
	public void printList()
	{
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	
	public static void main(String[] args)
	{
		
		LinkedList llist = new LinkedList();

		llist.head = new Node(11);
		Node second = new Node(62);
		Node third = new Node(53);
        Node forth = new Node(93);
        Node fifth = new Node(34);
       

		llist.head.next = second; 
		second.next
			= third; 
        third.next
          = forth;
        forth.next
          =fifth;
       
		llist.printList();
	}
}
