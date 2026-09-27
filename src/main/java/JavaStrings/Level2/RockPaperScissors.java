import java.util.Scanner;

public class RockPaperScissors {

    static String getComputerChoice() {

        int choice = (int) (Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper"))) {

            return "User";
        }

        return "Computer";
    }

    static double calculatePercentage(int wins, int totalGames) {

        return ((double) wins / totalGames) * 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        System.out.println("\nEnter Rock, Paper or Scissors");

        for (int i = 1; i <= games; i++) {

            System.out.print("Game " + i + ": ");
            String user = sc.next();

            String computer = getComputerChoice();

            String winner = findWinner(user, computer);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }

            System.out.println(
                    "Computer: " + computer +
                            " | Winner: " + winner
            );
        }

        double userPercentage =
                calculatePercentage(userWins, games);

        double computerPercentage =
                calculatePercentage(computerWins, games);

        System.out.println("\n----- Statistics -----");

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);

        System.out.println(
                "User Winning Percentage: "
                        + userPercentage + "%"
        );

        System.out.println(
                "Computer Winning Percentage: "
                        + computerPercentage + "%"
        );

        sc.close();
    }
}
