//Hecho por devsalinas
//https://www.codewars.com/kata/59df2f8f08c6cec835000012
import java.util.Arrays;

class Meeting {
    
    public static String meeting(String s) {
        
        String intermedio = "";
        String salida = "";
        String separador = ";";
        //Lo pasamos todo a mayusculas
        s = s.toUpperCase();
        // Convertimos el String en Array con separador ;
        String[] miarray = s.split(separador);
        // Nos recorremos el array
        for (int i=0;i<miarray.length;i++){
            String[] persona = miarray[i].split(":");
            intermedio += "("+ persona[1]+", "+ persona[0] +");";
        }
        //Lo volvemos a pasar a array
        String[] miarray2 = intermedio.split(separador);
        //Ordenamos
        Arrays.sort(miarray2);
        //Construimos la salida
        for (int i=0;i<miarray2.length;i++){
            salida+=miarray2[i];
        }
        
        return salida;
    }
}