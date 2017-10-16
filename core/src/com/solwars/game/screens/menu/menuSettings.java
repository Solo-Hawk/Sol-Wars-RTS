package com.solwars.game.screens.menu;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.solwars.game.ResourcesManager;

/**
 * Contains all elements that will goto the Settings screen of the Game Menu (Currently just for volume control)
 */
public class menuSettings extends _mDefaultScreen {

    Stage stage = new Stage();
    Skin skin = ResourcesManager.getInstance().theme;
    private TextButton buttonBack;
    private Label textVolume;
    private Slider slidVolume;
    public float x = 0;

    public menuSettings(Game game){
        super(game);


    }

    public void setInput(){
        Gdx.input.setInputProcessor(stage);// Make the stage consume events
    }

    @Override
    public void show(){

        buttonBack = new TextButton("Back", skin);
        buttonBack.setSize(108, 108);
        buttonBack.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                Menu.getInstance().setTransition(Menu.getInstance().mMain, true);
                buttonBack.setChecked(false);
            }});

        slidVolume = new Slider(0f,100f,1f,false, skin);
        slidVolume.setSize(480, 108);

        textVolume = new Label("Volume", skin);
        textVolume.setSize(480, 108);
        textVolume.setAlignment(Align.center);

        setPositions();

        stage.addActor(textVolume);
        stage.addActor(slidVolume);
        stage.addActor(buttonBack);
    }
    @Override
    public void setPositions(){
        buttonBack.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 + this.x - 148, (Gdx.graphics.getHeight()/2) + 148);
        textVolume.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 + this.x, Gdx.graphics.getHeight()/2);
        slidVolume.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 + this.x, Gdx.graphics.getHeight()/2 - 100);
    }

    @Override
    public float getX(){
        return this.x;
    }

    @Override
    public void setX(float x){
        this.x = x;
        System.out.println("Set x as " + this.x);
        setPositions();

    }

    @Override
    public void render(float Delta){
        stage.act();
        stage.draw();
    }
}
