public class CalculateRotation {
  static int shiftedDiff(String first, String second){
    
    String cadena = "";
    
    if (first.equals(second)){
      return 0;
    }else{
      
      for (int j=0; j < first.length();j++){
        for (int i=0; i < first.length();i++){
          if (i == (first.length() -1)){
            cadena = first.charAt(i) + cadena;
          }else{
            cadena += first.charAt(i);  
          }  
        }
        
        System.out.println(cadena);
        if (cadena.equals(second)){
          return j + 1;
        }else{
          first  = cadena;
          cadena = "";
        }
      }
    }
    return -1;
  }
}