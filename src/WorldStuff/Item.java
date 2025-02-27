package WorldStuff;

public class Item {
    private ItemType type;
    private String name;

    public Item(String name, ItemType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'';
    }
}
