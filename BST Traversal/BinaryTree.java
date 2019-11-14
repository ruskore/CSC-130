import java.io.*;
import java.util.*;

/**
 * Porof.: Abu-Samaha
 * Cource: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 10/31/2019
 * Time: 1:15 PM
 */
public class BinaryTree <T> implements BinaryTreeADT<T>  {

    Node root;

    BinaryTree(String filename) throws FileNotFoundException {

        File filePath = new File("src/" + filename);
        Scanner reader = new Scanner(filePath);

        while(reader.hasNextLine()) {
            insert(reader.next());
        }
    }

    public   <T extends Comparable<T>>
    void insert(T value) {
        root = insertRec(root, value);
    }

    /* A recursive method to insert a new value in the Binary Tree */
    /* Notice, that the tree is sorted */
    public <T extends Comparable<T>>
    Node insertRec(Node root, T value) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(value);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (value.compareTo((T)root.value) < 0)
            root.left = insertRec(root.left, value);
        else if (value.compareTo((T)root.value) > 0)
            root.right = insertRec(root.right, value);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls Inorder()
    public void inorderPrint()  {
        Inorder(root);
    }

    // This method mainly calls Postorder()
    public void postorderPrint()  {
        Postorder(root);
    }

    // This method mainly calls Preorder()
    public void preorderPrint()  {
        Preorder(root);
    }

    // A utility function to do inorder traversal of BT
    public void Inorder(Node root) {
        if (root != null) {
            Inorder(root.left);
            System.out.print(root.value + " ");
            Inorder(root.right);
        }
    }

    // A utility function to do postorder traversal of BT
    public void Postorder(Node root) {
        if (root != null) {
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.value + " ");
        }
    }

    // A utility function to do preorder traversal of BT
    public void Preorder(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
}