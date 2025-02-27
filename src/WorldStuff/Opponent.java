package WorldStuff;

public class Opponent {
    private int strength;
    private int health;
    private int charismaThreshold;

    public Opponent(int strength, int health, int charismaThreshold) {
        this.strength = strength;
        this.health = health;
        this.charismaThreshold = charismaThreshold;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCharismaThreshold() {
        return charismaThreshold;
    }

    public void setCharismaThreshold(int charismaThreshold) {
        this.charismaThreshold = charismaThreshold;
    }
}
