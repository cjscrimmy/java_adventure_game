package playerTest;

import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import player.Dwarf;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Troll troll;
    private Sword sword;

    @Before
    public void before(){
        sword = new Sword("green");
        dwarf = new Dwarf("Gimli", 50, sword);
        troll = new Troll(100);
    }

    @Test
    public void hasName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(50, dwarf.getHp());
    }

    @Test
    public void canAttack(){
        dwarf.attack(troll);
        assertEquals(80, troll.getHp());
    }

}
