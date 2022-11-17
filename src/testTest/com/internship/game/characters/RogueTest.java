package testTest.com.internship.game.characters;
import com.internship.game.characters.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class RogueTest {
    Rogue rogue = new Rogue();
    @TestFactory
    public void setUp() {
        rogue.setAgility(14.0);
        rogue.setName("Mike");
        rogue.getSpeed();
        rogue.getIntelligence();
        rogue.getRace();
    }
    @Test
    public void afterCreationInstanceIsNotNull() {
        assertNotNull(rogue);
    }
    @Test
    public void assertEqualsInstance() {
        assertEquals (14.0, rogue.getAgility());
        assertEquals("Mike", rogue.getName());
        assertEquals(10,rogue.getSpeed());
        assertEquals(10.5, rogue.getIntelligence());
        assertEquals("Human", rogue.getRace());
    }
}



