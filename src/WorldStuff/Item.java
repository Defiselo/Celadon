package WorldStuff;

public class Item {
    private ItemType type;
    private String name;

    public Item(String name, ItemType type) {
        this.name = name;
        this.type = type;
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
