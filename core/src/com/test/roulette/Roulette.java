package com.test.roulette;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.ArrayList;

/**
 * Created by Joaco99 on 22/07/2017.
 */

public class Roulette extends Actor {

    private int optionsNumber;
    private ArrayList<Color> colors;
    private float radius;
    private float rotation;

    public Roulette(int optionsNumber, float radius) {
        this.optionsNumber = optionsNumber;
        this.radius = radius;
        colors = new ArrayList<Color>(optionsNumber);

    }

    public void setOptionsNumber(int optionsNumber) {
        this.optionsNumber = optionsNumber;
    }

    public void addColor(Color color) {
        colors.add(color);
    }

    public void render(ShapeRenderer renderer, float delta) {
        for (int i = 0; i < optionsNumber; i++) {
            renderer.set(ShapeRenderer.ShapeType.Filled);
            renderer.setColor(colors.get(i));
            /* THIS LOOKS INTERESTING
            renderer.arc(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, radius,
                    360 / optionsNumber * i + rotation * i, 360 / optionsNumber, 1000);
            renderer.set(ShapeRenderer.ShapeType.Line);
            renderer.setColor(Color.BLACK);
            renderer.arc(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, radius,
                    360 / optionsNumber * i + rotation * i, 360 / optionsNumber, 1000);*/
            renderer.arc(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, radius,
                    360 / optionsNumber * i + rotation, 360 / optionsNumber, 1000);
            renderer.set(ShapeRenderer.ShapeType.Line);
            renderer.setColor(Color.BLACK);
            renderer.arc(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2, radius,
                    360 / optionsNumber * i + rotation, 360 / optionsNumber, 1000);
        }
        rotation += Constants.ROTATION_SPEED * delta;
    }

    @Override
    public void act(float delta) {
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {

    }
}
