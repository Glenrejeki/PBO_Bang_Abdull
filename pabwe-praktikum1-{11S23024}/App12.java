public class App12 {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    if (a < b)
    System.out.println(
    String.format("Nilai %d lebih kecil dari %d", a, b));
    if (a < b) {
    System.out.println("Nilai dari a: " + a);
    System.out.println("Nilai dari b: " + b);
    System.out.println(
    String.format("Nilai %d lebih kecil dari %d", a, b));
    }
    var nilai = 88;
    var absen = 90;
    if (nilai >= 75 && absen >= 75) {
      System.out.println("Selamat Anda Lulus");
      } else {
      System.out.println("Maaf, Anda Tidak Lulus");
      }
      if (nilai >= 80 && absen >= 80) {
      System.out.println("Nilai Anda A");
      } else if (nilai >= 70 && absen >= 70) {
      System.out.println("Nilai Anda B");
      } else if (nilai >= 60 && absen >= 60) {
      System.out.println("Nilai Anda C");
      } else if (nilai >= 50 && absen >= 50) {
      System.out.println("Nilai Anda D");
      } else {
      System.out.println("Nilai Anda E");
      }
      }
      
}
