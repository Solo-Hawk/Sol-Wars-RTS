package com.solwars.game.screens.menu;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.solwars.game.ResourcesManager;

/**
 * Menu container for all menu elements
 */
public class menuMain extends _mDefaultScreen {
    Stage stage = new Stage();
    Skin skin = ResourcesManager.getInstance().theme;
    private TextButton buttonNewGame,buttonSettings, buttonExit;
    public float x = 0;

    public menuMain(Game game){
        super(game);


    }

    public void setInput(){
        Gdx.input.setInputProcessor(stage);// Make the stage consume events
    }


    @Override
    public void show(){
        buttonNewGame = new TextButton("New game", skin); // Use the initialized skin
        buttonSettings = new TextButton("Settings", skin);
        buttonExit = new TextButton("Exit", skin);

        setPositions();

        buttonNewGame.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                System.out.println("Start Game");
                buttonNewGame.setChecked(false);
                Menu.getInstance().mMain.dispose();
                System.out.println("Here");
                //Add set screen here

            }});
        buttonSettings.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                System.out.println("Settings");
                Menu.getInstance().setTransition(Menu.getInstance().mSettings, false);
                buttonSettings.setChecked(false);

            }});
        buttonExit.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                System.out.println("Exit");
                Gdx.app.exit();

            }});

        stage.addActor(buttonNewGame);
        stage.addActor(buttonSettings);
        stage.addActor(buttonExit);
    }

    @Override
    public void setPositions(){
        buttonNewGame.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 + this.x, Gdx.graphics.getHeight()/2);
        buttonSettings.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 + this.x, Gdx.graphics.getHeight()/2 - (buttonNewGame.getY()/2 + 20));
        buttonExit.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 + this.x, Gdx.graphics.getHeight()/2 - (buttonSettings.getY()/2 + 20));
    }
    @Override
    public float getX(){
        return this.x;
    }

    @Override
    public void setX(float x){
        this.x = x;
        System.out.println("Setting x as " + this.x);
        setPositions();
    }

    @Override
    public void render(float Delta){
        stage.act();
        stage.draw();
    }
}
