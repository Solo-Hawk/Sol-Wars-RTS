package com.solwars.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.solwars.game.SolWars;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.setFromDisplayMode(LwjglApplicationConfiguration.getDesktopDisplayMode());
		//If I want to test windowed
		boolean fullscreen = true;
		if(!fullscreen ){
			config.fullscreen = false;
			config.width = 1920;
			config.height = 1080;
		}
		config.forceExit = true;
		config.resizable = true;
		config.samples = 4;
		config.vSyncEnabled = false;
		new LwjglApplication(new SolWars(), config);
	}
}
