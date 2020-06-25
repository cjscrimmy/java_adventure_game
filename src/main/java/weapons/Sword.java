package weapons;

import behaviours.IWeapon;

public class Sword implements IWeapon {
    private String colour;

    public Sword(String colour) {
        this.colour = colour;
    }

    public int attack(){
        return 20;
    }

    public String getColour(){
        return this.colour;
    }

}
