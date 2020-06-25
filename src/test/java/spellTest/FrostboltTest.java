package spellTest;

import com.sun.tools.corba.se.idl.constExpr.Or;
import enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import spells.Frostbolt;

import static org.junit.Assert.assertEquals;

public class FrostboltTest {
    private Frostbolt frostbolt;
    private Orc orc;

    @Before
    public void before(){
        frostbolt = new Frostbolt();
        orc = new Orc(70);
    }

    @Test
    public void hasDefaultDamage(){
        assertEquals(15, frostbolt.getDamage());
    }

    @Test
    public void canCastSpell(){
        frostbolt.cast(orc);
        assertEquals(55, orc.getHp());
    }
}
