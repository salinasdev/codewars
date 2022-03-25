import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        // your code
        String cadena = s1 + s2;
        String salida = "";
        String letraAnterior = "";
        String letrita = "";
        //Creamos una lista
        List letras = new LinkedList<>();
        //La rellenamos con las letras de la cadena
        for (int i=0;i < cadena.length();i++){
          letras.add("" + cadena.charAt(i));
        }
        
        // Ordenamos la lista.
        Collections.sort(letras);
        
        //Rellenamos la salida
        for (int j=0;j < letras.size();j++) {
            //System.out.println(letras.get(j));
            letrita = letras.get(j).toString();
            if (!letrita.equalsIgnoreCase(letraAnterior)){
              salida = salida + letrita;
              letraAnterior = letrita;
            }
        }

        return salida;
        
    }
}