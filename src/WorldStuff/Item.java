package WorldStuff;

public class Item {
    //private ItemType type; Imma see if i use this lol
    private String name;
    private boolean canBeOpened; //????? ig I'll find out or redo?

    public Item(String name, boolean canBeOpened) {
        this.name = name;
        this.canBeOpened = canBeOpened;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", canBeOpened=" + canBeOpened +
                '}';
    }
}
