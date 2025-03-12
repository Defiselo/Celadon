package Command;

import WorldStuff.Item;
import WorldStuff.ItemType;
import WorldStuff.Mappington;


public class Investigate implements Command {
    private Inventory inventory;
    private Mappington map;
    private String[] descriptions = {
        "You are in your cave, just having chatted with your dad you see the sword he gave you and pick it up",
        "Your brother's old cabin, you see a note, hidden behind a crooked painting. It reads: \n \"Hello brother, I don't know how long it's been since I've left home, but please do not try to find me. -████ \"\n The name is ineligible but you're sure it's from your own brother, although you cannot remember his name.",
        "The human village near your cave. You rarely go here as the villagers judge you. You steal some armor before heading out.",
        "The big redwood tree that marks the end of your safe territory. You see some monsters approaching you. Are you sure this is what you want?",
        "As you pass the river, you see a skeleton wash up and decide to steal its sword and you feel a piece of paper in the hilt.",
        "An old arena. You can't leave until you defeat everyone",
        "Passing through the crypt, you see an unidentified object but still decide to take it. You notice a secret passageway (down), or what seems to be a puzzle room(right)",
        "Just an old passage, nothing to see here. You do start to feel some pressure.",
        "There looks to be a door operated by gears. If only you had something to stop them.",
        "There's a book and quill, with a question in it \"What is your brother's name?\". There's no way it knows it's you, right?",
        "You scan around the room and see a slot that appears similar to the object you picked up earlier. You input it and the door opens.",
        "\"Enter here, Celadon\" You are horrified. That's your name on the door. HOW? WHO? These questions run through your head. Before you can get yourself together, the doorkeeper, Dúrnir, hands you a sword and wishes you good luck before pushing you to your imminent death.",
        "A mysterious figure stands before you, introducing himself as Plum and you start to feel some nostalgia. It's now or never."
    };
    private Item[] items = {
        new Item("Old Sword", ItemType.WEAPON),
        new Item("Brother's Note", ItemType.PUZZLE),
        new Item("Rusty Armor", ItemType.ARMOR),
        null,
        new Item("Sharp Sword", ItemType.WEAPON),
        new Item("Dank ahh meme lul", ItemType.JOKE),
        new Item("Unidentified", ItemType.PUZZLE),
        null,
        null,
        null,
        null,
        new Item("Pristine Armor", ItemType.ARMOR),
        null
    };


    public Investigate(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String execute() {
        String description = descriptions[map.getCurrentRoom().getID()];
        System.out.println(description);

        Item foundItem = items[map.getCurrentRoom().getID()];
        inventory.addItem(foundItem);
        return foundItem.getName() + "has been added to your inventory.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
