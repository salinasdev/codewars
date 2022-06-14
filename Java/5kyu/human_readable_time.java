//Hecho por salinasdev
//https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    
    //Declaramos una hora y un minueto en segundos:
    int unaHoraEnSegundos = 3600;
		int unMinutoEnSegundos = 60;
    
    //Dividmos los segundos entre unaHoraEnSegundos para sacar las horas
    String horas = Integer.toString((seconds / unaHoraEnSegundos));
    //Para sacar los minutos, sacamos el resto de dividir los segundos entre unaHoraEnSegundos y lo divimos entre 
    //unMinutoEnSegundos
		String minutos = Integer.toString((seconds % unaHoraEnSegundos) / unMinutoEnSegundos);
    //Y para los segundos, simplemente es el resto de dividir los segundos entre 60 (unMinutoEnSegundos)
		String segundos = Integer.toString(seconds % unMinutoEnSegundos);
    
    //Como nos estan pidiendo que sean 2 digitos, controlamos que si solo es 1, añadimos un 0 delante
    if (horas.length() == 1) {
			horas = "0" + horas;
		}
		if (minutos.length() == 1) {
			minutos = "0" + minutos;
		}
		if (segundos.length() == 1) {
			segundos = "0" + segundos;
		}
    
    return horas + ":" + minutos + ":" + segundos;
  }
}