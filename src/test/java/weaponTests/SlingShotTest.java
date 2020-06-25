package weaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.SlingShot;

import static org.junit.Assert.assertEquals;

public class SlingShotTest {
    private SlingShot slingShot;

    @Before
    public void before(){
        slingShot = new SlingShot();
    }

    @Test
    public void canAttack(){
        assertEquals(10, slingShot.attack());
    }
}
