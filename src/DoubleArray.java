import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 5, 13};
        System.out.print(Arrays.toString(array(inputArray)));
    }
    public static int[]  array(int[] inputArray){
        int [] outputArray = doubleArraylength(inputArray);
        for(int index = 0; index < inputArray.length; index++){
            outputArray[index] = inputArray[index];
            outputArray[index+ inputArray.length] = inputArray[index]*2;

        }
            return outputArray;
    }

    public static int[] doubleArraylength(int[] inputArray) {
      int [] myArray = new int [inputArray.length *2];
        return myArray;

}

}
