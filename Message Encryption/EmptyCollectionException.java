
/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/13/2019
 * Time: 5:21 PM
 */

public class EmptyCollectionException extends RuntimeException {
    public EmptyCollectionException (String collection) {
        super("The " + collection + " is empty.");
    }
}
