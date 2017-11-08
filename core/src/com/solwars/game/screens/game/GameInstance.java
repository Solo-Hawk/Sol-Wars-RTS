package com.solwars.game.screens.game;

import com.badlogic.gdx.utils.Array;
import com.solwars.game.units.Unit;

public class GameInstance {

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
