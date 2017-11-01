package com.solwars.game.units;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Student on 18/10/2017.
 */
public class Unit{
    SteeringAgentRedundant steeringAgent;


    public void setSteeringAgent(SteeringAgentRedundant steeringAgent) {
        this.steeringAgent = steeringAgent;
    }
    public Unit(){
        //steeringAgent.setMaxAngularSpeed(10f);
        //steeringAgent.setMaxLinearSpeed(20f);
    }
    public void draw(SpriteBatch batch, Sprite sprite){
        sprite.setX(steeringAgent.position.x);
        sprite.setY(steeringAgent.position.y);
        sprite.setRotation(steeringAgent.vectorToAngle(steeringAgent.getLinearVelocity()));
        sprite.draw(batch);

    }



}
