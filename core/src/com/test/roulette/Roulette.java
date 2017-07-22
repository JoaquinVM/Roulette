package com.test.roulette;

import com.badlogic.gdx.graphics.Color;

import java.util.ArrayList;

/**
 * Created by Joaco99 on 22/07/2017.
 */

public class Roulette {

    private int optionsNumber;
    private ArrayList<Color> colors;

    public Roulette() {
        optionsNumber = 0;
    }

    public void setOptionsNumber(int optionsNumber) {
        this.optionsNumber = optionsNumber;
    }
}
