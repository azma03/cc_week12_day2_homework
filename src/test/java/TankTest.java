import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {
    
    Tank tank;
    Slattern slattern;

    @Before
    public void setUp() throws Exception {
        tank = new Tank("Tank", 3, 2);
        slattern = new Slattern("Slattern", 10, 2);
    }

    @Test
    public void canGetType() {
        assertEquals("Tank", tank.getType());
    }

    @Test
    public void canSetType() {
        tank.setType("New Tank");
        assertEquals("New Tank", tank.getType());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(3, tank.getHealthValue());
    }

    @Test
    public void canSetHealthValue() {
        tank.setHealthValue(4);
        assertEquals(4, tank.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(2, tank.getAttackValue());
    }

    @Test
    public void canSetAttackValue() {
        tank.setAttackValue(4);
        assertEquals(4, tank.getAttackValue());
    }

    @Test
    public void canAttack() {
        tank.attack(slattern);
        assertEquals(8, slattern.getHealthValue());
    }
}
