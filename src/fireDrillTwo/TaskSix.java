package fireDrillTwo;

import  java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a score: ");
            int score = input.nextInt();
            sum += score;
            count++;
        }

        average = (double) sum / count;
        System.out.println("The average of the scores is: " + average);
}
}

