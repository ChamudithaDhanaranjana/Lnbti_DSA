class LinkedList {
	Node head; // head of list
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void deleteNode(int position)
	{
		if (head == null)
			return;

		Node temp = head;

		if (position == 0) {
			head = temp.next; 
			return;
		}

		for (int i = 0; temp != null && i < position - 1;
			i++)
			temp = temp.next;

		
		if (temp == null || temp.next == null)
			return;
		Node next = temp.next.next;

		temp.next
			= next; 
	}

	public void printList()
	{
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args)
	{
		
		LinkedList llist = new LinkedList();

		llist.push(10);
		llist.push(20);
		llist.push(30);
		llist.push(40);
		llist.push(50);
        llist.push(60);
        llist.push(70);
        llist.push(80);
        llist.push(90);
        llist.push(100);

		System.out.println("\n Linked list before: ");
		llist.printList();

		llist.deleteNode(2); // Delete node at position 2
        llist.deleteNode(4); // Delete node at position 4
        llist.deleteNode(6); // Delete node at position 6

		System.out.println(
			"\nLinked List after Delettion: ");
		llist.printList();
	}
}
