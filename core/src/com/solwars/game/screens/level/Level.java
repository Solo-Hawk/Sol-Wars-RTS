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
    final boolean DEBUG = true;
    Label debug = new Label("Debug", ResourcesManager.getInstance().theme);
    ShapeRenderer shapeDebugger = new ShapeRenderer();

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
        unit.update();
        unit2.update();

        spriteBatch.begin();
        unit2.draw(spriteBatch);
        unit.draw(spriteBatch);
        if(DEBUG){
            debug1();

        }
        spriteBatch.end();

        stage.draw();
        if(DEBUG){
            debug2();

        }
    }


    public void debug1(){
        unit.debugStats(stage);
        unit2.debugStats(stage);
    }
    public void debug2(){
        unit2.debugLines(shapeDebugger);
        unit.debugLines(shapeDebugger);

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
