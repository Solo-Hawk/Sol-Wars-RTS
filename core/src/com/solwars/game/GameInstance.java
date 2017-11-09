package com.solwars.game;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Array;
import com.solwars.game.units.Unit;

public class GameInstance {

    public World world = new World(new Vector2(0, 0), false);

    Box2DDebugRenderer debugRenderer = new Box2DDebugRenderer();

    public Array<Unit> fighters = new Array<Unit>();

    public static GameInstance instance;

    public static GameInstance getInstance() {
        if (instance == null) {
            instance = new GameInstance();
        }
        return instance;
    }
    public static GameInstance newInstance(){
        instance = new GameInstance();
        return instance;
    }

    public void newGame(){
        fighters.clear();
    }

}
