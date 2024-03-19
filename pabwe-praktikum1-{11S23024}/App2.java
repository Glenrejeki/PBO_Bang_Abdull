public class App2 {
  public static void main(String[] args) {
  byte iniByte = 127;
  short iniShort = 32_767;
  int iniInt = 2_147_483_647;
  long iniLong = 9_223_372_036_854_775_807L;
  System.out.println(iniByte);
  System.out.println(iniShort);
  System.out.println(iniInt);
  System.out.println(iniLong);
  float iniFloat = 10.10F;
  double iniDouble = 20.20F;
  System.out.println(iniFloat);
  System.out.println(iniDouble);
  int decimal = 34;
  int hexaDecimal = 0xFFFFFF;
  int binaryDecimal = 0b101010;
  System.out.println(decimal);
  System.out.println(hexaDecimal);
  System.out.println(binaryDecimal);
  byte dataByte = 10;
  short dataShort = iniByte;
  int dataInt = iniShort;
  System.out.println(dataByte);
  System.out.println(dataShort);
  System.out.println(dataInt);
  int dataInt2 = 1000;
  Byte dataByte2 = (byte) dataInt2;
  System.out.println(dataInt2);
  System.out.println(dataByte2);
  }
  }