package com.solwars.game.units.smallShip;

import com.badlogic.gdx.math.Vector2;
import com.solwars.game.GameInstance;
import com.solwars.game.ResourcesManager;
import com.solwars.game.units.Squad;

/**
 * Created by Student on 02/11/2017.
 */
public class Fighter extends _sShip {

    // Movement based variables



    public Fighter(int team, Vector2 spawnPos, Vector2 facing){
        super(team, spawnPos, facing);
        GameInstance.getInstance().fighters.add(this);
        initialize();
    }

    public Fighter(int team, Vector2 spawnPos, Vector2 facing, Squad squad){
        super(team, spawnPos, facing, squad);
        GameInstance.getInstance().fighters.add(this);
        this.initialize();
    }

    @Override
    protected void initialize(){
        steeringManager = new FighterAI(this);
        sprite = ResourcesManager.getInstance().shipInterceptor;


//        System.out.println("unit is initialized with size of " + sprite.getScaleX() + " " + sprite.getScaleY());

        maxLinearSpeed = 250f;
        maxLinearAcceleration = 125f;
        maxAngularSpeed = 75f;
        maxAngularAcceleration = 25f;
        proximityRange = 450f;
        fleeDistance = 50f;
        maxDistance = 400f;
        // Combat based variables
        target = null;
        targetPos = null;
        range = 50f;
        firerate = 1.2f;
        targetTime = 1.2f;

        super.initialize();


    }

}
