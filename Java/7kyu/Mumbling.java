public class Accumul {
    
    public static String accum(String s) {
    System.out.println(s);
    String out = "";
    for (int i=0;i<s.length();i++){
        for (int j=0;j<(i+1);j++){
            if (j==0){
                out+=Character.toUpperCase(s.charAt(i));
            }else{
                out+=Character.toLowerCase(s.charAt(i));
            }
                
        }
        if(i != (s.length()-1)){
                out+="-";
        }
    }
    return out;
    }
}