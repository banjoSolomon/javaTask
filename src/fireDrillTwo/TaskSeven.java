package fireDrillTwo;
import java.util.*;

public class TaskSeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sumOfEven = 0;
        int countOfEven = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a score: ");
            int score = input.nextInt();
            if (score % 2 == 0) {
                sumOfEven += score;
                countOfEven++;
            }
        }

        double averageOfEven = (double) sumOfEven / countOfEven;
        System.out.println("The sum of the even numbers is: " + sumOfEven);
        System.out.println("The average of the even numbers is: " + averageOfEven);

    }
}