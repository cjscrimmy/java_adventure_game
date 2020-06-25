package defendersTests;

import defenders.Parrot;
import enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParrotTest {
    private Parrot parrot;
    private Orc orc;

    @Before
    public void before(){
        orc = new Orc(15);
        parrot = new Parrot();
    }

    @Test
    public void hasAttackPower(){
        assertEquals(5, parrot.getAttackPower());
    }

    @Test
    public void canDefendAllyByAttackingEnemy(){
        parrot.defend(orc);
        assertEquals(10, orc.getHp());
    }
}
