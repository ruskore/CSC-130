
public class Node<T> {
    private Node<T> next;
    private T element;

    public Node() {
        this.next = null;
        this.element = null;
    }

    public Node(T value) {
        this.next = null;
        this.element = value;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public T getElement() {
        return this.element;
    }

    public  void setElement(T value) {
        this.element = value;
    }
}
