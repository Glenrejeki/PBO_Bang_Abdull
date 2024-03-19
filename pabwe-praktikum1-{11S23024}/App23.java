public class App23 {
  public static void main(String[] args) {
    int[] values = { 80, 70, 90, 70, 80 };
    sayCongrats("Abdullah", values);
    sayCongratsWithVariableArgument("Dodo", 50, 30, 70, 30, 50);
    }
    static void sayCongrats(String name, int[] values) {
    var total = 0;
    for (var value : values) {
    total += value;
    }
    var finalValue = total / values.length;
    if (finalValue >= 75) {
    System.out.println("Selamat " + name + ", Anda Lulus");
    } else { 
      System.out.println("Maaf " + name + ", Anda Tidak Lulus");
      }
      }
      static void sayCongratsWithVariableArgument(
      String name, int... values) {
      var total = 0;
      for (var value : values) {
      total += value;
      }
      var finalValue = total / values.length;
      if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", Anda Lulus");
      } else {
      System.out.println("Maaf " + name + ", Anda Tidak Lulus");
      }
      }

}
