package weaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    private Sword sword;

    @Before
    public void before(){
        sword = new Sword("blue");
    }

    @Test
    public void canAttack(){
        assertEquals(20, sword.attack());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", sword.getColour());
    }

}
