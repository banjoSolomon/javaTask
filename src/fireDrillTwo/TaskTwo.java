package fireDrillTwo;
import java.util.*;
public class TaskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Scores: ");
        int score = input.nextInt();
        int sum = 0;
         double average = 0;
        int count = 0;
        while (count < 10){
            System.out.print("Enter your Scores: ");
            score = input.nextInt();
            sum += score;
            average = (double) sum / score;
            count++;

        }
        System.out.printf("Average score is %d%n", average);
    }
}
