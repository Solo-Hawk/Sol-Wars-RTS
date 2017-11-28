package com.solwars.game.units.smallShip;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.solwars.game.units.Unit;

/**
 * Created by Student on 18/10/2017.
 */
public class _sShip extends Unit{



    // Combat Based Variables for Single Fixed weapon ships
    protected float range; // Range of Weapons (currently based on resolution for development)
    protected float firerate; // Shots per second
    protected float targetTime; // Minimum time before firing at new target

    public _sShip (){
        super();
    }

    public void draw(SpriteBatch batch, Sprite sprite) {
        super.draw(batch, sprite);
    }
}
