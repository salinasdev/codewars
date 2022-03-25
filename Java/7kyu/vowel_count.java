public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    String vocales="aeiou";
    for (int i=0;i<str.length();i++){
         for(int j=0;j<vocales.length();j++){
             if(str.charAt(i)==vocales.charAt(j)){
                 vowelsCount++;
             }
         }
    }
    return vowelsCount;
  }

}