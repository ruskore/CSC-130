/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 10/31/2019
 * Time: 7:39 PM
 */
public interface BinaryTreeADT<T> {
    <T extends Comparable<T>> void insert(T value);
    <T extends Comparable<T>> Node insertRec(Node root, T value);
    void preorderPrint();
    void inorderPrint();
    void postorderPrint();
    void Preorder(Node root);
    void Inorder(Node root);
    void Postorder(Node root);

}
