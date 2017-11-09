package com.solwars.game.screens.level;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.solwars.game.ResourcesManager;
import com.solwars.game.GameInstance;
import com.solwars.game.units.Unit;
import com.solwars.game.units.smallShip.Fighter;

public class Level extends _lDefaultScreen{
    int tick = 0;

    private final boolean DEBUG = false;
    Label debug = new Label("Debug", ResourcesManager.getInstance().theme);
    ShapeRenderer shapeDebugger = new ShapeRenderer();

    Stage stage = new Stage();


    SpriteBatch spriteBatch = new SpriteBatch();


    Unit target;
    Unit tTarget;
//    Unit unit1;
//    Unit unit2;




    public Level(Game game){

        super(game);
        setInput();

        target = new Fighter();
        tTarget = new Fighter();

        target.setPosition(new Vector2(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2));
        tTarget.setPosition(new Vector2((float)Math.random() * Gdx.graphics.getWidth(), (float)Math.random() * Gdx.graphics.getHeight() ));
        tTarget.setTarget(target);
//        unit1 = new Fighter();
//        unit2 = new Fighter();
//        unit2.setPosition(new Vector2(500,500));
//        unit1.setLinearVelocity(new Vector2(0,0));
//        unit1.setTarget(unit2);
//        Handle limit is around 50,000 Entities
        for(int x = 0; x < 1000; x++){
            GameInstance.getInstance().fighters.add(new Fighter());
            GameInstance.getInstance().fighters.get(x).setTarget(tTarget);
            GameInstance.getInstance().fighters.get(x).setPosition(new Vector2((float)Math.random() * Gdx.graphics
                    .getWidth(), (float)Math.random() * Gdx.graphics.getHeight() ));
        }

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


        for(Unit unit : GameInstance.getInstance().fighters)
        {
            unit.update(delta);
        }
        if(DEBUG){
            debug();
        }
        stage.draw();
        spriteBatch.begin();
        target.draw(spriteBatch);
        tTarget.update(delta);
        tTarget.draw(spriteBatch);
        for(Unit unit : GameInstance.getInstance().fighters)
        {
            unit.draw(spriteBatch);
        }
        spriteBatch.end();
        if(tick % 50 == 0)
            target.setPosition(new Vector2((float)Math.random() * Gdx.graphics.getWidth(), (float)Math.random() * Gdx
             .graphics.getHeight() ));
        tick++;
//        target.setPosition(new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2));
//        target.setPosition(new Vector2(Gdx.input.getX(), Gdx.graphics.getHeight() - Gdx.input.getY() ));
        GameInstance.getInstance().world.step(1/45f, 6, 2);
    }


    public void debug(){
        for(Unit unit : GameInstance.getInstance().fighters)
        {
            unit.debug(stage, shapeDebugger);
        }
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
