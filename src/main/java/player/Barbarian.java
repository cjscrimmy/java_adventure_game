package player;

import behaviours.IWeapon;

public class Barbarian extends Fighter implements IWeapon {
    public Barbarian(String name, int hp, IWeapon weapon){
        super(name, hp, weapon);
    }
}
