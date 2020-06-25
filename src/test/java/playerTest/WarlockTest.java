package playerTest;

import behaviours.IDefend;
import behaviours.ISpell;
import defenders.Wolf;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import player.Warlock;
import spells.Fireball;

import static org.junit.Assert.assertEquals;


public class WarlockTest {
    private Warlock warlock;
    private ISpell spell;
    private Troll troll;
    private IDefend wolf;

    @Before
    public void before(){
        wolf = new Wolf();
        spell = new Fireball();
        troll = new Troll(200);
        warlock = new Warlock("Timmy", 80, spell, wolf);
    }

    @Test
    public void hasName(){
        assertEquals("Timmy", warlock.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(80, warlock.getHp());
    }

    @Test
    public void hasSpell(){
        assertEquals(spell, warlock.getSpell());
    }

    @Test
    public void canDefend(){
        warlock.defend(troll);
        assertEquals(190, troll.getHp());
    }

    @Test
    public void canCastSpell(){
        warlock.castSpell(troll);
        assertEquals(180, troll.getHp());
    }

}
