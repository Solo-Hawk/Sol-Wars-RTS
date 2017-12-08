package com.solwars.game.units.smallShip;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.solwars.game.GameInstance;
import com.solwars.game.ResourcesManager;
import com.solwars.game.units.Unit;

/**
 * Created by Student on 02/11/2017.
 */
public class Fighter extends _sShip {

    // Movement based variables



    public Fighter(){
        super();
        GameInstance.getInstance().fighters.add(this);
        maxLinearSpeed = 1000f;
        maxLinearAcceleration = 500f;
        maxAngularSpeed = 300f;
        maxAngularAcceleration = 100f;
        proximityRange = 900f;
        fleeDistance = 100f;
        maxDistance = 800f;
        initialize();

        sprite = new Sprite(ResourcesManager.getInstance().shipFighter);
        sprite.scale(-0.9f);



        // Combat based variables
        target = null;
        targetPos = null;
        range = 50f;
        firerate = 1.2f;
        targetTime = 1.2f;
    }

    public void spawn(Unit parent){

    }


    @Override
    public void draw(SpriteBatch batch){
        super.draw(batch,sprite);
    }
}
