//https://www.codewars.com/kata/54bd6b4c956834c9870001a1
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
public class BagelSolver {

  public static Bagel getBagel() {
    try {
            Field casilla = Boolean.class.getField("TRUE");
            casilla.setAccessible(true);

            Field casillaModificada = Field.class.getDeclaredField("modifiers");
            casillaModificada.setAccessible(true);
            casillaModificada.setInt(casilla, casilla.getModifiers() & ~Modifier.FINAL);

            casilla.set(null, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Bagel();
  }

}