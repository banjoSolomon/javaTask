package fireDrillTwo;
import java.util.Scanner;
public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddSum = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter a number: ");
            double score = input.nextDouble();

            if (count % 2 != 0) {
                oddSum += score;
            }
        }
    System.out.printf("The score of even numbers are %d%n",oddSum);
    }
}