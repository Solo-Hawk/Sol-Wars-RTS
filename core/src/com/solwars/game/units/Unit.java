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

    // Start Variables
    private Vector2 spawnPos;
    private Vector2 facing;

    // Core Variables
    protected Sprite sprite;
    protected long timeCreated;
    protected long timeLaunch = 100; // this is a fixed time set to allow the unit to follow its spawn line
    // Mechanic Variables
    protected Squad squad = null;
    protected int team;

    // Movement based variables
    protected float maxLinearSpeed;
    protected float maxLinearAcceleration;
    protected float maxAngularSpeed;
    protected float maxAngularAcceleration;
    protected float proximityRange;
    protected float fleeDistance;
    protected float maxDistance;
    protected SteeringManager steeringManager = null;



    // Debug Variables
    private boolean noticed = false;
    private Vector2 debugPos = new Vector2();
    private Vector2 debugVector = new Vector2();


    // Combat based variables
    public final static int NONE = -1;
    public final static int SQUADLEADER = 0;
    public final static int ISLEADER = 1;
    public final static int THISUNIT = 2;
    public final static int CLOSETTHRET = 3;
    public final static int HIGHVALUETARGET = 4;
    private int targetMode = 0;
    protected Unit target = null;
    protected Vector2 targetPos = null;


    public Unit(int team, Vector2 spawnPos, Vector2 facing){
        this.team = team;
        this.spawnPos = spawnPos.cpy();
        this.facing = facing.cpy();

    }
    public Unit(int team, Vector2 spawnPos, Vector2 facing, Squad squad){
        this.team = team;
        steeringManager.setPosition(spawnPos);
        steeringManager.setLinearVelocity(facing.cpy().setLength(100f));
        this.squad = squad;
        squad.addMember(this);
    }
    protected void initialize(){
        if(steeringManager == null){
            steeringManager = new SteeringManager(this);
        }
        steeringManager.setPosition(spawnPos);
        steeringManager.setLinearVelocity(facing.cpy().setLength(100f));
        steeringManager.setMaxLinearSpeed(maxLinearSpeed);
        steeringManager.setMaxLinearAcceleration(maxLinearAcceleration);
        steeringManager.setMaxAngularSpeed(maxAngularSpeed);
        steeringManager.setMaxAngularAcceleration(maxAngularAcceleration);
        steeringManager.setProximityRange(proximityRange);
        steeringManager.setFleeDistance(fleeDistance);
        steeringManager.setMaxDistance(maxDistance);
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



        if(squad != null) {
            if (squad.getLeader() == this) targetMode = ISLEADER;
            switch (targetMode) {
                case SQUADLEADER:
                    if (squad.getLeader().getTarget() != null) {
                        steeringManager.update(delta, squad.getLeader());
                    }
                    break;
                case ISLEADER:
                default:
                    if (squad.getLeader().getTarget() != null) {
                        steeringManager.update(delta, target);
                    }
                    break;
            }
        }else{
            steeringManager.update(delta, target);

        }
    }



    public void draw(SpriteBatch batch, float delta){
        update(delta);

        this.sprite.setPosition(steeringManager.getPosition().x, steeringManager.getPosition().y);
        this.sprite.setRotation(steeringManager.getOrientation());
        this.sprite.draw(batch);
    }

    public Vector2 getPosition(){return steeringManager.getPosition();}
    public void setPosition(Vector2 position){steeringManager.setPosition(position);}


    public Unit getTarget(){return target;}
    public void setTarget(Unit target){
        this.target = target;
    }

    public Vector2 getTargetPos(){return target.getPosition();}

    public Squad getSquad(){return this.squad;}
    public void setSquad(Squad squad){
        this.squad = squad;
    }

    public long getTimeCreated(){return this.timeCreated;}
    public void setTimeCreated(long timeCreated){this.timeCreated = timeCreated;}

    public Unit getUnit(){
        return this;
    }

}


