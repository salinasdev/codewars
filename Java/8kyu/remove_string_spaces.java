class Kata {
    static String noSpace(final String x) {
        String out = "";
        for (int i=0;i<x.length();i++){
            if (x.charAt(i) != ' '){
              out+=x.charAt(i);
            }
        }
        return out;
    }
}