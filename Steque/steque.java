import java.util.ArrayList;
import java.util.NoSuchElementException;

interface Steque<T>
	{
   	        public void push(T item);
   		public T pop();
    		public void enqueue();
    		public boolean isEmpty();
    		public void print();

	}
	
public class Steque<Item> implements Iterable<Item> {

	private Node first, last;
	
	private class Node {
		Item item;
		Node next;
	}
	
	
	public Steque() {
		first = last = null;
	}
	
	
	
	public void enqueue(Item item) {
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (first == null)
			first = last;
		else
			oldLast.next = last;
	}
	
	
	
	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		if (last == null) 
			last = first;
	}
	
	public Item pop() {
		if (isEmpty())
			throw new NoSuchElementException("No element exists in Steque");
		Item item = first.item;
		first = first.next;
		return item;
	}
	turn true if steque is empty, false otherwise.
	 
	public boolean isEmpty() {
		return first == null || last == null;
	}
	
	
	public int size() {
		int count = 0;
		for(Item item : this) {
			count++;
		}
		return count;
	}
	
	
	public Iterator<Item> iterator() {
		return new StequeIterator(); 
	}
	
	
	public class StequeIterator implements Iterator<Item> {
		Node current = first;
		public boolean hasNext() {
			return current != null;
		}
		
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		public void remove() {
			throw new UnsupportedOperationException("Not supported");
			
		}
	}
}

 
