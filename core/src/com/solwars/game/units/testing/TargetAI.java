package com.solwars.game.units.testing;

import com.solwars.game.units.SteeringManager;
import com.solwars.game.units.Unit;

public class TargetAI extends SteeringManager {

    public TargetAI(Unit unit){
        super(unit);
        setMovementMode(SteeringManager.WANDER);
    }

}
