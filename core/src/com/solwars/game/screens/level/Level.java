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
import com.solwars.game.units.SteeringManager;
import com.solwars.game.units.Unit;
import com.solwars.game.units.smallShip.Fighter;

public class Level extends _lDefaultScreen{
    int tick = 0;

    OrthographicCamera cam;

    private final boolean DEBUG = false;
    Label debug = new Label("Debug", ResourcesManager.getInstance().theme);
    ShapeRenderer shapeDebugger = new ShapeRenderer();

    Stage stage = new Stage();


    SpriteBatch spriteBatch = new SpriteBatch();


    Unit target;
    Unit tTarget;




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

    public void create(){
        target = new Fighter();

        target.setPosition(new Vector2(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2));
        tTarget = new Fighter();
        tTarget.setPosition(new Vector2(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2));
        tTarget.setTarget(target);
//        Handle limit is around 50,000 Entities
//        for(int x = 0; x < 1000; x++){
//            GameInstance.getInstance().fighters.add(new Fighter());
//            GameInstance.getInstance().fighters.get(x).setTarget(target);
//            GameInstance.getInstance().fighters.get(x).setPosition(new Vector2((float)Math.random() * Gdx.graphics
//                    .getWidth(), (float)Math.random() * Gdx.graphics.getHeight() ));
//        }
        int squadCount = 400;
        int squadSize = 300;
        for(int i = 0; i < squadCount; i++){
            System.out.println("Squad Number" + i + " " + (i*squadSize));
            GameInstance.getInstance().fighters.add(new Fighter());
            GameInstance.getInstance().fighters.get(i * squadSize).setTarget(target);
            GameInstance.getInstance().fighters.get(i * squadSize).setPosition(new Vector2((float)Math.random() * Gdx.graphics
                    .getWidth(), (float)Math.random() * Gdx.graphics.getHeight() ));
            GameInstance.getInstance().fighters.get(i * squadSize).steeringManager.setMovementMode(SteeringManager.SEEK);
            for(int j = 1; j < squadSize + 1; j++){
                System.out.println("Squad unit" + j + " " + (i*squadSize + j));
                GameInstance.getInstance().fighters.add(new Fighter());
                GameInstance.getInstance().fighters.get(i * squadSize + j).setTarget(GameInstance.getInstance().fighters.get(i * squadSize));
                GameInstance.getInstance().fighters.get(i * squadSize + j).setPosition(new Vector2((float)Math.random() * Gdx.graphics
                        .getWidth(), (float)Math.random() * Gdx.graphics.getHeight() ));
                GameInstance.getInstance().fighters.get(i * squadSize + j).steeringManager.setMovementMode(SteeringManager.ARRIVAL);

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
        target.draw(spriteBatch);
        tTarget.update(delta);
        tTarget.draw(spriteBatch);
        spriteBatch.end();
//        target.setPosition(new Vector2(Gdx.input.getX(), Gdx.graphics.getHeight() - (Gdx.input.getY() )));

        if(tick % 200 == 0)
            target.setPosition(new Vector2((float)Math.random() * Gdx.graphics.getWidth(), (float)Math.random() * Gdx
             .graphics.getHeight() ));

        tick++;
        GameInstance.getInstance().world.step(1/45f, 6, 2);
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
