package com.kyperbelt.game.desktop;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kyperbelt.game.Quarantino;
import com.kyperbox.KyperBoxGame;
import com.kyperbox.console.DevConsole;
import com.kyperbox.ztests.ParticleTests;

public class DesktopLauncher {
	public static final boolean DEPLOYMENT = false;
	
	public static void main (String[] arg) {
		if(!DEPLOYMENT) {
			//AutoPacking.size = 4096;
				AutoPacking.pack("game", "image", "game");
			}
			//game
			KyperBoxGame game = new Quarantino();
			
			game.setDevConsole(new DevConsole("console.fnt", "shade1.png",Keys.GRAVE));
			
			//config
			LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
			config.width = (int) game.getView().getWorldWidth();
			config.height = (int) game.getView().getWorldHeight();
			config.title = game.getGameName();
			new LwjglApplication(game, config);
	}
}
