package playerTest;

import behaviours.IDefend;
import behaviours.ISpell;
import defenders.Wolf;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import player.Wizard;
import spells.Fireball;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    private Wizard wizard;
    private ISpell spell;
    private Troll troll;
    private IDefend wolf;

    @Before
    public void before(){
        wolf = new Wolf();
        spell = new Fireball();
        troll = new Troll(200);
        wizard = new Wizard("Sonja", 80, spell, wolf);
    }

    @Test
    public void hasName(){
        assertEquals("Sonja", wizard.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(80, wizard.getHp());
    }

    @Test
    public void hasSpell(){
        assertEquals(spell, wizard.getSpell());
    }

    @Test
    public void canDefend(){
        wizard.defend(troll);
        assertEquals(190, troll.getHp());
    }

    @Test
    public void canCastSpell(){
        wizard.castSpell(troll);
        assertEquals(180, troll.getHp());
    }
}
