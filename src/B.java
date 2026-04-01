class B {
  int x30;
  int x7;
  int x39;
  int x27;
  int x10;
  long x12;
  long x4;
  long x20;
  int[] x2 = {-3, -3, 3, -3, -2};
  int[] x14 = {-2, -1, 3, 1, 2};
  int[] x16 = {2, 2, 1, -2, 0};
  static int x22;
  static int x33;
  static int x15;
  static int x34;
  static int x26;
  public B() {
    x30 = 6;
    x7 = 9;
    x39 = 0;
    x27 = 7;
    x10 = 1;
    x12 = 3L;
    x4 = 1L;
    x20 = 8L;
  }
  public void x8() {
    System.out.println("метод x8 в классе B");
    System.out.println(x30 + 2);
  }
  public void x5() {
    System.out.println("метод x5 в классе B");
    System.out.println(x2[2]);
  }
  public void x9() {
    System.out.println("метод x9 в классе B");
    System.out.println(x7 >> 1);
  }
  public void x29() {
    System.out.println("метод x29 в классе B");
    System.out.println(x27);
  }
  public void x36() {
    System.out.println("метод x36 в классе B");
    System.out.println(x7);
  }
  public void x11() {
    System.out.println("метод x11 в классе B");
    System.out.println(x10 + 2);
  }
  public static void x35() {
    System.out.println("метод x35 в классе B");
    System.out.println(x34);
  }
  public static void x19() {
    System.out.println("метод x19 в классе B");
    System.out.println((x34 + 4));
  }
  public static void x21() {
    System.out.println("метод x21 в классе B");
    System.out.println(x26);
  }
  public static void x31() {
    System.out.println("метод x31 в классе B");
    System.out.println((x26 + 2));
  }
  public void x6(B r) {
    r.x8();
  }
  public void x6(H r) {
    r.x5();
  }
}
