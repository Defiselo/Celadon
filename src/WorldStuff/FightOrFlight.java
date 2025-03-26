package WorldStuff;

public class FightOrFlight {
    private boolean playerWon;
    private int playerDefeated = 0;


    public FightOrFlight(Celadon celadon, Opponent opponent) {
       while(!opponent.isDefeated()) {
           switch (opponent.getType()) {
               case WARRIOR -> playerWon = celadon.getStrength() >= opponent.getStrength();
               case MASTIFF -> playerWon = celadon.getHealth() >= opponent.getHealth();
               case JESTER -> playerWon = celadon.getCharisma() >= opponent.getCharismaThreshold();
           }
           if (playerWon) {
               opponent.setDefeated(true);
               for (int i = 0; i < opponent.getLevel(); i++) {
                   celadon.levelUp();
               }
               System.out.println("YOU WIN!!");
           } else {
               playerDefeated++;
               opponent.setDefeated(false);
               System.out.println("You lost and felt a dark force return you to the same battle, giving you a slight boost");
               switch (opponent.getType()) {
                   case WARRIOR -> celadon.setStrength(celadon.getStrength() + playerDefeated*opponent.getLevel());
                   case MASTIFF -> celadon.setHealth(celadon.getHealth() + playerDefeated*opponent.getLevel());
                   case JESTER -> celadon.setCharisma(celadon.getCharisma() + playerDefeated*opponent.getLevel());
               }
           }
       }
    }

    public boolean isPlayerWon() {
        return playerWon;
    }
}
