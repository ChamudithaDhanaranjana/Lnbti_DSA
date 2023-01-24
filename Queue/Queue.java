public class Queue {
  int MAXSIZE = 4;
  
  int items[] = new int[MAXSIZE];
  int front, rear;

  Queue() {
    front = -1;
    rear = -1;
  }

  boolean isFull() {
    if (rear == MAXSIZE - 1) {
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (front < 0 || front > rear)
      return true;
    else
      return false;
  }

  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } 
	else {
	if (front == -1)
		front = 0;
		rear++;
	  items[rear] = element;
      System.out.println("Inserted " + element);
    }
  }

  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    } else {
      element = items[front];
		  if (front >= rear) {
			front = rear = -1;
		  } 
		  else {
			front++;
		  }
      System.out.println("Deleted " + element);
      return (element);
    }
  }

  void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Queue is Empty");
    } 
	else {
      for (i = front; i <= rear; i++){
        System.out.println(items[i] + "  ");
	  }
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
	
    q.deQueue(); //Queue Empty
	
    q.enQueue(10);
    q.enQueue(29);
    q.enQueue(32);
    q.enQueue(41);
    q.enQueue(59);

    q.deQueue();

    q.display();

  }
}