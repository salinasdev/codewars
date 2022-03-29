//Hecho por devsalinas
//https://www.codewars.com/kata/5390bac347d09b7da40006f6
public class JadenCase {

	public String toJadenCase(String phrase) {
    
    System.out.println("frase: " + phrase);
		// TODO put your code below this comment
    if (phrase == null || phrase == ""){
      return null;
    }
    String salida = "";
    //Trasformamos en array la entrada
    String [] vect = phrase.split(" ");
    //Nos recorremos el array
    for (int i=0;i<vect.length;i++){
        for(int j=0;j<vect[i].length();j++){
           if (j==0){
              salida+= Character.toUpperCase(vect[i].charAt(j));
           }else{
              salida+= Character.toLowerCase(vect[i].charAt(j));
           }
        }
        if (i < vect.length-1){
          salida+=" ";  
        }
        
    }
		
		return salida;
	}

}