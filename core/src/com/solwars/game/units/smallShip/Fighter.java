package com.solwars.game.units.smallShip;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.solwars.game.ResourcesManager;
import com.solwars.game.units.Unit;

/**
 * Created by Student on 02/11/2017.
 */
public class Fighter extends _sShip {

    // Movement based variables



    public Fighter(){
        super();
        sprite = new Sprite(ResourcesManager.getInstance().shipFighter);
        sprite.scale(-0.7f);
        steeringManager.setMaxLinearSpeed(1000f);
        steeringManager.setMaxLinearAcceleration(500f);
        steeringManager.setMaxAngularSpeed(400f);
        steeringManager.setMaxAngularAcceleration(100f);


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
