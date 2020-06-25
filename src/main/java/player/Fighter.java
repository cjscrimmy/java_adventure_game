package player;

import behaviours.IWeapon;
import enemy.Enemy;

public abstract class Fighter extends Player implements IWeapon {
    private IWeapon weapon;
    public Fighter(String name, int hp, IWeapon weapon){
        super(name, hp);
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
       weapon.attack(enemy);
    }
}
