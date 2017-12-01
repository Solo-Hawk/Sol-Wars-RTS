package com.solwars.game.units;

import java.util.ArrayList;

public class Squad {
    Unit leader = null;
    ArrayList<Unit> members = new ArrayList<Unit>();

    Squad(Unit Leader, ArrayList<Unit> members){

        this.leader = leader;
        if(members != null){
            this.members = members;
        }


    }
}
