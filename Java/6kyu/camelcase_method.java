public class Solution {

    public static String camelCase(String str) {
        // your code here
        System.out.println(str);
        String salida = "";
        
        boolean primera = false;
        for(int i=0;i< str.length();i++){
          if (str.charAt(i) != ' '){
            if (i == 0 || primera){
              primera = false;
              char letra = str.charAt(i);
              letra = Character.toUpperCase(letra);
              salida += "" + letra;
            }else{
              salida += "" + str.charAt(i);
            }
          }else{
            primera = true;
          }
        }
        return salida;
    }

}