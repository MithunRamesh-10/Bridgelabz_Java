package javaString.level3;

import java.util.Scanner;

/**
 * Problem 10 (GCR — Java String Level 3 Assignment)
 * Create, initialize, shuffle and distribute a deck of cards
 * to the given number of players.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class DeckOfCards {

    // Define card suits
    private static final String[] SUITS = {
            "Hearts",
            "Diamonds",
            "Clubs",
            "Spades"
    };

    // Define card ranks
    private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King", "Ace"
    };

    // Initialize the complete deck
    public static String[] initializeDeck() {
        int numberOfCards =
                SUITS.length * RANKS.length;

        String[] deck = new String[numberOfCards];

        int index = 0;

        // Create every rank and suit combination
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    // Shuffle the deck using random card swapping
    public static String[] shuffleDeck(String[] deck) {

        // Iterate over the deck
        for (int i = 0; i < deck.length; i++) {

            // Generate random position from i to end
            int randomCardNumber =
                    i + (int) (
                            Math.random()
                                    * (deck.length - i)
                    );

            // Swap current card with random card
            String temporary = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temporary;
        }

        return deck;
    }

    // Distribute cards equally among players
    public static String[][] distributeCards(
            String[] deck, int numberOfPlayers) {

        // Check whether cards can be equally distributed
        if (deck.length % numberOfPlayers != 0) {
            return new String[0][0];
        }

        int cardsPerPlayer =
                deck.length / numberOfPlayers;

        String[][] players =
                new String[numberOfPlayers][cardsPerPlayer];

        int cardIndex = 0;

        // Distribute cards to every player
        for (int player = 0;
             player < numberOfPlayers;
             player++) {

            for (int card = 0;
                 card < cardsPerPlayer;
                 card++) {

                players[player][card] =
                        deck[cardIndex];

                cardIndex++;
            }
        }

        return players;
    }

    // Print players and their cards
    public static void printPlayers(
            String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println(
                    "\nPlayer " + (i + 1) + ":");

            for (int j = 0;
                 j < players[i].length;
                 j++) {

                System.out.println(
                        players[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of players
        System.out.print("Enter number of players: ");
        int numberOfPlayers = input.nextInt();

        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle deck
        shuffleDeck(deck);

        // Distribute cards
        String[][] players =
                distributeCards(
                        deck,
                        numberOfPlayers);

        // Check whether distribution is possible
        if (players.length == 0) {
            System.out.println(
                    "Cards cannot be equally distributed "
                            + "among " + numberOfPlayers
                            + " players."
            );
        } else {
            // Display players and their cards
            printPlayers(players);
        }

        input.close();
    }
}
