package org.sabertech;

import org.junit.jupiter.api.Test;
import org.sabertech.util.GameElement;
import org.sabertech.util.GameResult;

import java.util.EnumMap;

import static org.junit.jupiter.api.Assertions.*;

class GameProcessorTest {

    @Test
    public void gameResultMap_ContainsAllResults(){
        GameProcessor processor = new GameProcessor();
        EnumMap<GameResult,Integer> resultMap = processor.gameApplication();
        assertAll("resultMap",
                () -> assertTrue(resultMap.containsKey(GameResult.WIN)),
                () -> assertTrue(resultMap.containsKey(GameResult.DRAW)),
                () -> assertTrue(resultMap.containsKey(GameResult.LOSE))
        );

        assertEquals(100, resultMap.get(GameResult.WIN) + resultMap.get(GameResult.DRAW) + resultMap.get(GameResult.LOSE));
    }

    @Test
    public void paperShouldDefeatRock(){
        assertEquals(GameResult.WIN, GameProcessor.elementResult(GameElement.PAPER));
    }

    @Test
    public void scissorsShouldLoseToRock(){
        assertEquals(GameResult.LOSE, GameProcessor.elementResult(GameElement.SCISSORS));
    }

    @Test
    public void sameElements_ReturnsDraw(){
        assertEquals(GameResult.DRAW, GameProcessor.elementResult(GameElement.ROCK));
    }

}