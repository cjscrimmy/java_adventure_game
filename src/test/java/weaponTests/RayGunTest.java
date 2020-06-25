package weaponTests;

import enemy.Troll;
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
    public void hasDefaultDamage(){
        assertEquals(35, rayGun.getDamage());
    }

    @Test
    public void canAttack(){
        Troll troll = new Troll(100);
        rayGun.attack(troll);
        assertEquals(65, troll.getHp());
    }
}
