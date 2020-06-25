package defendersTests;

import defenders.Wolf;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WolfTest {

    private Wolf wolf;
    private Troll troll;

    @Before
    public void before(){
        wolf = new Wolf();
        troll = new Troll(60);
    }

    @Test
    public void hasAttackPower(){
        assertEquals(10, wolf.getAttackPower());
    }

    @Test
    public void canDefendAllyByAttackingEnemy(){
        wolf.defend(troll);
        assertEquals(50, troll.getHp());
    }
}
