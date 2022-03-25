public class Kata {

  public static String high(String s) {
    //Variables
    String[] array=s.split(" ");
    int top=0;
    int topn=0;
    int contador = 0;
    
    //Logica
    for (int i=0;i<array.length;i++){
      for (int j=0;j<array[i].length();j++){
        contador += Character.getNumericValue(array[i].charAt(j)) - 9;
      }
      if (contador > top){
        topn = i;
        top  = contador;
      }
      
      contador =0;
    }
    
    return array[topn];
  }

}