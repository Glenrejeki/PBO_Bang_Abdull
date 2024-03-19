public class App22 {
  public static void main(String[] args) {
  var result = sum(100, 50);
  System.out.println(result);
  System.out.println(sum(11, 44));
  System.out.println(calculate(100, "+", 100));
  System.out.println(calculate(200, "-", 100));
  System.out.println(calculate(200, "salah", 200));
  }
  static int sum(int value1, int value2) {
  var total = value1 + value2;
  return total;
  }
  static int calculate(int value1, String operasi, int value2) {
    return switch (operasi) {
    case "+":
    yield (value1 + value2);
    case "-":
    yield (value1 - value2);
    case "/":
    yield (value1 / value2);
    case "*":
    yield (value1 * value2);
    default:
    yield 0;
    };
    }
    }