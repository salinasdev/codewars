import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    //Variables
    String salida = "";
    String separador = "";
    
    //Buscamos el separador correcto
    if (s.indexOf("_") == -1){
      separador = "-";
    }else{
      separador = "_";
    }
    
    String[] cadena=s.split(separador);
    //Logica
    for (int i=0;i<cadena.length;i++){
      //System.out.println(cadena[i]);
      for(int j=0;j<cadena[i].length();j++){
        
        char letra = cadena[i].charAt(j);
        if (j == 0 && i != 0){
          letra = Character.toUpperCase(letra);
        }
        //System.out.println("" + letra);
        salida += "" + letra;
        //System.out.println("i: " + i + "j: " + j);
      }
      //System.out.println("salgo");
      
    }
    return salida;
  }
}