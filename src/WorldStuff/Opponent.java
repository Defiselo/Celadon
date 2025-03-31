package WorldStuff;

import java.util.Random;

public class Opponent {
    protected int strength;
    protected int health;
    protected int charismaThreshold;
    protected int level;
    protected boolean isDefeated = false;
    private Random rd = new Random();
    protected OpponentType type;

    public Opponent(int level, OpponentType type) {
        this.strength = level*3;
        this.health = level*rd.nextInt(3)+8;
        this.charismaThreshold = level*2;
        this.type = type;
    }

    public Opponent() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isDefeated() {
        return isDefeated;
    }

    public void setDefeated(boolean defeated) {
        isDefeated = defeated;
    }

    public OpponentType getType() {
        return type;
    }

    public void setType(OpponentType type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "Opponent{" +
                "health=" + health +
                ", strength=" + strength +
                ", charismaThreshold=" + charismaThreshold +
                ", level=" + level +
                ", type=" + type +
                '}';
    }
}
