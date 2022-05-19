package com.hazmat.cdtech1.screens;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
 
	private SpriteBatch batch;

  	@Override
	public void show() {
        batch = new SpriteBatch();
		//initialize your game attributes here
    	//inicialize os atributos do seu jogo aqui
	}
	
	

	@Override
	public void render(float delta) {
		batch.begin();
		//draw your game here
   		//desenhe seu jogo aqui
		batch.end();
	}

}
