package WorldStuff;

public class FightOrFlight {
    private boolean playerWon;
    private int playerDefeated = 0;

    /**
     * Handles the fighting system in the game
     * @param celadon Main character
     * @param opponent The opponent that you (the main character) are fighting
     * @author myself (my dad helped (called me stupid))
     */
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
               System.out.println("You defeated the enemy!!");
           } else {

               opponent.setDefeated(false);
               System.out.println("You lost and felt a dark force return you to the same battle, giving you a slight boost");
               while(!opponent.isDefeated()) {
                   playerDefeated++;
               switch (opponent.getType()) {
                   case WARRIOR:
                           celadon.setStrength(celadon.getStrength() + playerDefeated * opponent.getLevel());
                           if (celadon.getStrength() >= opponent.getStrength()) {
                               opponent.setDefeated(true);
                               break;
                           }
                   case MASTIFF:
                           celadon.setHealth(celadon.getHealth() + playerDefeated * opponent.getLevel());
                           if (celadon.getHealth() >= opponent.getHealth()) {
                               opponent.setDefeated(true);
                               break;
                           }
                   case JESTER:
                           celadon.setCharisma(celadon.getCharisma() + playerDefeated * opponent.getLevel());
                           if (celadon.getCharisma() >= opponent.getCharismaThreshold()) {
                               opponent.setDefeated(true);

                           }
               }
               }
           }
       }
    }

    public boolean isPlayerWon() {
        return playerWon;
    }
}
