package weaponTests;

import enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.SlingShot;

import static org.junit.Assert.assertEquals;

public class SlingShotTest {
    private SlingShot slingShot;

    @Before
    public void before(){
        slingShot = new SlingShot("yellow");
    }

    @Test
    public void hasDefaultDamage(){
        assertEquals(10, slingShot.getDamage());
    }

    @Test
    public void canAttack(){
        Orc orc = new Orc(20);
        slingShot.attack(orc);
        assertEquals(10, orc.getHp());
    }

    @Test
    public void hasColour(){
        assertEquals("yellow", slingShot.getColour());
    }
}
