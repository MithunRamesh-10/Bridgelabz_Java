package javaString.level2;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Java String Level 2 Assignment)
 * Create a Rock-Paper-Scissors game between the user
 * and computer and display winning statistics.
 *
 * Author : Hemang
 * Date : 25-09-2026
 */
public class RockPaperScissors {

    // Generate computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    // Find the winner between user and computer
    public static String findWinner(
            String userChoice,
            String computerChoice) {

        // Check for a draw
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }

        // Check user winning conditions
        if ((userChoice.equals("Rock")
                && computerChoice.equals("Scissors"))
                || (userChoice.equals("Paper")
                && computerChoice.equals("Rock"))
                || (userChoice.equals("Scissors")
                && computerChoice.equals("Paper"))) {
            return "User";
        }

        return "Computer";
    }

    // Calculate winning statistics
    public static String[][] calculateStatistics(
            int userWins,
            int computerWins,
            int draws,
            int totalGames) {

        double userPercentage =
                (userWins * 100.0) / totalGames;

        double computerPercentage =
                (computerWins * 100.0) / totalGames;

        String[][] statistics = {
                {"User Wins", String.valueOf(userWins),
                        String.format("%.2f%%", userPercentage)},
                {"Computer Wins", String.valueOf(computerWins),
                        String.format("%.2f%%", computerPercentage)},
                {"Draws", String.valueOf(draws),
                        String.format("%.2f%%",
                                (draws * 100.0) / totalGames)}
        };

        return statistics;
    }

    // Display game results and statistics
    public static void displayResults(
            String[][] games,
            String[][] statistics) {

        System.out.printf(
                "%-8s %-12s %-12s %-12s%n",
                "Game", "User", "Computer", "Result");

        for (int i = 0; i < games.length; i++) {
            System.out.printf(
                    "%-8s %-12s %-12s %-12s%n",
                    games[i][0],
                    games[i][1],
                    games[i][2],
                    games[i][3]);
        }

        System.out.println();

        System.out.printf(
                "%-18s %-10s %-12s%n",
                "Result", "Wins", "Percentage");

        for (int i = 0; i < statistics.length; i++) {
            System.out.printf(
                    "%-18s %-10s %-12s%n",
                    statistics[i][0],
                    statistics[i][1],
                    statistics[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of games
        System.out.print("Enter number of games: ");
        int gamesCount = input.nextInt();

        String[][] games = new String[gamesCount][4];

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        // Play multiple games
        for (int i = 0; i < gamesCount; i++) {

            System.out.print(
                    "Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = input.next();

            // Convert first letter to uppercase and remaining to lowercase
            userChoice = userChoice.substring(0, 1).toUpperCase()
                    + userChoice.substring(1).toLowerCase();

            String computerChoice = getComputerChoice();

            String winner =
                    findWinner(userChoice, computerChoice);

            // Store game result
            games[i][0] = String.valueOf(i + 1);
            games[i][1] = userChoice;
            games[i][2] = computerChoice;
            games[i][3] = winner;

            // Update statistics
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        // Calculate statistics
        String[][] statistics =
                calculateStatistics(
                        userWins,
                        computerWins,
                        draws,
                        gamesCount);

        // Display results
        displayResults(games, statistics);

        input.close();
    }
}
