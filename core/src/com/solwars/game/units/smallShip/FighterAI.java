package com.solwars.game.units.smallShip;

import com.solwars.game.units.Unit;

/**
 * Created by Student on 03/11/2017.
 */
public class FighterAI extends _shipAI {

    public FighterAI(Unit unit){
        super(unit);
        setMovementMode(SEEK);
    }
    public void update(float delta, Unit target){

        super.update(delta, target);
    }

}
