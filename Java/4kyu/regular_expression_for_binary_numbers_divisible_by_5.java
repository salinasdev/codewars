//https://www.codewars.com/kata/5647c3858d4acbbe550000ad
import java.util.regex.Pattern;

public class DivisibleByFive {

  public static Pattern pattern() {
    // Mi solución:
    return Pattern.compile("^(0|1(10)*(0|11)(01*01|01*00(10)*(0|11))*1)+$");
  }
  
}