package com.solwars.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.*;


/**
 * Loads all resources for the game in a single class
 */
public class ResourcesManager {

    public Skin theme = new Skin(Gdx.files.internal("flat/skin/skin.json"));

    public Image gameTitle = new Image(new Texture(Gdx.files.internal("solWars/title.png")));


    private TextureAtlas atlasSmallShips = new TextureAtlas(Gdx.files.internal("packs/smallShip.atlas"));

    public Sprite shipFighter = atlasSmallShips.createSprite("Fighter");
    public Sprite shipBomber = atlasSmallShips.createSprite("Bomber");
    public Sprite shipScout = atlasSmallShips.createSprite("Scout");
    public Sprite shipInterceptor = atlasSmallShips.createSprite("Interceptor");







    public static ResourcesManager instance;

    public static ResourcesManager getInstance(){
        if (instance == null){
            instance = new ResourcesManager();
        }
        return instance;
    }

    public Skin createBasicSkin(){

        //Create a font
        BitmapFont font = new BitmapFont();

        theme.add("default", font);

        //Create a texture
        Pixmap pixmap = new Pixmap((int)Gdx.graphics.getWidth()/4,(int)Gdx.graphics.getHeight()/10, Pixmap.Format.RGB888);
        pixmap.setColor(Color.WHITE);
        pixmap.fill();
        theme.add("background",new Texture(pixmap));

        //Button style
        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.up = theme.newDrawable("background", Color.GRAY);
        textButtonStyle.down = theme.newDrawable("background", Color.DARK_GRAY);
        textButtonStyle.checked = theme.newDrawable("background", Color.GRAY);
        textButtonStyle.over = theme.newDrawable("background", Color.LIGHT_GRAY);
        textButtonStyle.font = theme.getFont("default");
        theme.add("default", textButtonStyle);
/*
        //Text Area style
        TextField.TextFieldStyle textFieldStyle = new TextField.TextFieldStyle();
        textFieldStyle.background = theme.newDrawable("background", Color.GRAY);
        textFieldStyle.font = theme.getFont("default");
        theme.add("default", textFieldStyle);
*/
        //Label Style
        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.background = theme.newDrawable("background", Color.GRAY);
        labelStyle.font = theme.getFont("default");
        theme.add("default", labelStyle);

        //Button Style
        Button.ButtonStyle buttonStyle = new Button.ButtonStyle();
        buttonStyle.up = theme.newDrawable("background", Color.GRAY);
        buttonStyle.down = theme.newDrawable("background", Color.GRAY);

        //Slider Style
        Slider.SliderStyle sliderStyle = new Slider.SliderStyle();

        sliderStyle.background = theme.newDrawable("background", Color.GRAY);


        return theme;
    }

    public ResourcesManager(){
        init();
    }
    public void init(){
        theme = createBasicSkin();

        this.shipFighter.scale(-0.9f);
        this.shipBomber.scale(-0.9f);
        this.shipScout.scale(-0.9f);
        this.shipInterceptor.scale(-0.9f);
    }

}
