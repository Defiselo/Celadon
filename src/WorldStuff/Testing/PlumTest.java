package WorldStuff.Testing;

import WorldStuff.Plum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class PlumTest {
    Plum plum;

    @BeforeEach
    void init(){
        plum = new Plum();
    }

    @Test
    void getLevel() {
        assertEquals(100, plum.getLevel());
    }

    @Test
    void setLevel() {
    }

    @Test
    void isDefeated() {
        assertEquals(false, plum.isDefeated());
    }

    @Test
    void setDefeated() {
    }

    @Test
    void getType() {
    }

    @Test
    void setType() {
    }

    @Test
    void getStrength() {
        assertEquals(45, plum.getStrength());
    }

    @Test
    void setStrength() {
    }

    @Test
    void getHealth() {
        assertEquals(130, plum.getHealth());
    }

    @Test
    void setHealth() {
    }

    @Test
    void getCharismaThreshold() {
        assertEquals(9001, plum.getCharismaThreshold());
    }

    @Test
    void setCharismaThreshold() {
    }
}