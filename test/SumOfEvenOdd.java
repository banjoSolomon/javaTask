import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Number:");
        int userInput = input.nextInt();
        int sumOfEven = 0;
        int sumOfOdd = 0;


        for(int count = 0; count < userInput; count++)
            if (count % 2 == 0) sumOfEven += count;

            else
                sumOfOdd += count;
        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);

        }

    }

