import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Porof.: Abu-Samaha
 * Cource: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 10/31/2019
 * Time: 1:05 PM
 */
public class Client {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);
        System.out.print("Files contain the data:\n" +
                "data_int.txt\ndata_string.txt\n" +
                "Enter the name of the file containing either integers or strings: ");
        String filename = scan.nextLine();

        BinaryTree tree = new BinaryTree(filename);

        // print inorder traversal
        System.out.println("\nBinary Tree Preorder traverse");
        tree.preorderPrint();

        // print inorder traversal
        System.out.println("\n\nBinary Tree Inorder traverse");
        tree.inorderPrint();

        // print inorder traversal
        System.out.println("\n\nBinary Tree Postorder traverse");
        tree.postorderPrint();

        System.out.println();
    }
}
