package weaponTests;

import enemy.Troll;
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
    public void canAttack() {
        Troll troll = new Troll(40);
        sword.attack(troll);
        assertEquals(20, troll.getHp());
    }

    @Test
    public void hasDefaultDamage(){
        assertEquals(20, sword.getDamage());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", sword.getColour());
    }

}
