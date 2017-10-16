package com.solwars.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.solwars.game.screens.menu.Menu;

public class SolWars extends Game {
	@Override
	public void create () {setScreen(new Menu(this));
	}

}
