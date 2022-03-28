//Hecho por devsalinas
//https://www.codewars.com/kata/526989a41034285187000de4
public class CountIPAddresses {

	public static long ipsBetween(String start, String end) {
    
    long dif = 0;
    //Los guardamos en arrays:
    String[] ip1 = start.split("\\.");
    String[] ip2 =   end.split("\\.");
  
    System.out.println("tamano " + start);
    System.out.println("tamano " + end);
    
    //Comparamos
    for (int i = 0;i<ip1.length;i++){
        if (!ip1[i].equals(ip2[i])){
            //No son iguales
            long n1 = Integer.parseInt (ip1[i]);
            long n2 = Integer.parseInt (ip2[i]);
            switch (i){
                case 0:
                  dif+= (n2 - n1) *(256*256*256);
                break;
                case 1:
                  dif+= (n2 - n1) *(256*256);
                break;
                case 2:
                  dif+= (n2 - n1) *256;
                break;
                case 3:
                  dif+= n2 - n1;
                break;
            }
            
        }
    }
    
		return dif;
	}
}