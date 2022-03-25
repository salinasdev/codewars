public class Sequence{

  public static int[] reverse(int n){
    int [] v = new int[n];
    for (int i=0;i<v.length;i++){
      v[i]=n-i;
    }
    return v;
  }

}