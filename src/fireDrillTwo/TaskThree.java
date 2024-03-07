package fireDrillTwo;
import java.util.*;
public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your scores: ");
        int score = input.nextInt();
        double average = 0;
        int sum = 0;
        for(int count = 0; count < 10; count++){
            System.out.print("Enter your scores: ");
             score = input.nextInt();
             sum += score;
             average = (double)sum / 10;

        }
       System.out.printf("Sum of all scores is %d%n", score);
        System.out.printf("average of all scores is %d%n", average);
    }

}
