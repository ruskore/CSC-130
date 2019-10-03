/**
 * Porof.: Abu-Samaha
 * Cource: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/19/19
 * Time: 12:10 PM
 */
public class Client {
    public static void main(String[] args) {

        swapInt();

    }

    private static void swapInt(){
        int a = 5;
        int b = 10;

        System.out.println("a = " + a + "\n" + "b = " + b);

        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Now a = " + a + "\n" + "Now b = " + b);
    }
}
