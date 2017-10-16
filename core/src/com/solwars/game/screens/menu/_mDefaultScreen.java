package com.solwars.game.screens.menu;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

/**
 * Default screen for all menu classes
 */
public class _mDefaultScreen implements Screen {
    protected Game game;

    public float x;
    public _mDefaultScreen(Game game){this.game = game;}

    public void setInput(){
        // add Gdx.input.setInputProcessor(stage); in respective screens

    }

    public void setPositions(){

    }

    public void setX(float x){
        this.x = x;
    }

    public float getX(){return this.x;}

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

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
