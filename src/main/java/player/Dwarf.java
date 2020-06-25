package player;

import behaviours.IWeapon;

public class Dwarf extends Fighter implements IWeapon {
    public Dwarf(String name, int hp, IWeapon weapon){
        super(name, hp, weapon);
    }
}
