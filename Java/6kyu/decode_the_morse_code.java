//Hecho por devsalinas
//https://www.codewars.com/kata/54b724efac3d5402db00065e
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String salida = "";
        String palabra = "";
        boolean mete = true;
        
        //Trasformamos en array la entrada
        String[] array = morseCode.split("   ");
        //Nos recorremos el array
        for (int i = 0;i<array.length;i++){
            //Trasformamois en array las latras
            String[] array2 = array[i].split(" ");
            for (int j = 0;j<array2.length;j++){
                if (MorseCode.get(array2[j]) != null){
                  salida+=MorseCode.get(array2[j]);
                }else{
                  mete = false;
                }
            }
            if (i < array.length-1 && mete){
              salida+=" ";  
            }
            mete = true;
        }
        return salida;
    }
}