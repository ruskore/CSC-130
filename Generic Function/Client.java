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

public class Client {
  public static void main(String[] args) {
    getIntegerSum();
    getDoubleSum();
    getFloatSum();
    getStringSum();
    getCharSum();
    getBooleanSum();
  }

  private static void getFloatSum() {
    System.out.println("===============================");
    System.out.println("  Get sum of floats 1.2 + 2.2  ");
    System.out.println("===============================");
    float value1 = 1.2f;
    float value2 = 1.2f;
    SumADT<Float> sum = new GenericSum<Float>();
    sum.setSum(value1, value2, (value1 + value2));
    System.out.println(sum);
  }

  private static void getDoubleSum() {
    System.out.println("================================");
    System.out.println("  Get sum of doubles 1.5 + 2.5  ");
    System.out.println("================================");
    double value1 = 1.5d;
    double value2 = 2.5d;
    SumADT<Double> sum = new GenericSum<Double>();
    sum.setSum(value1, value2, (value1 + value2));
    System.out.println(sum);
  }

  private static void getIntegerSum() {
    System.out.println("=============================");
    System.out.println("  Get sum of integers 1 + 2  ");
    System.out.println("=============================");
    SumADT<Integer> sum = new GenericSum<Integer>();
    int value1 = 1;
    int value2 = 2;
    sum.setSum(value1, value2, (value1 + value2));
    System.out.println(sum);
  }

  private static void getStringSum() {
    System.out.println("============================");
    System.out.println("  Get sum of strings A + B  ");
    System.out.println("============================");
    SumADT<String> sum = new GenericSum<String>();
    String value1 = "A";
    String value2 = "B";
    sum.setSum(value1, value2, (value1 + value2));
    System.out.println(sum);
  }

  private static void getCharSum() {
    System.out.println("===============================");
    System.out.println("  Get sum of characters A + B  ");
    System.out.println("===============================");
    SumADT<Character> sum = new GenericSum<Character>();
    char value1 = 'A';
    char value2 = 'B';
    sum.setSum(value1, value2, (char) (value1 + value2));
    System.out.println(sum);
  }

  private static void getBooleanSum() {
    System.out.println("=====================================");
    System.out.println("  Get sum of booleans true || false  ");
    System.out.println("=====================================");
    SumADT<Boolean> sum = new GenericSum<Boolean>();
    boolean value1 = true;
    boolean value2 = false;
    sum.setSum(value1, value2,(boolean)(value1 || value2));
    System.out.println(sum);
  }
}
