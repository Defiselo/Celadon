package WorldStuff.Testing;

import WorldStuff.Item;
import WorldStuff.ItemType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    Item item1;
    Item item2;

    @BeforeEach
    void init(){
        item1 = new Item("cactus", ItemType.JOKE, 12);
        item2 = new Item("ruby", ItemType.WEAPON, 11);
    }

    @Test
    void getStrength() {
        assertEquals(11, item2.getStrength());
    }

    @Test
    void getCharisma() {
        assertEquals(12, item1.getCharisma());
    }

    @Test
    void getHealth() {
        assertEquals(0, item2.getHealth());
    }

    @Test
    void getType() {
        assertEquals(ItemType.JOKE, item1.getType());
    }

    @Test
    void getName() {
        assertEquals("cactus", item1.getName());
    }
}