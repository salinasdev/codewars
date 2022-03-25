public class Maskify {
    public static String maskify(String str) {
      String cadena = "";
      int nfeo = 0;
      if(str.isEmpty()){
        return "";
      }else{
          nfeo = str.length() - 4;
          for (int i=0;i<str.length(); i++){
            if (i<nfeo){
              cadena = cadena + "#";
            }else{
              cadena = cadena + str.charAt(i);
            }
          }
      }
      return cadena;
    }
}