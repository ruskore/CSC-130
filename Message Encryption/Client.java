
/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/13/2019
 * Time: 1:05 PM
 */

public class Client {
    public static void main(String[] args) {
        int[] key = {-1823, -1815, -1826, -1812, -1821, -1817, -1828, -1814, -1819};
        Integer keyValue;
        String encodedMessage = "";
        String decodedMessage = "";
        String message = "All programmers are playwrights and all " +
                         "computers are lousy actors.";
        QueueADT<Integer> keyQueueEnc = new CircularArrayQueue<Integer>();
        QueueADT<Integer> keyQueueDec = new CircularArrayQueue<Integer>();

        // Load key queue
        for (int scan = 0; scan < key.length; scan++){
            keyQueueEnc.enqueue (key[scan]);
            keyQueueDec.enqueue (key[scan]);
        }

        // Encode the message
        for (int scan = 0; scan < message.length(); scan++) {
            keyValue = keyQueueEnc.dequeue();
            encodedMessage += (char) (message.charAt(scan) + keyValue);
            keyQueueEnc.enqueue (keyValue);
        }

        System.out.println( "Encoded Message:\n" + encodedMessage + "\n");

        // Decode the message
        for (int scan = 0; scan < encodedMessage.length(); scan++) {
            keyValue = keyQueueDec.dequeue();
            decodedMessage += (char) (encodedMessage.charAt(scan) - keyValue);
            keyQueueDec.enqueue (keyValue);
        }

        System.out.println ( "Decoded message:\n" + decodedMessage);
    }
}