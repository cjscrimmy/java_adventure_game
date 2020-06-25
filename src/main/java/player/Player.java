package player;

public abstract class Player {

    private String name;
    private int hp;

    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName(){
        return this.name;
    }

    public int getHp(){
        return this.hp;
    }
}


