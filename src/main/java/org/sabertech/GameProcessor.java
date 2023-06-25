package org.sabertech;

import org.sabertech.util.GameElement;
import org.sabertech.util.GameResult;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameProcessor {

    public EnumMap<GameResult, Integer> runGamePopulateResultsMap() {

        Map<Integer,GameResult> individualResultMap = new HashMap<>();

        for(int i = 0; i<100; i++){
            individualResultMap.put(i, getPlayer2GameResult(GameElement.generateRandomGameElement()));
        }

        return createResultsMap(individualResultMap);
    }

    public static GameResult getPlayer2GameResult(GameElement element) {

        // Player 1 is always rock

        switch (element){
            case PAPER:
                return GameResult.WIN;
            case SCISSORS:
                return GameResult.LOSE;
            default:
                //For this game default will be a DRAW and therefore same as ROCK
                return GameResult.DRAW;
        }
    }

    private static EnumMap<GameResult, Integer> createResultsMap(Map<Integer,GameResult> individualResultMap){

        return Stream.of(GameResult.values())
                .collect(Collectors.toMap(c -> c, c -> getGameElementSizeInMap(individualResultMap, c),
                        Integer::sum,
                        () -> new EnumMap<>(GameResult.class)));
    }

    private static int getGameElementSizeInMap(Map<Integer, GameResult> individualResultMap, GameResult gameResult) {
        return (int) individualResultMap.entrySet().stream()
                .filter(r -> r.getValue().equals(gameResult)).count();
    }
}
