package weaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.RayGun;

import static org.junit.Assert.assertEquals;

public class RayGunTest {
    private RayGun rayGun;

    @Before
    public void before(){
        rayGun = new RayGun("red");
    }

    @Test
    public void hasColour(){
        assertEquals("red", rayGun.getColour());
    }

    @Test
    public void canAttack(){
        assertEquals(35, rayGun.attack());
    }
}
