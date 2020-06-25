package weapons;

import behaviours.IWeapon;

public class RayGun implements IWeapon{
    private String colour;

    public RayGun(String colour){
        this.colour = colour;
    }

    public String getColour(){
        return this.colour;
    }

    public int attack(){
        return 35;
    }
}
