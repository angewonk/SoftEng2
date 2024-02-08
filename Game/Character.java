package Game;
public class Character {
    private String characterType;
    private String attackType;

    public Character(String character , String attackType) {
        this.characterType = character;
        this.attackType = attackType;
    }

    public String move(){
        return "Your " + characterType + " chose to " + attackType;

    }

   
}

