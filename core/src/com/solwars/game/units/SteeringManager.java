package com.solwars.game.units;

import com.badlogic.gdx.math.Vector2;

public class SteeringManager {

    // Rendering
    private float delta;

    // AI Movement Mode
    protected int movementMode;
    private final int SEEK = 0;
    private final int FLEE = 1;
    private final int ARRIVAL = 2;
    private final int WANDER = 3;
    private final int PURSUIT = 4;
    private final int EVADE = 5;
    private final int FOLLOW = 6;

    // Movement based variables
    protected Vector2 position;
    protected Vector2 linearVelocity;
    protected Vector2 desiredVelocity;
    protected Vector2 steering;
    protected Vector2 targetPos = null;
    protected float orientation;
    protected float maxLinearSpeed ;
    protected float maxLinearAcceleration;
    protected float maxAngularSpeed;
    protected float maxAngularAcceleration;

    protected float proximityRange;
    protected float fleeDistance;
    protected float maxDistance;
    protected float mass;
    protected float scaler;

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setProximityRange(float proximityRange){
        this.proximityRange = proximityRange;
    }

    public void setFleeDistance(float fleeDistance){
        this.fleeDistance = fleeDistance;
    }

    public void setMaxDistance(float maxDistance){
        this.maxDistance = maxDistance;
    }

    public void setMaxLinearSpeed(float maxLinearSpeed) {
        this.maxLinearSpeed = maxLinearSpeed;
    }

    public void setMaxLinearAcceleration(float maxLinearAcceleration) {
        this.maxLinearAcceleration = maxLinearAcceleration;
    }

    public void setMaxAngularSpeed(float maxAngularSpeed) {
        this.maxAngularSpeed = maxAngularSpeed;
    }

    public void setMaxAngularAcceleration(float maxAngularAcceleration) {
        this.maxAngularAcceleration = maxAngularAcceleration;
    }


    public Vector2 getPosition() {
        return position;
    }

    public float getOrientation(){
        return orientation;
    }

    public int getMovementMode() {
        return movementMode;
    }

    public SteeringManager(Unit unit){
        movementMode = ARRIVAL;
        desiredVelocity = new Vector2();
        steering = new Vector2();
        position = new Vector2();
        linearVelocity = new Vector2();
        orientation = 0;

    }
    public void update(float delta, Unit target){
        targetPos = target.getPosition();
        this.delta = delta;
        switch (movementMode){
            case SEEK    : seek(); break;
            case FLEE    : flee(); break;
            case ARRIVAL  : arrival(); break;
            case WANDER  : break;
            case PURSUIT : break;
            case EVADE   : break;
            case FOLLOW  : break;
        }
        orientation = linearVelocity.angle();
        position.add(linearVelocity);
    }

    private void seek() {
        desiredVelocity = new Vector2(targetPos.x, targetPos.y);
        desiredVelocity.sub(position);
        desiredVelocity.nor();
        desiredVelocity.scl(maxLinearSpeed * delta);
        steering = desiredVelocity.cpy().sub(linearVelocity);
        steering = steering.mulAdd(steering, maxAngularAcceleration * delta);
        steering.limit(maxAngularSpeed * delta);
        linearVelocity.mulAdd(linearVelocity.add(steering), maxLinearAcceleration * delta);
        linearVelocity.limit(maxLinearSpeed * delta);
    }

    private void flee(){
        desiredVelocity = new Vector2(targetPos.x, targetPos.y);
        desiredVelocity.sub(position);
        desiredVelocity.nor();
        desiredVelocity.scl(maxLinearSpeed * delta);
        steering = desiredVelocity.cpy().sub(linearVelocity);
        steering = steering.mulAdd(steering, maxAngularAcceleration * delta);
        steering.rotate(180);
        steering.limit(maxAngularSpeed * delta);
        linearVelocity.mulAdd(linearVelocity.add(steering), maxLinearAcceleration * delta);
        linearVelocity.limit(maxLinearSpeed * delta);
    }
    private void arrival(){
        seek();
        float scale;
        float d; // distance
        d = getDistance();
        scale = (d - 50) / proximityRange;
        scale = scale < 1.0f ? scale : 1.0f;
        linearVelocity.scl(scale);



    }
    private void wander(){


    }
    private float getDistance(){
        return targetPos.cpy().sub(position).len();

    }
}
