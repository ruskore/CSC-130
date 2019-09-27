/**
 * Porof.: Abu-Samaha
 * Cource: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/26/19
 * Time: 1:00 PM
 */
public class Client {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<String>();

        names.push("Russ");
        names.push("Mike");
        names.push("Elizabeth");
        names.push("Smith");

        String nameToBeFound = "Mike";

        int result = names.find(nameToBeFound);

        System.out.println("\n" + nameToBeFound + " is found in the index " + result);
    }
}
