package com.solwars.game.managers;

import com.solwars.game.GameInstance;
import com.solwars.game.units.Squad;
import com.solwars.game.units.Unit;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SquadManager {

    ArrayList<Squad> squads = new ArrayList<Squad>();

    public static SquadManager instance;

    public static SquadManager getInstance() {
        if (instance == null) {
            instance = new SquadManager();
        }
        return instance;
    }
    public static SquadManager newInstance(){
        instance = new SquadManager();
        return instance;
    }

}
