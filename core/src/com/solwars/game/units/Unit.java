package com.solwars.game.units;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.Align;
import com.solwars.game.ResourcesManager;
import com.solwars.game.units.smallShip._shipAI;

/**
 * Created by Student on 18/10/2017.
 */
public class Unit{
    // Movement based variables
    protected Vector2 position;
    protected Vector2 linearVelocity;
    protected float orientation;
    protected float maxLinearSpeed ;
    protected float maxLinearAcceleration;
    protected float maxAngularSpeed;
    protected float maxAngularAcceleration;
    // Debug Variables
    private Vector2 debugPos = new Vector2();
    private Vector2 debugVector = new Vector2();


    // Combat based variables
    protected Unit target = null;
    protected Vector2 targetPos = null;


    public Unit(){
    }

    public void debugStats(Stage stage) {
        Label debug = new Label(position.toString(), ResourcesManager.getInstance().theme);
        Label debug2 = new Label(linearVelocity.toString(), ResourcesManager.getInstance().theme);
        Label debug3 = new Label(debugVector.toString(), ResourcesManager.getInstance().theme);
        Label debug4 = new Label(debugPos.add(debugVector).toString(), ResourcesManager.getInstance().theme);


        debug.setSize(120, 25);
        debug2.setSize(120, 25);
        debug3.setSize(120, 25);
        debug4.setSize(120, 25);


        debug.setAlignment(Align.center);
        debug2.setAlignment(Align.center);
        debug3.setAlignment(Align.center);
        debug4.setAlignment(Align.center);


        debug.setPosition(position.x + 100, position.y + 100);
        debug2.setPosition(position.x + 100, position.y + 75);
        debug3.setPosition(position.x + 100, position.y + 50);
        debug4.setPosition(position.x + 100, position.y + 25);


        stage.addActor(debug);
        stage.addActor(debug2);
        stage.addActor(debug3);
        stage.addActor(debug4);
    }


    public void debugLines(ShapeRenderer shapeDebugger){
        debugPos = new Vector2(position.x, position.y);
        debugVector = new Vector2(linearVelocity.x, linearVelocity.y);
        debugVector.nor();
        debugVector.scl(200);
        debugPos.y = debugPos.y + 50;
        shapeDebugger.begin(ShapeRenderer.ShapeType.Line);
        shapeDebugger.setColor(Color.GREEN);
        shapeDebugger.line(debugPos, debugPos.add(debugVector));
        shapeDebugger.end();
    }

    public void update(){
        if(target != null){
            targetPos = new Vector2(target.getPosition().x, target.getPosition().y); // You cannot pass target.getPosition because that passes the reference of the variable not the values
            linearVelocity = targetPos.sub(position);
            linearVelocity = linearVelocity.scl(maxLinearSpeed);
            linearVelocity = linearVelocity.nor();
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

    public Vector2 getTargetPos(){return targetPos;}
    public void setTargetPos(Vector2 targetPos){this.targetPos = targetPos;}

}


