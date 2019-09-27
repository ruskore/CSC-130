
public class LinkedList<T> implements ListADT<T> {

    private int count;
    private Node<T> head;

    public LinkedList() {
        this.count =0;
        this.head = null;
    }

    @Override
    public void push(T element) {
        Node<T> temp = new Node<T> (element);

        temp.setNext(this.head);
        this.head = temp;
        this.count++;
    }

    @Override
    public int find(T name) {

        int result = -1;
        if (isEmpty()){
            System.out.println("List is empty");
        }
        else {
            Node<T> current = this.head;
            int index = 0;
            while(current != null) {
                if(current.getElement() == name) {
                    result = index;
                }
                current = current.getNext();
                index++;
            }

        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public int size() {
        return this.count;
    }
}
