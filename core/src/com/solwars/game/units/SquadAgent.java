package com.solwars.game.units;

import com.badlogic.gdx.utils.Array;

public class SquadAgent {

    //
    private int team;

    //squad propeties
    private Unit sqCommander;
    private Array<Unit> sqMembers;
    private int sqCount;
    private float sqThreat;

    public SquadAgent(Unit sqCommander){
        this.sqCommander = sqCommander;
    }

    public int getTeam() {
        return team;
    }

    public Unit getSqCommander() {
        return sqCommander;
    }

    public float getSqThreat() {
        return sqThreat;
    }
}
