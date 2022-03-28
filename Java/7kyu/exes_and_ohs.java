//Hecho por devsalinas
//https://www.codewars.com/kata/55908aad6620c066bc00002a
public class XO {
  
  public static boolean getXO (String str) {
    int countx = 0;
    int counto = 0;
    // Muuuuy facil
    //Primero lo convertimos todo a minusculas
    str = str.toLowerCase();
    //Nos recorremos el string
    for (int i=0;i<str.length();i++){
       switch (str.charAt(i)){
           case 'x':
              countx++;
           break;
           case 'o':
              counto++;
           break;
       }
    }
    if (countx == counto){
      return true;
    }else{
      return false;
    }
    
  }
}