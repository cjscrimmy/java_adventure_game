package playerTest;

import enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import player.Knight;
import weapons.RayGun;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    private Knight knight;
    private Orc orc;
    private RayGun rayGun;

    @Before
    public void before(){
        rayGun = new RayGun("orange");
        knight = new Knight("Justin", 120, rayGun);
        orc = new Orc(40);
    }

    @Test
    public void hasName(){
        assertEquals("Justin", knight.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(120, knight.getHp());
    }

    @Test
    public void canAttack(){
        knight.attack(orc);
        assertEquals(5, orc.getHp());
    }

}
