//https://www.codewars.com/kata/5595c56aa6ca910f27000155
public class Matrix {

  public static void enter() {
    Matrix.<RuntimeException>escape();
  }

  public static <T extends Throwable> void escape() throws T {
    throw (T) new Neo();
  }
}