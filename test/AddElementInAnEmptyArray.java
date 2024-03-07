import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AddElementInAnEmptyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> emptyList = new ArrayList<>();
        Set<Integer> uniqueSet = new HashSet<>();

        for (int count = 0; count < 10; count++) {
            System.out.println("Enter 10 numbers: ");
            int userInput = input.nextInt();

            if(!uniqueSet.add(userInput)) System.out.print("Duplicate number: " +userInput);
            emptyList.add(userInput);



        }
        System.out.print("All numbers entered: " + emptyList);
    }
}