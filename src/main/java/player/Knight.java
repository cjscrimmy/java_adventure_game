package player;

import behaviours.IWeapon;

public class Knight extends Fighter implements IWeapon {
    public Knight(String name, int hp, IWeapon weapon){
        super(name, hp, weapon);
    }

}
