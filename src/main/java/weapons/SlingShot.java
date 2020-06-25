package weapons;

import behaviours.IWeapon;

public class SlingShot implements IWeapon {
    private String colour;

    public SlingShot(String colour){
        this.colour = colour;
    }

    public int attack(){
        return 10;
    }

    public String getColour(){
        return this.colour;
    }


}
