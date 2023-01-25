import java.util.ArrayList;
import java.util.NoSuchElementException;

interface Stack<T>
{
    public void push(T item);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public void print();



}

class MyStack<T> implements Stack<T>{
    private ArrayList<T> List;
    
    public MyStack()
    {
        List =new ArrayList<T>();
    }
    
    public void push(T item)
    {
        List.add(item);
    }
    
    public T pop()
    {
        try
        {
            return List.remove(List.size()-1);
        }
        catch(IndexOutOfBoundsException exp)
        {
            throw new NoSuchElementException("Queue is Empty. ");
        }
    }
    
    public T peek()
    {
        try
        {
            return List.get(List.size()-1);
        }
        catch(IndexOutOfBoundsException exp)
        {
            throw new NoSuchElementException("Queue is Empty. ");
        }
    }
    
    public boolean isEmpty()
    {
        return List.isEmpty();
    }
    
    public void print()
    {
        System.out.println(List);
    }
}



class StackApp
{
    public static void main(String[] args)
    {
        Stack stack = new MyStack<Integer>();
        stack.push(19);
        stack.print();
        stack.push(10);
        stack.print();
        stack.push(15);
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
    }
}