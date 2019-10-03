package sum;

/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 9/9/2019
 * Time: 11:26 PM
 */

public interface SumADT<T> {

  public void setSum(T value1, T value2, T total);

  public String toString();

}
