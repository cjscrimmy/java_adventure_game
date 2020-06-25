package player;

import behaviours.IDefend;
import behaviours.ISpell;
import enemy.Enemy;

public abstract class Mage extends Player implements IDefend {
    private ISpell spell;
    public Mage(String name, int hp, ISpell spell){
        super(name, hp);
        this.spell = spell;
    }

    public void defend(Enemy enemy){
        spell.cast(enemy);
    }

}
