public class App18 {
  public static void main(String[] args) {
  var counter = 0;
  while (counter <= 100) {
  counter++;
  if (counter >= 10) {
  break;
  }
  System.out.print(counter + " ");
  }
  System.out.println();
  System.out.println("Perulangan Ganjil: ");
  for (var i = 1; i <= 30; i++) {
  if (i % 2 == 0) {
  continue;
  }
  System.out.print(i + " ");
  }
  }
  }
  