package com.solwars.game.screens.level;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.solwars.game.ResourcesManager;
import com.solwars.game.units.Unit;
import com.solwars.game.units.smallShip.Fighter;

public class Level extends _lDefaultScreen{
    int tick = 0;

    private final boolean DEBUG = false;
    Label debug = new Label("Debug", ResourcesManager.getInstance().theme);
    ShapeRenderer shapeDebugger = new ShapeRenderer();

    Stage stage = new Stage();


    SpriteBatch spriteBatch = new SpriteBatch();

    Unit unit;
    Unit unit2;


    public Level(Game game){
        super(game);
        setInput();
        unit = new Fighter();
        unit2 = new Fighter();
        unit2.setPosition(new Vector2(500,500));
        unit.setLinearVelocity(new Vector2(0,0));
        unit.setTarget(unit2);
        System.out.println(unit2.getTarget());
        System.out.println(unit2.getPosition());
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
        stage.clear();
        // unit2.setPosition(new Vector2(500,500));

        Gdx.gl.glClearColor(1f, 1f, 1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        unit.update(delta);
        unit2.update(delta);
        if(DEBUG){
            debug();
        }
        stage.draw();
        spriteBatch.begin();
        unit2.draw(spriteBatch);
        unit.draw(spriteBatch);
        spriteBatch.end();
        if(tick % 500 == 0)
            unit2.setPosition(new Vector2((float)Math.random() * Gdx.graphics.getWidth(), (float)Math.random() * Gdx.graphics.getHeight() ));
        tick++;
    }


    public void debug(){
        unit.debug(stage, this.shapeDebugger);
        unit2.debug(stage, this.shapeDebugger);
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
