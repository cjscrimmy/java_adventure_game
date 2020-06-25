package weapons;

import behaviours.IWeapon;
import enemy.Enemy;

public class Sword implements IWeapon {
    private String colour;
    private int damage;

    public Sword(String colour) {
        this.colour = colour;
        this.damage = 20;
    }

    public int getDamage(){
        return this.damage;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(this.damage);
    }

    public String getColour(){
        return this.colour;
    }

}
