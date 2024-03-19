public class App13 {
  public static void main(String[] args) {
    var nilai = 'H';
    switch (nilai) {
      case 'A':
      System.out.println("Wow, Anda Lulus Dengan Baik");
      break;
      case 'B':
      case 'C':
      System.out.println("Nilai Anda Cukup Baik");
      break;
      case 'D':
      System.out.println("Anda Tidak Lulus");
      break;
      default:
      System.out.println("Mungkin Anda Salah Jurusan");
      }
      // >>> Support: Java versi 14 ke atas
      var grade = "A";
      String ucapan;
      switch (grade) {
      case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
      case "B", "C" -> ucapan = "Anda Lulus";
      case "D" -> ucapan = "Anda Tidak Lulus";
      default -> {
      ucapan = "Mungkin Anda Salah Jurusan";
      }
      }
      System.out.println(ucapan);
      ucapan = switch (grade) {
      case "A":
      yield "Wow, Anda Lulus Dengan Baik";
      case "B", "C":
      yield "Anda Lulus";
      case "D":
      yield "Anda Tidak Lulus";
      default:
      yield "Mungkin Anda Salah Jurusan";
      };
      System.out.println(ucapan);
      }
      
}
