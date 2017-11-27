package com.solwars.game.units;

import com.solwars.game.managers.SquadManager;
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
    protected SteeringManager steeringManager = new SteeringManager(this);



    // Debug Variables
    private boolean noticed = false;
    private Vector2 debugPos = new Vector2();
    private Vector2 debugVector = new Vector2();


    // Combat based variables
    protected Unit target = null;
    protected Vector2 targetPos = null;


    public Unit(){
    }

//    public void debug(Stage stage, ShapeRenderer shapeDebugger) {
//        Vector2 positioner;
//        // START OF TEXT DEBUG
//
////        Label debug2 = new Label(linearVelocity.toString(), ResourcesManager.getInstance().theme);
////        debug2.setSize(120, 25);
////        debug2.setAlignment(Align.center);
////        debug2.setPosition(position.x + 100, position.y + 75);
////        stage.addActor(debug2);
////
////
////        Label debug3 = new Label(debugVector.toString(), ResourcesManager.getInstance().theme);
////        debug3.setSize(120, 25);
////        debug3.setAlignment(Align.center);
////        debug3.setPosition(position.x + 100, position.y + 50);
////        stage.addActor(debug3);
//
//
//
//
//        // END OF TEXT DEBUG
//
//        // -------------------------------------------
//
//        // START OF VELOCITY LINE DEBUG
//        positioner = new Vector2(sprite.getWidth() / 2, sprite.getHeight() / 2);
//        debugPos = new Vector2(position.x, position.y);
//        debugVector = new Vector2(1, 0);
//        debugVector.setAngle(orientation);
//        debugVector.nor();
//        debugVector.scl(30);
//        shapeDebugger.begin(ShapeRenderer.ShapeType.Line);
//        shapeDebugger.setColor(Color.GREEN);
//        shapeDebugger.line(debugPos.add(positioner), debugVector.add(debugPos));
//        shapeDebugger.end();
//        // END OF VELOCITY LINE DEBUG
//
//        // -------------------------------------------
//
//        // START OF VELOCITY LINE DEBUG
//        positioner = new Vector2(sprite.getWidth() / 2, sprite.getHeight() / 2);
//        debugPos = new Vector2(position.x, position.y);
//        debugVector = new Vector2(1, 0);
//        debugVector.setAngle(desiredVelocity.angle());
//        debugVector.nor();
//        debugVector.scl(30);
//        shapeDebugger.begin(ShapeRenderer.ShapeType.Line);
//        shapeDebugger.setColor(Color.RED);
//        shapeDebugger.line(debugPos.add(positioner), debugVector.add(debugPos));
//        shapeDebugger.end();
//        // END OF VELOCITY LINE DEBUG
//
//        // -------------------------------------------
//    }


    public void update(float delta){

        if(target != null){
            steeringManager.update(delta, target);

        }

    }

    public void draw(SpriteBatch batch, Sprite sprite){
        sprite.setPosition(steeringManager.getPosition().x,steeringManager.getPosition().y);
        sprite.setRotation(steeringManager.getOrientation());
        sprite.draw(batch);
    }

    public void draw(SpriteBatch batch){
    }

    public Vector2 getPosition(){return steeringManager.getPosition();}
    public void setPosition(Vector2 position){steeringManager.setPosition(position);}


    public Unit getTarget(){return target;}
    public void setTarget(Unit target){
        this.target = target;
    }

    public Vector2 getTargetPos(){return target.getPosition();}

}


