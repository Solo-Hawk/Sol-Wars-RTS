package com.solwars.game.units.smallShip;

import com.solwars.game.units.Unit;

/**
 * Created by Student on 03/11/2017.
 */
public class FighterAI extends _shipAI {

    public FighterAI(Unit unit){
        super(unit);

    }
    public void update(float delta, Unit target){
        if ((System.currentTimeMillis() - lastDecision) > waitTime){
            lastDecision = System.currentTimeMillis();
            setMovementMode((int)(Math.random()*3));
        }
        super.update(delta, target);
    }

}
