
public class LinkedDList<T> implements DListADT<T> {

    private int count;
    private DNode<T> head;
    private DNode<T> tail;

    public LinkedDList() {
        this.count =0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void push(T element) {
        DNode<T> temp = new DNode<T> (element);

        temp.setNext(this.head);
        temp.setPrev(null);

        if(head != null)
            this.head.setPrev(temp);
        this.head = temp;
        this.count++;
    }

    @Override
    public void find(T name) {

        if (isEmpty()){
            System.out.println("List is empty");
        }
        else {
            DNode<T> current = this.head;
            int index = 0;
            while(current != null) {
                if(current.getElement() == name) {
                    System.out.println("\n\n" + name + " is found in element " + index);
                    System.out.println("The next to " + name + " is " + current.getNext().getElement());
                    System.out.println(current.getPrev().getElement() + " is before " + name);
                }
                current = current.getNext();
                index++;
            }
        }
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
