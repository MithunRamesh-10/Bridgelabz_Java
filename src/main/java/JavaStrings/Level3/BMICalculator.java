import java.util.Scanner;

public class BMICalculator {

    static String[] calculateBMI(double weight, double heightCm) {

        double heightMeter = heightCm / 100;

        double bmi = weight / (heightMeter * heightMeter);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.valueOf(heightCm),
                String.valueOf(weight),
                String.valueOf(Math.round(bmi * 100.0) / 100.0),
                status
        };
    }

    static String[][] processPeople(double[][] people) {

        String[][] result = new String[people.length][4];

        for (int i = 0; i < people.length; i++) {

            String[] bmiResult =
                    calculateBMI(people[i][0], people[i][1]);

            for (int j = 0; j < 4; j++) {
                result[i][j] = bmiResult[j];
            }
        }

        return result;
    }

    static void display(String[][] result) {

        System.out.println(
                "Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus"
        );

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                            result[i][0] + "\t\t" +
                            result[i][1] + "\t\t" +
                            result[i][2] + "\t" +
                            result[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] people = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter weight of person "
                    + (i + 1) + " in kg: ");
            people[i][0] = sc.nextDouble();

            System.out.print("Enter height of person "
                    + (i + 1) + " in cm: ");
            people[i][1] = sc.nextDouble();
        }

        String[][] result = processPeople(people);

        display(result);

        sc.close();
    }
}