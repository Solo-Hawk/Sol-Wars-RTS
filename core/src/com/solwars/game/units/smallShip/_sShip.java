package com.solwars.game.units.smallShip;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.solwars.game.units.Unit;

/**
 * Created by Student on 18/10/2017.
 */
public class _sShip extends Unit{

    public _sShip (){
        super();
    }

    public void draw(SpriteBatch batch, Sprite sprite) {
        System.out.println("ship");
        super.draw(batch, sprite);
    }
}
