import WorldStuff.Celadon;
import WorldStuff.Opponent;
import WorldStuff.OpponentType;

public class FightOrFlight {
    private boolean playerWon;


    public FightOrFlight(Celadon celadon, Opponent opponent) {
        switch (opponent.getType()){
            case WARRIOR -> playerWon = celadon.getStrength() >= opponent.getStrength();
            case MASTIFF -> playerWon = celadon.getHealth() >= opponent.getHealth();
            case JESTER -> playerWon = celadon.getCharisma() >= opponent.getCharismaThreshold();
        }
        if(playerWon) {
            opponent.setDefeated(true);
            for (int i = 0; i < opponent.getLevel(); i++) {
                celadon.levelUp();
            }
        }
    }

    public boolean isPlayerWon() {
        return playerWon;
    }
}
