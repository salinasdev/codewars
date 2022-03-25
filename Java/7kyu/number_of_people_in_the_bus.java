import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int contador =0;
    for (int i=0;i<stops.size();i++){
      contador+=stops.get(i)[0];
      contador-=stops.get(i)[1];
    }
    return contador;
  }
}