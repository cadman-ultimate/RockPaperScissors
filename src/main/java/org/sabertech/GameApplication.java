package org.sabertech;


import org.sabertech.util.GameResult;

import java.util.EnumMap;

/**
 * <b>Rock Paper Scissors Game</b>
 * <p>
 * 1 = 100 iterations of the game<br>
 * 2 = Each Iteration:<br>
 * - Player 1 always selects rock<br>
 * - Player 2 is a random selection<br>
 * 3 = At end of iterations present summary to user
 */
public class GameApplication {

    public static void main(String[] args) {

        GameProcessor processor = new GameProcessor();
        final EnumMap<GameResult, Integer> gameResult = processor.runGamePopulateResultsMap();

        System.out.println("Game results...");
        System.out.println("Wins Player 1: " + gameResult.get(GameResult.LOSE));
        System.out.println("Wins Player 2: " + gameResult.get(GameResult.WIN));
        System.out.println("Draws: " + gameResult.get(GameResult.DRAW));

    }
}