//Hecho por devsalinas
//https://www.codewars.com/kata/56f32965e40b700dc6001797

public class SimpleDateFormatter{
  public static String formatDate(String day, String month, String year){
    
    boolean bisiesto = false;
    
    //Validamo si numericos
    if (!day.matches("[+-]?\\d*(\\.\\d+)?")) return "Not a Date";
    if (!month.matches("[+-]?\\d*(\\.\\d+)?")) return "Not a Date";
    if (!year.matches("[+-]?\\d*(\\.\\d+)?")) return "Not a Date";
    
    //Validamos digitos
    if (day.length() == 1){
       day = "0" + day;
    }else if (month.length() == 1){
      month = "0" + month;
    }
    
    //Validamos meses
    int mes = Integer.parseInt (month);
    if (mes > 12 || mes < 1){
      return "Not a Date";
    }
    
    //Validamos dias
    int dia = Integer.parseInt (day);
    if (dia > 31 || dia < 1){
      return "Not a Date";
    }
    
    //Comprobar ano bisiesto
    int anio = Integer.parseInt (year);
    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
        bisiesto = true;
      System.out.println("bisiesto");
    }else{
        bisiesto = false;
      System.out.println("NOOO bisiesto");
    }
	    
    
    switch (mes){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          if (dia > 31) return "Not a Date";
        break;
        case 2:
          if (bisiesto){
            if (dia > 29) return "Not a Date";
          }else{
            if (dia > 28) return "Not a Date";
          }
              
        break;
        case 4: 
        case 6:
        case 9:
        case 11:
          if (dia > 30) return "Not a Date";
        break;
    }
    
    return day + "/"+month+"/"+year;
  }
}