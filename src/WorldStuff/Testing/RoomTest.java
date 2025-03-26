package WorldStuff.Testing;

import WorldStuff.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


class RoomTest {
    Room room1;
    Room room2;
    String[] directions1 = {"2","3","-1","4"};
    String[] directions2 = {"-1","-1","3","-1"};

    @BeforeEach
    void init() {

        room1 =new Room(1, "idk", directions1);
        room2 =new Room(2, "orange", directions2);
    }

    @Test
    void getID() {
        assertEquals(1, room1.getID());
    }

    @Test
    void getName() {
        assertEquals("orange", room2.getName());
    }

    @Test
    void getDirections() {
        //TODO how tfffff
    }
}