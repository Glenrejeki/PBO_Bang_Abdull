public class App7 {
  public static void main(String[] args) {
    Integer iniInteger = 999;
    Long iniLong = 1000L;
    System.out.println(iniInteger);
    System.out.println(iniLong);
    Byte iniByte = null;
    System.out.println(iniByte);
    iniByte = 100;
    System.out.println(iniByte);
    int dataInt = iniInteger;
    Integer dataInteger = dataInt;
    short dataShort = dataInteger.shortValue();
    long dataLong = dataInteger.longValue();
    float dataFloat = dataInteger.floatValue();
    System.out.println(dataShort);
    System.out.println(dataLong);
    System.out.println(dataFloat);
    }
}
