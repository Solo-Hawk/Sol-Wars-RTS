package com.solwars.game.units.testing;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.solwars.game.GameInstance;
import com.solwars.game.ResourcesManager;
import com.solwars.game.units.SteeringManager;
import com.solwars.game.units.Unit;


public class Target extends Unit {

    public Target(){
        super(-1, new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2), new Vector2(0,0));
        GameInstance.getInstance().fighters.add(this);
        initialize();
    }

    @Override
    protected void initialize(){
        // AI Selection
        steeringManager = new TargetAI(this);
        // Sprite Selection
        sprite = ResourcesManager.getInstance().shipScout;
        // Value Sets
        maxLinearSpeed = 0f;
        maxLinearAcceleration = 0f;
        maxAngularSpeed = 0f;
        maxAngularAcceleration = 0f;
        proximityRange = 0f;
        fleeDistance = 0f;
        maxDistance = 0f;
        // Combat based variables
        target = null;
        targetPos = null;
        super.initialize();


    }
}
