//https://www.codewars.com/kata/52bb6539a4cf1b12d90005b7
public class BattleField {

    public static boolean fieldValidator(int[][] casilla) {
        //Declaramos las variables
        int crucero = 0;
        Integer submarinos = 0;
        int acorazado = 0;
        int destruidos = 0;
        
        //Nos recorremos todo el tablero de 10x10
        for (int y = 0; y < 10; y++)
            for (int x = 0; x < 10; x++) {


                if (casilla[x][y] == 1) {
                    if ((x > 0) && (casilla[x - 1][y] == 1)) continue;
                    if ((y > 0) && (casilla[x][y - 1] == 1)) continue;


                    switch (compruebaCasilla(x, y, casilla)) {
                        case 1:
                            submarinos++;
                            break;
                        case 2:
                            destruidos++;
                            break;
                        case 3:
                            crucero++;
                            break;
                        case 4:
                            acorazado++;
                            break;
                        default:
                            return false;
                    }
                }
            }
        System.out.println(destruidos);

        if (submarinos != 4) return false;
        if (destruidos != 3) return false;
        if (crucero != 2) return false;
        if (acorazado != 1) return false;

        return true;
    }

        //Este metodo evalua la casilla por la que vamos, devolvemos:
        //1 si es un submarino
        //2 si esta tocado
        //3 si hay un crucero
        //4 si es un acorazaso
        
        public static Integer compruebaCasilla(int x, int y, int[][] casilla) {

        if ((x > 0) && (y < 9))
            if (casilla[x - 1][y + 1] == 1) return 5;
        if ((x < 9) && (y < 9)) {
            if (casilla[x + 1][y + 1] == 1) return 5;
            if ((casilla[x + 1][y] == 1) && (casilla[x][y + 1] == 1)) return 5;
        }
        if (y < 9)
            if (casilla[x][y + 1] == 1) return 1 + compruebaCasilla(x, y + 1, casilla);

        if (x < 9)
            if (casilla[x + 1][y] == 1) return 1 + compruebaCasilla(x + 1, y, casilla);

        return 1;
    }
}

    