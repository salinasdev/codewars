import java.util.Arrays;
public class Kata {
  public static int[] sortArray(int[] array) {
  
    int nimpares = 0;
    //Contamos los impres que llegan
    for (int i=0;i < array.length;i++){
      if (array[i]%2!=0){
        nimpares++;
      }
    }
    //Guardamos solo los impares
    int[] arrayImpres = new int[nimpares];
    int n=0;
    for (int j=0;j < array.length;j++){
      if (array[j]%2!=0){
        arrayImpres[n] = array[j];
        n++;
      }
    }
    //Ordenamos
    Arrays.sort(arrayImpres);
    //Añadimos los numeros impares ya ordenados.
    int m=0;
    for (int k=0;k < array.length;k++){
      if (array[k]%2!=0){
        array[k] = arrayImpres[m];
        m++;
      }
    }
    
    return array;
  }
}