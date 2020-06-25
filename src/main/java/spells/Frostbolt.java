package spells;

import behaviours.ISpell;
import enemy.Enemy;

public class Frostbolt implements ISpell {

    private int damage;

    public Frostbolt(){
        this.damage = 15;
    }

    public int getDamage(){
        return this.damage;
    }

    public void cast(Enemy enemy){
        enemy.takeDamage(this.damage);
    }
}
