/**
 * Porof.: Abu-Samaha
 * Cource: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/19/19
 * Time: 12:37 PM
 */
public class Client<T> {
    public static void main(String[] args) {
        Object[] array = {'d','t','a','b','a','v','u'};
        Object val = 'a';
        search(array, val);
        Object[] array_2 = {4,6,9,3,7,9,8};
        Object val_2 = 9;
        search(array_2, val_2);
    }

    private void search(T[] array, T val) {
        int match = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == val) {
                match++;
                System.out.println(val + " is found " + match + " times in position " + (i + 1));
            }
        }
    }
}
