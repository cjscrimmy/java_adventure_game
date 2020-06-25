package player;

import behaviours.IDefend;
import behaviours.ISpell;

public class Warlock extends Mage{
    private IDefend defender;

    public Warlock(String name, int hp, ISpell spell, IDefend defender){
        super(name, hp, spell, defender);
    }

}
