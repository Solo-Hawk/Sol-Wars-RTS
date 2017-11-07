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


    public Unit(){
    }

    public void update(){
        if(target != null){
            // linearVelocity = target.getPosition().
        }
        linearVelocity.setAngle(orientation);
        position.add(linearVelocity);
    }

    public void draw(SpriteBatch batch, Sprite sprite){
        sprite.setPosition(position.x,position.y);
        sprite.setRotation(orientation);
        sprite.draw(batch);
    }

    public void draw(SpriteBatch batch){
    }

    public Vector2 getPosition(){return position;}
    public void setPosition(Vector2 position){this.position = position;}

    public Vector2 getLinearVelocity(){return linearVelocity;}
    public void setLinearVelocity(Vector2 linearVelocity){this.linearVelocity = linearVelocity;}

    public float getOrientation(){return orientation;}
    public void setOrientation(float orientation){
        this.orientation = orientation;
    }

    public Unit getTarget(){return target;}
    public void setTarget(Unit target){
        this.target = target;
    }


}
