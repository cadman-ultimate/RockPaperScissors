package org.sabertech;

import org.junit.jupiter.api.Test;
import org.sabertech.util.GameElement;
import org.sabertech.util.GameResult;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GameProcessorTest {

    @Test
    public void gameResultMap_ContainsAllResults(){
        GameProcessor processor = new GameProcessor();
        Map<GameResult,Integer> resultMap = processor.gameApplication();
        assertAll("resultMap",
                () -> assertEquals(resultMap.get(0), GameResult.WIN),
                () -> assertEquals(resultMap.get(1), GameResult.DRAW),
                () -> assertEquals(resultMap.get(2), GameResult.LOSE)
        );
    }

    @Test
    public void paperShouldDefeatRock(){
        GameResult result = GameProcessor.elementResult(GameElement.PAPER);
        assertEquals(GameResult.WIN,result);
    }

    @Test
    public void rockShouldDefeatScissors(){
        GameResult result = GameProcessor.elementResult(GameElement.ROCK);
        assertEquals(GameResult.WIN,result);
    }

    @Test
    public void scissorsShouldDefeatPaper(){
        GameResult result = GameProcessor.elementResult(GameElement.SCISSORS);
        assertEquals(GameResult.WIN,result);
    }

    @Test
    public void sameElements_ReturnsDraw(){
        GameResult result = GameProcessor.elementResult(GameElement.PAPER);
        assertEquals(GameResult.DRAW,result);
    }

    @Test
    public void rockShouldLoseToPaper(){
        GameResult result = GameProcessor.elementResult(GameElement.ROCK);
        assertEquals(GameResult.LOSE,result);
    }

    @Test
    public void paperShouldLoseToScissors(){
        GameResult result = GameProcessor.elementResult(GameElement.PAPER);
        assertEquals(GameResult.LOSE,result);
    }

    @Test
    public void scissorsShouldLoseToRock(){
        GameResult result = GameProcessor.elementResult(GameElement.SCISSORS);
        assertEquals(GameResult.LOSE,result);
    }

}