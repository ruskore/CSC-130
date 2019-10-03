
/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/13/2019
 * Time: 12:54 PM
 */

public interface QueueADT<T> {
    public void enqueue(T element);
    public T dequeue();
    public T head();
    public boolean isEmpty();
    public int size();
    public String toString();
}

