
public class DNode<T> {
    private DNode<T> next;
    private DNode<T> prev;
    private T element;

    public DNode() {
        this.next = null;
        this.prev = null;
        this.element = null;
    }

    public DNode(T value) {
        this.next = null;
        this.prev = null;
        this.element = value;
    }

    public void setNext(DNode<T> node) {
        this.next = node;
    }

    public void setPrev(DNode<T> node) {
        this.prev = node;
    }

    public DNode<T> getNext() {
        return this.next;
    }

    public DNode<T> getPrev() {
        return this.prev;
    }

    public T getElement() {
        return this.element;
    }

    public  void setElement(T value) {
        this.element = value;
    }
}
