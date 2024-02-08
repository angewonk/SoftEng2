package Game;

public class CharacterDemo {

    public static void main (String[] args){

        Character character = new Character(characterType(Archer()), "Defend");

        System.out.println(character.move());
    }
    
}
