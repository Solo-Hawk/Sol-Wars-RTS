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

    Sprite sprite = new Sprite(ResourcesManager.getInstance().shipFighter);

    // Movement based variables



    public Fighter(){
        super();
        position = new Vector2();
        linearVelocity = new Vector2();
        orientation = 0;
        maxLinearSpeed = 35f;
        maxLinearAcceleration = 10f;
        maxAngularSpeed = 120f;
        maxAngularAcceleration = 80f;



        // Combat based variables
        target = null;
        targetPos = null;
        range = 50f;
        firerate = 1.2f;
        targetTime = 1.2f;
    }

    public void spawn(Unit parent){
        orientation = 90;

    }

    public void update(){


    }
    @Override
    public void draw(SpriteBatch batch){
        super.draw(batch,sprite);
    }
}
