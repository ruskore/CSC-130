/**
 * Porof.: Abu-Samaha
 * Cource: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/19/19
 * Time: 12:55 PM
 */
public class Client {
    public static void main(String[] args) {
        int val = 5;
        int result = factorial(val);

        System.out.println(val + "! = " + result);
    }

    private static int factorial(int val) {
        if (val == 0)
            return 1;
        else
            return val * factorial(val- 1);
    }
}
