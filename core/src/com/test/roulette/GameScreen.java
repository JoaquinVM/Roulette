package com.test.roulette;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class GameScreen extends ScreenAdapter {

    Stage stage;
    SpriteBatch batch;
    BitmapFont font;
    private ShapeRenderer renderer;
    private Roulette roulette;

    @Override
    public void show() {
        stage = new Stage();
        batch = new SpriteBatch();
        font = new BitmapFont();
        renderer = new ShapeRenderer();
        roulette = new Roulette(5, 200);

        roulette.addColor(Color.GREEN);
        roulette.addColor(Color.RED);
        roulette.addColor(Color.YELLOW);
        roulette.addColor(Color.BLUE);
        roulette.addColor(Color.OLIVE);

        Gdx.gl.glLineWidth(4);
        stage.getViewport().setWorldSize(Constants.WORLD_WIDTH, Constants.WORLD_HEIGHT);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();

        renderer.begin(ShapeRenderer.ShapeType.Line);
        renderer.setAutoShapeType(true);

        roulette.render(renderer);
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
