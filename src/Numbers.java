public class Numbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 2};
        int[] result = new int[]{numbers.length};
        int numberOfCount = 0;
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] == numbers[numberOfCount]) count += 1;


        }

    }
}
