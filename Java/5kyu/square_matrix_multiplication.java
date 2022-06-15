//Hecho por salinasdev
//https://www.codewars.com/kata/5263a84ffcadb968b6000513

public class Kata {

	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
    //Creamos una matriz del tamaño de las matrices a y b
		int[][] resultadoMatrix = new int[a.length][b[0].length];
    
    //Nos vamos recorriendo las matrices y guardamos en resultadoMatrix el resultado del producto de ambas.
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b[0].length; j++) {
            for (int k = 0; k < b.length; k++) {
                 resultadoMatrix[i][j] += a[i][k] * b[k][j];
            }
        }
    }
    
    return resultadoMatrix;
	}
}