//Hecho por salinasdev
//https://www.codewars.com/kata/549ee8b47111a81214000941/train/java

import java.util.*;

public class Chess {
    //Array con la cola de movimientos.
    private static LinkedList<int[]> cola;

    public static int knight(String start, String finish) {
        
        //Posiciones en el tablero:
        int fromX = start.charAt(0) - 96;
        int fromY = start.charAt(1) - 48;
        int toX = finish.charAt(0) - 96;
        int toY = finish.charAt(1) - 48;
        //Instanciamos el Array para nuestra cola
        cola = new LinkedList<>();
      
        addToCola(fromX, fromY, 0);
        //Empezamos con la cola de movimientos:
        while (!cola.isEmpty()) {
            int[] lugar = cola.remove();
            int x = lugar[0];
            int y = lugar[1];
            int tamano = lugar[2];
            if (x == toX && y == toY)
                return tamano;
            tamano++;
            addToCola(x - 1, y - 2, tamano);
            addToCola(x - 2, y - 1, tamano);
            addToCola(x + 1, y - 2, tamano);
            addToCola(x + 2, y - 1, tamano);
            addToCola(x + 1, y + 2, tamano);
            addToCola(x + 2, y + 1, tamano);
            addToCola(x - 1, y + 2, tamano);
            addToCola(x - 2, y + 1, tamano);
        }
        return -1;
    }
    //Metodo para añadir elementos a la cola:
    private static void addToCola(int x, int y, int tamano) {
        if (x > 0 && y > 0 && x < 9 && y < 9) {
            cola.add(new int[]{ x, y, tamano });
        }
    }

}