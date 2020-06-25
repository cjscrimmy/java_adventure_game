package spellTest;

import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import spells.Fireball;

import static org.junit.Assert.assertEquals;

public class FireballTest {
    private Fireball fireball;
    private Troll troll;

    @Before
    public void before(){
        fireball = new Fireball();
        troll = new Troll(40);
    }

    @Test
    public void hasDefaultDamage(){
        assertEquals(20, fireball.getDamage());
    }

    @Test
    public void canCastSpell(){
        fireball.cast(troll);
        assertEquals(20, troll.getHp());
    }

}
