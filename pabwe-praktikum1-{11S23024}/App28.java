import java.util.Scanner;
public class App28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Minta data int: ");
    int dataInt = sc.nextInt();
    sc.nextLine(); // clear line
    System.out.print("Minta data satu baris (1): ");
    String dataLine1 = sc.nextLine();
    System.out.print("Minta data float: ");
    float dataFloat = sc.nextFloat();
    sc.nextLine(); // clear line
    System.out.print("Minta data satu baris (2): ");
    String dataLine2 = sc.nextLine();
    System.out.print("Minta data satu kata: ");
    String dataWord = sc.next();
    sc.nextLine(); // clear line
    System.out.print("Minta data satu baris (3): ");
    String dataLine3 = sc.nextLine();
    System.out.println();
  System.out.println();
  System.out.println("Hasil int: " + dataInt);
  System.out.println("Hasil satu baris (1): " + dataLine1);
  System.out.println("Hasil float: " + dataFloat);
  System.out.println("Hasil satu baris (2): " + dataLine2);
  System.out.println("Hasil satu kata: " + dataWord);
  System.out.println("Hasil satu baris (3): " + dataLine3);
  System.out.println();
  System.out.println(">>> Inputan Tahap 2");
  System.out.print("Minta data int: ");
  dataInt = Integer.parseInt(sc.nextLine());
  System.out.print("Minta data satu baris (1): ");
  dataLine1 = sc.nextLine();
  System.out.print("Minta data float: ");
  dataFloat = Float.parseFloat(sc.nextLine());
  System.out.print("Minta data satu baris (2): ");
  dataLine2 = sc.nextLine();
  System.out.print("Minta data satu kata: ");
  dataWord = sc.next();
  sc.nextLine(); // clear line
  System.out.print("Minta data satu baris (3): ");
  dataLine3 = sc.nextLine();
  System.out.println();
  System.out.println("Hasil int: " + dataInt);
  System.out.println("Hasil satu baris (1): " + dataLine1);
  System.out.println("Hasil float: " + dataFloat);
  System.out.println("Hasil satu baris (2): " + dataLine2);
  System.out.println("Hasil satu kata: " + dataWord);
  System.out.println("Hasil satu baris (3): " + dataLine3);
  sc.close();
  }
}

