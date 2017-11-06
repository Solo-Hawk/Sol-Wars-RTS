package com.solwars.game.units.smallShip;

/**
 * Created by Student on 03/11/2017.
 */
public class FighterAI extends _shipAI {

    final static int NEUTRAL = 0;
    final static int ATTACK = 1;
    final static int DEFEND = 2;
    final static int ASSIST = 3;
    final static int ROAM = 4;

    int stance = 0;


}
