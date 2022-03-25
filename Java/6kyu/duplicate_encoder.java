//Realizado por salinasdev
//https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
public class DuplicateEncoder {
	static String encode(String word){
    
    String salida = "";
    boolean b = false;
        
    for (int i=0;i<word.length();i++){
        char c =word.charAt(i);
        for (int j=0;j<word.length();j++){
            if(i!=j){
            //PARA NO CONTARSE A ELLA MISMA
              char c2 =word.charAt(j);
              if (Character.toLowerCase(c) == Character.toLowerCase(c2)){
                  b=true;
              }
            }
        }
        if (b){
           salida+=')';
           b=false;
        }else{
           salida+='(';
        }
            
    }
    
    return salida;
  }
}
