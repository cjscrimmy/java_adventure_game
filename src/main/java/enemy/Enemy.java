package enemy;

public abstract class Enemy {
    public int hp;

    public Enemy(int hp){
        this.hp = hp;
    }

    public int getHp(){
        return this.hp;
    }

    public void takeDamage(int damage){
        this.hp -= damage;
    }
}
