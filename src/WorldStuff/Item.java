package WorldStuff;

public class Item {
    private ItemType type;
    private String name;
    private int strength;
    private int charisma;
    private int health;

    public Item(String name,ItemType type, int delta) {
        this.name = name;
        this.type = type;
        switch (type){
            case WEAPON:
                this.health = 0;
                this.strength = delta;
                this.charisma = 0;
                break;
            case ARMOR:
                this.health = delta;
                this.strength = 0;
                this.charisma = 0;
                break;
            case PUZZLE:
                this.health = 0;
                this.strength = 0;
                this.charisma = 0;
                break;
            case JOKE:
                this.health = 0;
                this.strength = 0;
                this.charisma = delta;
                break;
        }

    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'';
    }
}
