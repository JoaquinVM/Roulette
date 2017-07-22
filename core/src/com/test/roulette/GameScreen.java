package com.test.roulette;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class GameScreen extends ScreenAdapter {

    private Stage stage;
    private SpriteBatch batch;
    private BitmapFont font;

    @Override
    public void show() {
        stage = new Stage();
        batch = new SpriteBatch();
        font = new BitmapFont();

        stage.getViewport().setWorldSize(Constants.WORLD_WIDTH, Constants.WORLD_HEIGHT);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        batch.begin();
        stage.draw();
        batch.end();
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
        batch.dispose();
        font.dispose();
    }
}
