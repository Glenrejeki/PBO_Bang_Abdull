public class App11 {
  public static void main(String[] args) {
    var absen = 75;
    var nilaiAkhir = 80;
    boolean lulusAbsen = absen >= 75;
    boolean lulusNilai = nilaiAkhir >= 75;
    var lulus = lulusAbsen && lulusNilai;
    System.out.println(lulus);
    System.out.println(!lulus);
    }
    
}
