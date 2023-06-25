package org.sabertech.util;

import java.util.Random;

public enum GameElement {

    ROCK,
    PAPER,
    SCISSORS;

    private static final Random RANDOM = new Random();

    public static GameElement generateRandomGameElement()  {
        GameElement[] elements = values();
        return elements[RANDOM.nextInt(elements.length)];
    }

}
