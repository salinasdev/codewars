public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
      
      System.out.println(dirtyFileName);
      String cadena ="";
      int puntos = 0;
      boolean empieza = false;
      for (int i=0;i < dirtyFileName.length(); i++){
        char l=dirtyFileName.charAt(i);
        
        if (l == '_' && !empieza){
          empieza=true;
          //Esto se que esta feo :(
          i++;
          l = dirtyFileName.charAt(i);
        }
        if(l == '.'){
          puntos++;
        }
        
        if(empieza && puntos < 2){
          cadena +=l;
        }
        
          
      }
      return cadena;
    }
}