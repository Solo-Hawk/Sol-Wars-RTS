package com.solwars.game.screens.level;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.solwars.game.ResourcesManager;
import com.solwars.game.units.Unit;
import com.solwars.game.units.smallShip.Fighter;

public class Level extends _lDefaultScreen{

    Stage stage = new Stage();

    SpriteBatch spriteBatch = new SpriteBatch();

    Sprite ship = new Sprite(ResourcesManager.getInstance().shipFighter);
    Unit unit;
    Unit unit2;


    public Level(Game game){
        super(game);
        setInput();

        unit = new Fighter();
        unit2 = new Fighter();
        unit2.setPosition(new Vector2(500,500));
        unit.setLinearVelocity(new Vector2(1,1));
        unit.setTarget(unit2);

    }

    public void setInput(){
        Gdx.input.setInputProcessor(stage);

    }

    public void setPositions(){

    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1f, 1f, 1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        unit.update();

        spriteBatch.begin();
        unit2.draw(spriteBatch);
        unit.draw(spriteBatch);
        spriteBatch.end();
        unit.setOrientation(unit.getOrientation() + (60f * delta));
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
