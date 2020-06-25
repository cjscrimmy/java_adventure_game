package defenders;

import behaviours.IDefend;
import enemy.Enemy;

public class Wolf implements IDefend {

    private int attackPower;

    public Wolf(){
        this.attackPower = 10;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public void defend(Enemy enemy){
        enemy.takeDamage(this.attackPower);
    }
}
