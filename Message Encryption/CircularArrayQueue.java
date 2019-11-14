
/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/13/2019
 * Time: 1:01 PM
 */

public class CircularArrayQueue<T> implements QueueADT<T> {
    private final static int MAX_SIZE = 50;
    private int head;   // The index of the first node in queue
    private int tail;   // The index of the last node in queue
    private int count;  // The queue size
    private T[] queue;

    /**
     * Creates an empty queue with specified size
     * @param initial_size size of a new queue
     */
    public CircularArrayQueue(int initial_size) {
        this.head = 0;
        this.tail = 0;
        this.count = 0;
        this.queue = (T[]) (new Object[initial_size]);
    }

    /**
     * Creates new queue with default size
     */
    public CircularArrayQueue() {
        this(MAX_SIZE);
    }

    /**
     * Adds an element to the teail of the queue
     * @param element to be added
     */
    @Override
    public void enqueue(T element) {

        if(size() == this.queue.length) {
            expandQueue();
        }

        this.queue[this.tail] = element;
        this.tail = (this.tail + 1) % this.queue.length;
        this.count++;
    }

    /**
     * Returns the value of the head node, removes the node
     * @return value stored in the head node of the queue
     */
    @Override
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }

        T result = this.queue[this.head];
        this.queue[this.head] = null;
        this.head = (this.head + 1) % this.queue.length;
        this.count--;

        return result;
    }

    /**
     * Keeps the node and returns it's value only
     * @return value of the head node w/o removing the node
     */
    @Override
    public T head() throws  EmptyCollectionException{
        if (isEmpty()) {
            throw new EmptyCollectionException("queue");
        }

        return this.queue[this.head];
    }

    /**
     * Returns a boolean value true/false
     * @return true if queue is empty
     */
    @Override
    public boolean isEmpty() {
        return (this.count == 0);
    }

    /**
     * @return size of the queue
     */
    @Override
    public int size() {
        return this.count;
    }

    /**
     * Generates custom display of the class
     * @return
     */
    @Override
    public String toString() {
        String result = "";
        int scan = 0;

        while(scan < this.count) {
            if(this.queue[scan] != null) {
                result += this.queue[scan];
            }
            scan++;
        }
        return result;
    }

    /**
     * Expands the queue array
     * Doubles the size of the original array
     */
    private void expandQueue() {
        T[] expanded = (T[]) (new Object[this.queue.length *2]);

        for(int scan = head; scan < this.count; scan++)
        {
            expanded[scan] = this.queue[this.head];
            this.head = (this.head + 1) % this.queue.length;
        }

        this.head = 0;
        this.tail = this.count;
        this.queue = expanded;
    }
}
