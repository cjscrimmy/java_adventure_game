package playerTest;

import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import weapons.SlingShot;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    private Barbarian barbarian;
    private SlingShot slingShot;
    private Troll troll;

    @Before
    public void before(){
        slingShot = new SlingShot("teal");
        barbarian = new Barbarian("Ryan", 200, slingShot);
        troll = new Troll(70);
    }

    @Test
    public void hasName(){
        assertEquals("Ryan", barbarian.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(200, barbarian.getHp());
    }

    @Test
    public void canAttack(){
        barbarian.attack(troll);
        assertEquals(60, troll.getHp());
    }
}
