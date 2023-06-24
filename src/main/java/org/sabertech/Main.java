package org.sabertech;

public class Main {

    /**
     * Rock Paper Scissors Game
     *
     * 1 = 100 iterations of the game
     * 2 = Each Iteration:
     * - One player always selects rock
     * - The other player is a random selection
     * - Store result
     * 3 = At end of iterations present summary to user
     */

    public static void main(String[] args) {

        /**
         * In this method we want to do the following:
         * 100 iterations of the game
         * Get result of game: win lose or draw
         * Store results:
         *  - option 1: increment a count for each result => i += 1
         *  - option 2: populate a list of every result then get count for each result
         *  - option 3: populate map -> key is outcome, value is overall count of that result (maybe uses option 1 here for count)
         * Get summary of results
         * Print results to user
         */

        //Updated method
        // 1 - Get the results
        GameProcessor processor = new GameProcessor();

        // 2 - Print the summary to the user

    }
}