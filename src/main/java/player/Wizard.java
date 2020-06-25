package player;

import behaviours.IDefend;
import behaviours.ISpell;

public class Wizard extends Mage{
    private IDefend defender;

    public Wizard(String name, int hp, ISpell spell, IDefend defender){
        super(name, hp, spell, defender);
    }
}
