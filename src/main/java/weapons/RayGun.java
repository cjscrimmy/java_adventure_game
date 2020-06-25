package weapons;

import behaviours.IWeapon;
import enemy.Enemy;

public class RayGun implements IWeapon{
    private String colour;
    private int damage;

    public RayGun(String colour){
        this.colour = colour;
        this.damage = 35;
    }

    public String getColour(){
        return this.colour;
    }

    public int getDamage(){
        return this.damage;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(this.damage);
    }
}
