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

public class GenericSum<T> implements SumADT<T> {

  private T augend; // The first operand (optional for better displaying representation)
  private T addend; // The second operand  (optional for better displaying representation)
  private T sum; // The sum

  /** Constructor */
  public void GenericSum() {
    this.augend = null; // first operand's default value
    this.addend = null; // second operand's default value
    this.sum = null;    // result's default value
  }

  /**
   * nitializes local variable
   * @param value1  //first operand
   * @param value2  // second operand
   * @param total   // result
   */
  @Override
  public void setSum(T value1, T value2, T total) {
    this.sum = total;
    this.augend = value1;
    this.addend = value2;
  }

  /**
   * Combines the local variables into a single string
   * @return entire string for the class
   */
  @Override
  public String toString() {
    String answer = "Result: ";
    answer += augend; // optional
    answer += " + "; // optional
    answer += addend; // optional
    answer += " = "; // optional
    answer += sum;
    return answer;
  }
}
