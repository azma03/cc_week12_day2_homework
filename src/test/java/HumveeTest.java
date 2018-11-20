import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumveeTest {

    Humvee humvee;
    Otachi otachi;

    @Before
    public void setUp() throws Exception {
        humvee = new Humvee("Humvee", 2, 3);
        otachi = new Otachi("Otachi", 3, 3);
    }

    @Test
    public void canGetType() {
        assertEquals("Humvee", humvee.getType());
    }

    @Test
    public void canSetType() {
        humvee.setType("New Humvee");
        assertEquals("New Humvee", humvee.getType());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(2, humvee.getHealthValue());
    }

    @Test
    public void canSetHealthValue() {
        humvee.setHealthValue(3);
        assertEquals(3, humvee.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(3, humvee.getAttackValue());
    }

    @Test
    public void canSetAttackValue() {
        humvee.setAttackValue(4);
        assertEquals(4, humvee.getAttackValue());
    }

    @Test
    public void canAttack() {
        humvee.attack(otachi);
        assertEquals(0, otachi.getHealthValue());
    }
}
