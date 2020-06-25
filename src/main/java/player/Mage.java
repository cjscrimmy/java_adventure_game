package player;

import behaviours.IDefend;
import behaviours.ISpell;
import enemy.Enemy;

public abstract class Mage extends Player implements IDefend {
    private ISpell spell;
    private IDefend defender;
    public Mage(String name, int hp, ISpell spell, IDefend defender){
        super(name, hp);
        this.spell = spell;
        this.defender = defender;
    }

    public void castSpell(Enemy enemy){
        spell.cast(enemy);
    }

    public void defend(Enemy enemy){
        defender.defend(enemy);
    }

    public ISpell getSpell(){
        return this.spell;
    }

}
