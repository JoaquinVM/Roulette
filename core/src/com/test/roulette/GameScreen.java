package com.test.roulette;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by Joaco99 on 22/07/2017.
 */

public class GameScreen extends ScreenAdapter {

    Stage stage;
    SpriteBatch batch;
    BitmapFont font;
    private ShapeRenderer renderer;

    @Override
    public void show() {
        stage = new Stage();
        batch = new SpriteBatch();
        font = new BitmapFont();
        renderer = new ShapeRenderer();

        stage.getViewport().setWorldSize(Constants.WORLD_WIDTH, Constants.WORLD_HEIGHT);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();

        renderer.begin(ShapeRenderer.ShapeType.Line);
        renderer.setColor(Color.RED);
        renderer.arc(200, 200, 100, 0, 180, 100);
        renderer.setColor(Color.GREEN);
        renderer.arc(200, 200, 100, 180, 180, 100);
        renderer.end();

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
        renderer.dispose();
    }
}
