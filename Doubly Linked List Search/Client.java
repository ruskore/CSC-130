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

        LinkedDList<String> names = new LinkedDList<String>();

        names.push("Russ");
        names.push("Mike");
        names.push("Elizabeth");
        names.push("Smith");

        String nameToBeFound = "Mike";

        names.find(nameToBeFound);

    }
}
