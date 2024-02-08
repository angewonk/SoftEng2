package Game;


public class Archer implements AttackType {

    public String attackType;

    public String move(){

        String output = new String();

        if(attackType.equals("Attack")){
            output =("Archer shoots an arrow!");
        }
        else if(attackType.equals("Defend")){
            output =("Dodgin to avoid attack!");
        }

        return output;
    }
 

}
