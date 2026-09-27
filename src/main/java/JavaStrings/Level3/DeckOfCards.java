import java.util.Scanner;

public class DeckOfCards {

    static String[] initializeDeck() {

        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7",
                "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        int numOfCards = suits.length * ranks.length;

        String[] deck = new String[numOfCards];

        int index = 0;

        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index] = rank + " of " + suit;

                index++;
            }
        }

        return deck;
    }

    static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCardNumber =
                    i + (int)
                            (Math.random() * (n - i));

            String temp = deck[i];

            deck[i] = deck[randomCardNumber];

            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    static String[][] distributeCards(
            String[] deck, int numberOfPlayers) {

        if (deck.length % numberOfPlayers != 0) {

            System.out.println(
                    "Cards cannot be equally distributed."
            );

            return null;
        }

        int cardsPerPlayer =
                deck.length / numberOfPlayers;

        String[][] players =
                new String[numberOfPlayers][cardsPerPlayer];

        int index = 0;

        for (int i = 0; i < numberOfPlayers; i++) {

            for (int j = 0;
                 j < cardsPerPlayer;
                 j++) {

                players[i][j] = deck[index];

                index++;
            }
        }

        return players;
    }

    static void displayPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println(
                    "\nPlayer " + (i + 1) + ":"
            );

            for (int j = 0;
                 j < players[i].length;
                 j++) {

                System.out.println(
                        players[i][j]
                );
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int numberOfPlayers = sc.nextInt();

        String[] deck = initializeDeck();

        deck = shuffleDeck(deck);

        String[][] players =
                distributeCards(deck, numberOfPlayers);

        if (players != null) {
            displayPlayers(players);
        }

        sc.close();
    }
}