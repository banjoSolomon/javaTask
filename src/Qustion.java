import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Qustion {
    public static int addNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) sum += number;
        return sum;
    }

    public static int subtractNumbers(int number1, int number2) {
        return number1 - number2;

    }

    public static int multiplyNumber(int number1, int number2) {
        return number1 * number2;

    }

    public static int addArray(int[] numbers) {
        int result = 0;
        for (int number : numbers) result += number;
        return result;
    }

    public static int multiplyArray(int[] numbers) {
        int result = 1;
        for (int number : numbers) result *= number;
        return result;
    }

    public static int subtractArray(int[] array) {
        if (array.length == 0) return 0;
        int result = array[0];
        for (int i = 1; i < array.length; i++)
            result -= array[i];


        return result;
    }



    public static boolean[] evenAndOddArray(int[] array) {
        boolean[] newArray = new boolean[array.length];
        int count = 0;
        for (int element : array) {
            if (element % 2 != 0) newArray[count] = true;
            count++;
        }
        return newArray;
    }

    public static int dateOfBirthCheck(String date) {
        LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yy"));
        if(LocalDate.now().getDayOfYear() - date1.getDayOfYear() >= 0)
            return LocalDate.now().getDayOfYear();
        return LocalDate.now().getYear() - date1.getYear()-1;


    }


}
