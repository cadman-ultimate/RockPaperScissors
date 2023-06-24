package org.sabertech.util;

import java.util.Random;

public enum GameElement {

    ROCK,
    PAPER,
    SCISSORS;

    private static final Random randomElement = new Random();

    public static GameElement generateRandomElement()  {
        GameElement[] elements = values();
        return elements[randomElement.nextInt(elements.length)];
    }

}
