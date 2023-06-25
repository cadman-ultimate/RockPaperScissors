package org.sabertech.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameElementsTest {

    @Test
    public void generateRandomElement_ReturnsValue(){
        GameElements element = GameElements.generateRandomElement();
        assertNotNull(element);
    }

}