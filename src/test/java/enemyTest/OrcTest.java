package enemyTest;

import enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {
    private Orc orc;

    @Before
    public void before(){
        orc = new Orc(100);
    }

    @Test
    public void hasHP(){
        assertEquals(100, orc.getHp());
    }

}
