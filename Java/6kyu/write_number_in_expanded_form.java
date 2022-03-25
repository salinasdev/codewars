public class Kata
{
    public static String expandedForm(int num)
    {
      String numero = ""+num;
      System.out.println(numero);
      String salida = "";
      boolean ceros = false;
      for (int k=1;k<numero.length();k++){
        if (numero.charAt(k) != '0'){
          ceros = true;
        }
      }
      for (int i=0;i<numero.length();i++){
        if (numero.charAt(i) != '0'){
          salida+=numero.charAt(i);
          for (int j=1;j<numero.length()-i;j++){
            salida+="0";
          }
          if ((i+1) != numero.length() && ceros){
            salida+=" + ";
          }
        }
      }
      System.out.println(salida);
      return salida;
    }
}