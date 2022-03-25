//Hecho por salinasdev
//https://www.codewars.com/kata/525f50e3b73515a6db000b83
public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    // VAMOS ALLÁ
    String cadena = "";
    
    for (int i = 0;i<numbers.length;i++){
        if (i==0){
            cadena+='(';
        }else if(i == 3){
            cadena+=')';
            cadena+=' ';
        }else if(i == 6){
            cadena+='-';
        }
        cadena+=numbers[i];
        
    }
    
    return cadena;
    
  }