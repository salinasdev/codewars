//Hecho por salinasdev
//https://www.codewars.com/kata/576757b1df89ecf5bd00073b
public class Kata
{
  public static String[] TowerBuilder(int nFloors)
  {
    int numFilas=nFloors;
		int n=0;
    String [] vector = new String[nFloors];
    System.out.println(""+ nFloors);
    
		// primer arbol
 
		System.out.println();
		for(int altura = 1; altura<=numFilas; altura++){
            vector[n] = "";
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
                vector[n] += " ";
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
                vector[n] += "*";
            }
            //Espacios en blanco OTRA VEZZZ
            for(int blancos2 = 1; blancos2<=numFilas-altura; blancos2++){
                System.out.print(" ");
                vector[n] += " ";
            }
            System.out.println();
            n++;
        }
    return vector;
  }
    
}