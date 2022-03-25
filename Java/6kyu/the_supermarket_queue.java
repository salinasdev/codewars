import java.util.Arrays;
public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
      
      //Cajas
      int[] cajas=new int[n];
      int selcaja=0;
      int mayor=0;
      int peque=9999;
      int ncaja=0;
      
      if (customers.length == 0){
        //No hay clientes :(
        return 0;
      }else{
        //A trabajar
        for (int i=0; i < customers.length; i++){
          if(i < n){
            cajas[selcaja]=customers[i];
            selcaja++;
          }else{
            //Buscamos la caja mas pequeña y sumamos
            for (int k=0; k < cajas.length; k++){
              if (cajas[k] < peque){
                peque = cajas[k];
                ncaja = k;
              }
            }
            peque = 9999;
            cajas[ncaja] +=customers[i];
          }
        }
      }
      for (int j=0; j < cajas.length; j++){
        if (cajas[j] > mayor){
          mayor = cajas[j];
        }
      }
      return mayor;
    }
    
}