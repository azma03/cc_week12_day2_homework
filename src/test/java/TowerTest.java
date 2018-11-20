import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TowerTest {

    Tower tower;
    Otachi otachi;

    @Before
    public void setUp() throws Exception {
        tower = new Tower("Tower", 10);
        otachi = new Otachi("Otachi", 10, 3);
    }

    @Test
    public void canGetName() {
        assertEquals("Tower", tower.getName());
    }

    @Test
    public void canSetName() {
        tower.setName("Another Tower");
        assertEquals("Another Tower", tower.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(10, tower.getHealthValue());
    }

    @Test
    public void canSetHealthValue() {
        tower.setHealthValue(15);
        assertEquals(15, tower.getHealthValue());
    }

    @Test
    public void canTakeDamage() {
        otachi.attack(tower);
        assertEquals(7, tower.getHealthValue());
    }
}
