package com.solwars.game.units;

import com.solwars.game.GameInstance;
import com.solwars.game.managers.SquadManager;

import java.util.ArrayList;

public class Squad {
    private int team;

    private Unit leader = null;
    private ArrayList<Unit> members = new ArrayList<Unit>();
    private int sqCount;
    private float sqThreat;

    public Squad(Unit Leader, int team, ArrayList<Unit> members){
        SquadManager.getInstance().addSquad(this);
        this.leader = leader;
        System.out.println("leader set");
        leader.setSquad(this);
        if(members != null){
            this.members = members;
        }
    }
    public void addMember(Unit unit){
        this.members.add(unit);
        unit.setSquad(this);
    }

    public Squad(Unit leader, int team){
        SquadManager.getInstance().addSquad(this);
        this.leader = leader;
        System.out.println("leader set");
        leader.setSquad(this);
    }


    public int getTeam() {
        return team;
    }

    public Unit getLeader() {
        return leader;
    }

    public float getSqThreat() {
        return sqThreat;
    }
    public Squad getSquad() {
        return this;
    }
}
