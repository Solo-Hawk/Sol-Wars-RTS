package com.solwars.game.ai;

import com.badlogic.gdx.math.Vector2;
import com.solwars.game.units.Unit;

/**
 * Created by Student on 03/11/2017.
 */
public class shipAI implements _AI {

    Unit owner;

    public shipAI(Unit owner){
        this.owner = owner;
    }

    @Override
    public void setTarget(Vector2 Target) {

    }
}
