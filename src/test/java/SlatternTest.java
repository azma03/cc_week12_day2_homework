import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlatternTest {

    Slattern slattern;
    Tank tank;

    @Before
    public void setUp() throws Exception {
        slattern = new Slattern("Slattern", 10, 2);
        tank = new Tank("Tank", 15, 3);
    }

    @Test
    public void canGetName() {
        assertEquals("Slattern", slattern.getName());
    }


    @Test
    public void canSetName() {
        slattern.setName("Another Slattern");
        assertEquals("Another Slattern", slattern.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(10, slattern.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(2, slattern.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Roaring...", slattern.roar());
    }

    @Test
    public void canAttack() {
        slattern.attack(tank);
        assertEquals(13, tank.getHealthValue());
    }

    @Test
    public void canFly() {
        assertEquals("Flying Slattern", slattern.fly());
    }
}
