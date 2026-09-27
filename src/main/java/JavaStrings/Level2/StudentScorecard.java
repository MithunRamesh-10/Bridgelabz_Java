public class StudentScorecard {

    static int[][] generateMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {

            marks[i][0] = (int) (Math.random() * 100);
            marks[i][1] = (int) (Math.random() * 100);
            marks[i][2] = (int) (Math.random() * 100);
        }

        return marks;
    }

    static double[][] calculateResult(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total =
                    marks[i][0] +
                            marks[i][1] +
                            marks[i][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    static String[][] calculateGrade(double[][] result) {

        String[][] grades = new String[result.length][1];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 90) {
                grades[i][0] = "A";
            } else if (percentage >= 80) {
                grades[i][0] = "B";
            } else if (percentage >= 70) {
                grades[i][0] = "C";
            } else if (percentage >= 60) {
                grades[i][0] = "D";
            } else if (percentage >= 50) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "F";
            }
        }

        return grades;
    }

    static void displayScorecard(
            int[][] marks,
            double[][] result,
            String[][] grades) {

        System.out.println(
                "\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade"
        );

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t\t" +
                            marks[i][2] + "\t" +
                            (int) result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "%\t\t" +
                            grades[i][0]
            );
        }
    }

    public static void main(String[] args) {

        int students = 5;

        int[][] marks = generateMarks(students);

        double[][] result = calculateResult(marks);

        String[][] grades = calculateGrade(result);

        displayScorecard(marks, result, grades);
    }
}
