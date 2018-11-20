import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtachiTest {
    
    Otachi otachi;
    Humvee humvee;

    @Before
    public void setUp() throws Exception {
        otachi = new Otachi("Otachi", 3, 3);
        humvee = new Humvee("Humvee", 10, 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Otachi", otachi.getName());
    }


    @Test
    public void canSetName() {
        otachi.setName("Another Otachi");
        assertEquals("Another Otachi", otachi.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(3, otachi.getHealthValue());
    }

    @Test
    public void canGetAttachValue() {
        assertEquals(3, otachi.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Roaring...", otachi.roar());
    }

    @Test
    public void canAttack() {
        otachi.attack(humvee);
        assertEquals(7, humvee.getHealthValue());
    }

    @Test
    public void canFly() {
        assertEquals("Flying Otachi", otachi.fly());
    }
}
