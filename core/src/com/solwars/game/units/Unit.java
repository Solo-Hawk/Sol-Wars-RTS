package com.solwars.game.units;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.solwars.game.units.smallShip._shipAI;

/**
 * Created by Student on 18/10/2017.
 */
public class Unit{
    protected Vector2 position;
    protected Vector2 linearVelocity;
    protected float orientation;
    protected float maxLinearSpeed ;
    protected float maxLinearAcceleration;
    protected float maxAngularSpeed;
    protected float maxAngularAcceleration;



    // Combat based variables
    protected Unit target;
    protected Vector2 targetPos;
    protected float range;
    protected float firerate;
    protected float targetTime;

    public Unit(){

    }

    public void draw(SpriteBatch batch, Sprite sprite){
        sprite.setPosition(100,100);
        sprite.draw(batch);
    }

    public void draw(SpriteBatch batch){
    }


}
