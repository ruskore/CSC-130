/**
 * Porof.: Abu-Samaha
 * Cource: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 10/31/2019
 * Time: 1:14 PM
 */
public class Node<T> {
    T value;
    Node left, right;

    public Node(T item)
    {
        this.value = item;
        left = right = null;
    }
}
