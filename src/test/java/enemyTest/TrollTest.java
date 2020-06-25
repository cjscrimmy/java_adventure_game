package enemyTest;

import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    private Troll troll;

    @Before
    public void before(){
        troll = new Troll(100);
    }

    @Test
    public void hasHp(){
        assertEquals(100, troll.getHp());
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(10);
        assertEquals(90, troll.getHp());
    }
}
