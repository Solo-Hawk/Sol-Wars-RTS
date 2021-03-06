package com.solwars.game.screens.level;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.solwars.game.ResourcesManager;
import com.solwars.game.GameInstance;
import com.solwars.game.units.Squad;
import com.solwars.game.units.SteeringManager;
import com.solwars.game.units.Unit;
import com.solwars.game.units.smallShip.Fighter;
import com.solwars.game.units.testing.Target;

public class Level extends _lDefaultScreen{
    int tick = 0;

    OrthographicCamera cam;

    private final boolean DEBUG = false;
    Label debug = new Label("Debug", ResourcesManager.getInstance().theme);
    ShapeRenderer shapeDebugger = new ShapeRenderer();

    Stage stage = new Stage();


    SpriteBatch spriteBatch = new SpriteBatch();


    Unit target = new Target();


    public Level(Game game){
        super(game);
        setInput();
        cam = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        cam.position.x = Gdx.graphics.getWidth()/2;
        cam.position.y = Gdx.graphics.getHeight()/2;
        cam.update();
        spriteBatch.getProjectionMatrix().set(cam.combined);
        create();

    }

    public void setInput(){
        Gdx.input.setInputProcessor(stage);

    }

    public void setPositions(){

    }

    public void create() {
        int squadCount = 5;
        int squadSize = 3;
        for(int i = 0; i < squadCount; i++){
            Unit fighter = new Fighter(0,new Vector2((float)Math.random() * Gdx.graphics.getWidth(), (float)Math.random() * Gdx.graphics.getHeight()), new Vector2(0,0)).getUnit();
            fighter.setTarget(target);
            Squad squad = new Squad(fighter, 0 ).getSquad();
            for(int j = 0; j < squadSize; j++){
                fighter = new Fighter(0,new Vector2((float)Math.random() * Gdx.graphics.getWidth(), (float)Math.random() * Gdx.graphics.getHeight()), new Vector2(0,0));    
                fighter.setTarget(target);
                fighter.setMovementMode(SteeringManager.ARRIVAL);
                squad.addMember(fighter);
            }
        }
    }



    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        // System.out.println(delta);
        stage.clear();
        Gdx.gl.glClearColor(1f, 1f, 1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);





        stage.draw();
        spriteBatch.begin();
        GameInstance.getInstance().update(spriteBatch, delta);
        spriteBatch.end();
//        target.setPosition(new Vector2(Gdx.input.getX(), Gdx.graphics.getHeight() - (Gdx.input.getY() )));



        tick++;
//        GameInstance.getInstance().world.step(1/45f, 6, 2);
//        System.out.println("End");
    }


    public void debug(){
        for(Unit unit : GameInstance.getInstance().fighters)
        {
            //unit.debug(stage, shapeDebugger);
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
