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
    // Core Variables
    protected Sprite sprite;

    // Movement based variables
    protected Vector2 position;
    protected Vector2 linearVelocity;
    protected Vector2 desired;
    protected Vector2 steering;
    protected float orientation;
    protected float maxLinearSpeed ;
    protected float maxLinearAcceleration;
    protected float maxAngularSpeed;
    protected float maxAngularAcceleration;

    protected float scaler;
    // Debug Variables
    private boolean noticed = false;
    private Vector2 debugPos = new Vector2();
    private Vector2 debugVector = new Vector2();


    // Combat based variables
    protected Unit target = null;
    protected Vector2 targetPos = null;


    public Unit(){
    }

    public void debug(Stage stage, ShapeRenderer shapeDebugger) {
        Vector2 positioner;
        // START OF TEXT DEBUG
        Label debug = new Label((String.valueOf(noticed)), ResourcesManager.getInstance().theme);
        debug.setSize(120, 25);
        debug.setAlignment(Align.center);
        debug.setPosition(position.x + 100, position.y + 100);
        stage.addActor(debug);
        
//        Label debug2 = new Label(linearVelocity.toString(), ResourcesManager.getInstance().theme);
//        debug2.setSize(120, 25);
//        debug2.setAlignment(Align.center);
//        debug2.setPosition(position.x + 100, position.y + 75);
//        stage.addActor(debug2);
//        
//
//        Label debug3 = new Label(debugVector.toString(), ResourcesManager.getInstance().theme);
//        debug3.setSize(120, 25);
//        debug3.setAlignment(Align.center);
//        debug3.setPosition(position.x + 100, position.y + 50);
//        stage.addActor(debug3);

        
       
        
        // END OF TEXT DEBUG

        // -------------------------------------------

        // START OF VELOCITY LINE DEBUG
        positioner = new Vector2(sprite.getWidth() / 2, sprite.getHeight() / 2);
        debugPos = new Vector2(position.x, position.y);
        debugVector = new Vector2(1, 0);
        debugVector.setAngle(orientation);
        debugVector.nor();
        debugVector.scl(30);
        shapeDebugger.begin(ShapeRenderer.ShapeType.Line);
        shapeDebugger.setColor(Color.GREEN);
        shapeDebugger.line(debugPos.add(positioner), debugVector.add(debugPos));
        shapeDebugger.end();
        // END OF VELOCITY LINE DEBUG

        // -------------------------------------------

        // START OF VELOCITY LINE DEBUG
        positioner = new Vector2(sprite.getWidth() / 2, sprite.getHeight() / 2);
        debugPos = new Vector2(position.x, position.y);
        debugVector = new Vector2(1, 0);
        debugVector.setAngle(desired.angle());
        debugVector.nor();
        debugVector.scl(30);
        shapeDebugger.begin(ShapeRenderer.ShapeType.Line);
        shapeDebugger.setColor(Color.RED);
        shapeDebugger.line(debugPos.add(positioner), debugVector.add(debugPos));
        shapeDebugger.end();
        // END OF VELOCITY LINE DEBUG

        // -------------------------------------------
    }


    public void update(float delta){
        if(target != null){
            desired = new Vector2(linearVelocity.x, linearVelocity.y);
            targetPos = new Vector2(target.getPosition().x, target.getPosition().y); // You cannot pass target.getPosition because that passes the reference of the variable not the values
            desired = targetPos.sub(position);
            desired.nor();
            desired.scl(maxLinearSpeed * delta);
            steering = new Vector2(desired).sub(new Vector2(linearVelocity));
            float angleActual = orientation;
            float angleDesired = desired.angle();

            steering.limit((maxAngularSpeed / 10) * delta);
            if(Math.abs(angleDesired % 180) - 1 <=((Math.abs(180 - angleActual))) && ((Math.abs(180 - angleActual))) <= Math.abs(angleDesired % 180) + 1 ){
                noticed = false;
                steering.setAngle(steering.angle());
            }else{
                noticed = true;
                steering.setAngle(steering.angle());
//                if(Math.abs(180 - angleDesired) - 1 <=((Math.abs(180 - angleActual)))){
//                    steering.setAngle(steering.angle() + 1);
//                }else{
//                    steering.setAngle(steering.angle() - 1);
//                }
            }
            linearVelocity.add(steering.limit(maxLinearAcceleration).limit(maxLinearSpeed));
//            System.out.println(targetPos.len());

            if(new Vector2(targetPos.x, targetPos.y).sub(position).len() < maxLinearSpeed){
                scaler =  maxLinearAcceleration / new Vector2(targetPos.x, targetPos.y).sub(position).len();
//                System.out.println("Pre Scaled " + scaler);
                scaler = scaler < 1.0f ? scaler : 1.0f;

//                System.out.println("Pre Scaled " + linearVelocity.len());
                linearVelocity.scl(scaler);
//                System.out.println("After Scale " + linearVelocity.len());
            }

        }
        orientation = linearVelocity.angle();
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


