public class MaxHeap
{
    private int[] Heap;
    private int size;
    private int maxsize;
 
    private static final int FRONT = 1;
 
    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }
 
}