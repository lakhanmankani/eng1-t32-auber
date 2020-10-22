package com.mygdx.auber;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Auber extends ApplicationAdapter {
	SpriteBatch batch;
	Room room;
	Character userCharacter;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		room = new Room("Room 1.png", batch);
		userCharacter = new Character("Construction worker.png", batch);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			userCharacter.translate(-5, 0);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			userCharacter.translate(5, 0);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			userCharacter.translate(0, 5);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			userCharacter.translate(0, -5);
		}

		batch.begin();
		room.sprite.draw(batch);
		userCharacter.sprite.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		userCharacter.texture.dispose();
		room.texture.dispose();
	}
}
