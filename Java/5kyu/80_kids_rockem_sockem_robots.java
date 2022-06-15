//Hecho por salinasdev
//https://www.codewars.com/kata/566b490c8b164e03f8000002/train/java

import java.util.Map;

public class EightiesKids6 {

  public static String fight(Robot robot1, Robot robot2, Map<String, Integer> tactics) {
    //Variables:
    int fightIndice = 1;
    int robot1Tactica = -1;
    int robot2Tactica = -1;
    int robot1Vida = robot1.getHealth(); 
    int robot2Vida = robot2.getHealth();
    //Booleano para saber si hay que seguir luchando
    boolean ALuchar = true;
    
    //Decidimos quien empìeza partiendo de la velocidad de cada robot
    if (robot2.getSpeed() > robot1.getSpeed()){
      //Si el robot2 tiene mas velocidad, empieza el
      fightIndice = 2;
    }else{
      //Si no, empieza el robot1
      fightIndice = 1;
    }
    
    //EMPIEZA LA BATALLAAAA
    while (ALuchar){
      if (fightIndice % 2 == 0 && ++robot2Tactica < robot2.getTactics().length){
         robot1Vida -= tactics.get(robot2.getTactics()[robot2Tactica]);
      }else if (++robot1Tactica < robot1.getTactics().length){
         robot2Vida -= tactics.get(robot1.getTactics()[robot1Tactica]);
      }
      
      //Comprobamos si hay que seguir luchando
      if ((robot1Tactica >= robot1.getTactics().length && robot2Tactica >= robot2.getTactics().length) || robot1Vida <= 0 || robot2Vida <= 0){
        ALuchar = false;
      }
      
      //Pasamos el turno
      fightIndice++;
      
    }
    
    //Comprobemos quien ha ganado
    if (robot1Vida < robot2Vida){
      return robot2.getName() + " has won the fight.";
    }else if (robot2Vida < robot1Vida){
      return robot1.getName() + " has won the fight.";
    }else{
      return "The fight was a draw.";
    }
    
  }
}