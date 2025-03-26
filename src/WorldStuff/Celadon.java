package WorldStuff;

import Command.Inventory;

public class Celadon {
    private int strength;
    private int charisma;
    private int health;
    private int level;
    private Inventory inventory;

    public Celadon(Inventory inventory) {
        this.strength = 5;
        this.charisma = 5;
        this.health = 50;
        this.level = 1;
        this.inventory = inventory;
    }

    /**
     * Method for leveling up the main character and increasing his stats
     */
    public void levelUp(){
        level++;
        setCharisma((level*5)+ inventory.getTotalCharisma());
        setHealth((level*15)+50+inventory.getTotalHealth());
        setStrength((level*5)+inventory.getTotalStrength());
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength > 0){
            this.strength = strength;
        }else {
            this.strength =0;
        }
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        if (charisma > 0){
            this.charisma = charisma;
        }else {
            this.charisma =0;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 0){
            this.health = health;
        }else {
            this.health =0;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level > 0){
            this.level = level;
        }else {
            this.level =0;
        }
    }
}
