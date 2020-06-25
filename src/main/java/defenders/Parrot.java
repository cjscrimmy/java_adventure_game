package defenders;

import behaviours.IDefend;
import enemy.Enemy;

public class Parrot implements IDefend {
    private int attackPower;

    public Parrot(){
        this.attackPower = 5;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public void defend(Enemy enemy){
        enemy.takeDamage(this.attackPower);
    }
}
