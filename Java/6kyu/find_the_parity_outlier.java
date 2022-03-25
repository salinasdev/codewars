public class FindOutlier{
  static int find(int[] integers){
  
  int pares  = 0;
  int impares= 0;
  boolean bpares = true;
  
  for (int i=0;i<integers.length;i++){
    if(integers[i] % 2 == 0){
      //PAR
      pares++;
    }else{
      //IMPAR
      impares++;
    }
  }
  
  if (pares > impares){
    //BUSCAMOS IMPARES
    bpares=false;
  }else{
    //BUSCAMOS PARES
    bpares=true;
  }
  for (int i=0;i<integers.length;i++){
    if(integers[i] % 2 == 0){
      //PAR
      if (bpares) return integers[i];
    }else{
      //IMPAR
      if (!bpares) return integers[i];
    }
  }
  
  return 0;
}}