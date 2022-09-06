//https://www.codewars.com/kata/5263c6999e0f40dee200059d
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ObservedPin {

    static List<String> getPINs(String observed) {

        HashMap<String, String[]> adjacents = new HashMap<>();
        adjacents.put("1", new String[]{"1", "2", "4"});
        adjacents.put("2", new String[]{"1", "2", "3", "5"});
        adjacents.put("3", new String[]{"2", "3", "6"});
        adjacents.put("4", new String[]{"1", "4", "5", "7"});
        adjacents.put("5", new String[]{"2", "4", "5", "6", "8"});
        adjacents.put("6", new String[]{"3", "5", "6", "9"});
        adjacents.put("7", new String[]{"4", "7", "8"});
        adjacents.put("8", new String[]{"5", "7", "8", "9", "0"});
        adjacents.put("9", new String[]{"6", "8", "9"});
        adjacents.put("0", new String[]{"0", "8"});

        StringBuilder pinBuilder = new StringBuilder(observed);

        char[] observedPin = observed.toCharArray();

        String[] valorPrimeraPosiscion = adjacents.get(String.valueOf(observedPin[0]));

        List<String> pins = new ArrayList<>();

        for (String value : valorPrimeraPosiscion) {

            pinBuilder.setCharAt(0, value.charAt(0));

            int digitoActual = 1; 
            int[] combinacionActual = new int[observedPin.length]; 

            if (observedPin.length > 1) {

                
                while (digitoActual != observedPin.length && digitoActual > 0) {

                    
                    String[] values = adjacents.get(String.valueOf(observedPin[digitoActual]));

                    if (digitoActual == observedPin.length - 1) {

                        
                        if (combinacionActual[digitoActual] < values.length) {

                            for (String val : values) {

                                pinBuilder.setCharAt(digitoActual, val.charAt(0));

                                if (combinacionActual[digitoActual] < values.length) {
                                    combinacionActual[digitoActual]++;
                                }

                                
                                if (pins.indexOf(pinBuilder.toString()) == -1) {
                                    pins.add(pinBuilder.toString());
                                }

                            }
                        } else {
                            combinacionActual[digitoActual] = 0;
                            digitoActual = digitoActual - 1;
                        }


                    } else {

                        if (combinacionActual[digitoActual] < values.length) {
                            pinBuilder.setCharAt(digitoActual, values[combinacionActual[digitoActual]].charAt(0));
                            combinacionActual[digitoActual]++;
                            digitoActual++;
                        }
                        else {
                            combinacionActual[digitoActual] = 0;
                            digitoActual = digitoActual - 1;
                        }
                    }
                }
            }

            if (pins.indexOf(pinBuilder.toString()) == -1) {
                pins.add(pinBuilder.toString());
            }
        }

        return pins;
    }
}