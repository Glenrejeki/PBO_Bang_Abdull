public class App8 {
  public static void main(String[] args) {
      String[] stringArray = new String[3];
      stringArray[0] = "Abdullah";
      stringArray[1] = " ";
      stringArray[2] = "Ubaid";

      System.out.print(stringArray[0]);
      System.out.print(stringArray[1]);
      System.out.print(stringArray[2]);
      System.out.println();

      String[] arrInit1 = new String[3]; // Perbaikan: Deklarasi dan inisialisasi array di tempat yang benar
      String[] arrInit2 = {"Abdullah", " ", "Ubaid"}; // Tidak ada perubahan diperlukan
      int[] arrInit3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Tidak ada perubahan diperlukan

      long[] arrLong = {10L, 20L, 30L, 40L, 0L};
      arrLong[4] = 50L;

      System.out.println(arrLong[4]);
      System.out.println(arrLong.length);

      String[][] members = {
          {"Abdullah", "Ubaid"},
          {"Aprialdy", "Sembiring"},
          {"Kevin", "Sihaloho"},
          {"Edward"}
      };

      System.out.println(members[0][0] + " " + members[0][1]);
      System.out.println(members[2][1]);
      System.out.println(members[3][0]);
  }
}
