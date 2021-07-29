import java.util.NoSuchElementException;

public class FerrerQueues <T> {
	private int maxQSize;
	private int front;
	private int rear;
	private int elems;
	private Object[] que;
 
	//FERRER, MARION CARYL R.
    //2ITF
	
    public FerrerQueues(int n) {
        front = rear = -1;
        maxQSize = n;
        que = new Object[maxQSize];
    }
    
    public int size()
	{
		return maxQSize;
	}

    public void clear() {
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }
    
    public boolean isFull() {
        return (rear + 1) % maxQSize == front;
    }

    public T enqueue(T el) // ****
    {
    	if (isFull())
    	{
    		throw new IndexOutOfBoundsException("Queue is full.");
        }
        if (isEmpty())
        {
            front = 0;
        }
        rear = (rear + 1) % maxQSize;
        que[rear] = el;
        elems++;
        return el;
    }

    public T dequeue()
    {
        if (isEmpty())
        {
        	throw new NoSuchElementException("Queue is empty.");
        }
        else
        {
        	
        	T el = (T) (que[front] = que[rear]);
            elems--;
            
            if (front == rear)
            {
                clear();
            }
            else
            {
                front = (front + 1) % maxQSize;
            }
            return el;
        }
    }

    public T peek()
    {
        if (isEmpty())
        	throw new NoSuchElementException("Queue is empty.");
        return (T) que[front]; 
    }
	
    public void display()
    {
    	System.out.print("\nCurrent queue: ");
        if (isEmpty())
        {
            System.out.print("The queue is empty.");
            return;
        }
        
      //FERRER, MARION CARYL R.
      //2ITF
        for (int i = 0; i < elems; i++) {
            System.out.print(que[(front + i) % maxQSize] + " ");
        }
        System.out.println();
    }
}