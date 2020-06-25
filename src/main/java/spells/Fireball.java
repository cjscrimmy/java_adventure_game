package spells;

import behaviours.ISpell;
import enemy.Enemy;

public class Fireball implements ISpell{
    private int damage;

    public Fireball(){
        this.damage = 20;
    }

    public int getDamage(){
        return this.damage;
    }

    public void cast(Enemy enemy){
        enemy.takeDamage(this.damage);
    }

}
