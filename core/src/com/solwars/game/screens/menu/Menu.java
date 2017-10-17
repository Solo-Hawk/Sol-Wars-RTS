package com.solwars.game.screens.menu;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.solwars.game.ResourcesManager;


/**
 * This contains all elements for the Main Menu Scene, this is the first loaded screen when starting the game and returning to the menu
 */
public class Menu extends _mDefaultScreen {

    Stage stage = new Stage();
    Image title = ResourcesManager.getInstance().gameTitle;

    _mDefaultScreen activeScene;
    _mDefaultScreen transitionScene;

    float x, y;

    float tSpeed = 4;
    boolean moveLeft = false;
    boolean isTransition = false;

    // All Screens are referenced by a number
    /*
    0: mMain
    1: mSettings
     */
    _mDefaultScreen mMain = new menuMain(this.game);
    _mDefaultScreen mSettings = new menuSettings(this.game);

    //menuMain mMain = new menuMain(this.game);
    //menuSettings mSettings = new menuSettings(this.game);

    public static Menu instance;

    public static Menu getInstance(){

        return instance;
    }



    /**
     * Only called at the start of the programme in Main.java
     * @param game - Game Instance
     */
    public Menu(Game game){
        super(game);
        instance = this;
        mMain.show();
        mMain.setInput();
        mSettings.show();
        activeScene = mMain;
        init();
    }



    public void init(){
        title.setPosition((Gdx.graphics.getWidth() / 2) - (title.getWidth()/2), (Gdx.graphics.getHeight() / 8) * 6);
        stage.addActor(title);
    }


    @Override
    public void show() {





    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.4f, 0.4f, 0.4f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        if(activeScene == mMain){
            stage.act();
            stage.draw();
        }
        if(isTransition) {
            transition(delta);
        }else{
            activeScene.render(delta);}
    }

    public void setTransition(_mDefaultScreen newScreen, boolean moveLeft){
        this.moveLeft = moveLeft;
        isTransition = true;
        transitionScene = newScreen;
        if(moveLeft){transitionScene.setX(-(Gdx.graphics.getWidth()));
        } else {transitionScene.setX(Gdx.graphics.getWidth());
        }

    }

    public void transition(float delta){
        if(moveLeft && isTransition){
            if(activeScene.getX() < (Gdx.graphics.getWidth())){
                activeScene.setX(activeScene.getX() + ((Gdx.graphics.getWidth() * tSpeed) * delta));
                transitionScene.setX(transitionScene.getX() + ((Gdx.graphics.getWidth() * tSpeed) * delta));
                activeScene.render(delta);
                transitionScene.render(delta);
            }else {
                System.out.println("Ended2");
                endTransition();}
        }else if(!moveLeft && isTransition){
            if(activeScene.getX() > -(Gdx.graphics.getWidth())){
                activeScene.setX(activeScene.getX() - ((Gdx.graphics.getWidth() * tSpeed) * delta));
                transitionScene.setX(transitionScene.getX() - ((Gdx.graphics.getWidth()* tSpeed) * delta));
                activeScene.render(delta);
                transitionScene.render(delta);
            }else{System.out.println("Ended1");endTransition();}

        }else{isTransition = false;}


        if(activeScene.getX() < (Gdx.graphics.getWidth())){

        }


    }

    public void endTransition(){
        activeScene = transitionScene;
        activeScene.setX(0f);
        activeScene.setInput();
        isTransition = false;
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
