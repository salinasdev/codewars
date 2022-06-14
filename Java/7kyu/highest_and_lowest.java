//Hecho por devsalinas
//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java

public class Kata {
  public static String highAndLow(String numbers) {
       
    //Metemos los numeros en un array de cadenas
       String arrayCadena[] = numbers.split(" ");
       
    //Creamos un array de numeros
       int arrayNumeros[] = new int[arrayCadena.length];
       
    //Cargamos el array con numeros:
       for (int i = 0; i < arrayCadena.length; i++) {
           arrayNumeros[i] = Integer.valueOf(arrayCadena[i]);
       }
    //Variables mayor y menor
       int mayor = arrayNumeros[0];
       int menor = arrayNumeros[0];
    
    //Obtenemos el mayor y menor numero   
       for (int j = 1; j < arrayNumeros.length; j++) {
            if (arrayNumeros[j] > mayor) {
                mayor = arrayNumeros[j];
            }
            if (arrayNumeros[j] < menor) {
                menor = arrayNumeros[j];
            }
        }
    return mayor + " " + menor;
  }
}