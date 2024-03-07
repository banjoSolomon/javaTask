//public class FireDrillTwo
import java.util.*;
    public class TaskOne {
        public static void taskOnes(int number1,int number2,int number3,int number4,int number5,int number6,int number7,int number8,int number9,int number10) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your score: ");
            int score = input.nextInt();
            int[] newArray = new int[10];
            for (int index = 0; index < newArray.length; index++) {
                newArray[index] += score;
            }

        }


        public void taskTwo() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your score: ");
            int score = input.nextInt();
            int[] newArray = new int[10];
            for (int index = 0; index < newArray.length; index++) {
                newArray[index] += score;

            }
            System.out.println("Numbers of Scores is" + newArray);
        }


        public void taskThree() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your score: ");
            int score = input.nextInt();
            int[] newArray = new int[10];
            for (int index = 0; index < newArray.length; index++) {
                newArray[index] += score;

            }
            System.out.print("Numbers of Scores is" + newArray);
        }

        public void taskFour() {
            int[] list = {2, 5, 16, 18, 21};
            System.out.println("The even index of array: ");
            for (int i = 0; i < list.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(list[i] + " ");
                }

            }
        }


        public static int[] taskFive(int[] inputArray) {
            int[] resultArray = new int[(inputArray.length) / 2];
            for (int i = 1, j = 0; i < inputArray.length; i += 2, j++) {
                resultArray[j] = inputArray[i];
            }
            return resultArray;
        }


        public void taskSix() {
            int[] list = {2, 5, 16, 18, 21};
            int sum = 0;
            System.out.println("The even index of array: ");
            for (int i = 0; i < list.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(list[i] + " ");
                }
                sum += list[i];
            }
        }


        public static int[] taskSeven(int[] inputArray) {
            int[] resultArray = new int[(inputArray.length) / 2];
            int sum = 0;
            for (int i = 1, j = 0; i < inputArray.length; i += 2, j++) {
                resultArray[j] = inputArray[i];
                sum += resultArray[j];
            }
            return resultArray;
        }


        public void taskEight() {
            int[] list = {2, 5, 16, 18, 21};
            System.out.println("The even index of array: ");
            int minimum = 0;
            for (int i = 0; i < list.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(list[i] + " ");
                }
                if (list[i] > minimum)
                    minimum = list[i];
            }
        }


        public static int[] taskNine(int[] inputArray) {
            int[] resultArray = new int[(inputArray.length) / 2];
            int minimum = 0;
            for (int i = 1, j = 0; i < inputArray.length; i += 2, j++) {
                resultArray[j] = inputArray[i];
                if (resultArray[i] > minimum)
                    minimum = resultArray[i];
            }
            return resultArray;
        }
    }