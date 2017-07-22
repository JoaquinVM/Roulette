package com.test.roulette;

import com.badlogic.gdx.Game;

public class Roulette extends Game {

    @Override
    public void create() {
        setScreen(new GameScreen());
    }


}
