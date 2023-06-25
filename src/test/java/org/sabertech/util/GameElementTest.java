package org.sabertech.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameElementTest {

    @Test
    public void generateRandomElement_ReturnsValue(){
        assertNotNull(GameElement.generateRandomGameElement());
    }

}