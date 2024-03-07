package fireDrillTwo;

import java.util.*;
public class TaskOne{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Scores: ");
        int score = input.nextInt();
        int sum = 0;
        for(int count = 0; count <= 10; count++){
            System.out.print("Enter your Scores: ");
             score = input.nextInt();
            sum += score;

        }
        System.out.printf("The sum of the scores is %d%n", sum);
    }






}