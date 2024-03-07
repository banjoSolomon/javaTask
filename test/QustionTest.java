import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QustionTest {
    @Test
    public void testThatTwo_NumbersCanAdd(){
        int result = Qustion.addNumbers(3,5);
        assertEquals(8,result);


    }

    @Test
    public void testThatTwoNumbers_CanSubtract(){
        int result = Qustion.subtractNumbers(6,4);
        assertEquals(2,result);
    }
    @Test
    public void testThatTwoNumbers_CanMultiply(){
        int result = Qustion.multiplyNumber(7,5);
        assertEquals(35,result);
    }

    @Test
    public void testThat_TotalArray(){
        int[] numbers = {2,3,4,5};
        int result = Qustion.addArray(numbers);
        assertEquals(14,result);

    }
    @Test
    public void testThat_WeCan_Multiply_Array(){
        int[] numbers = {7,5};
        int result = Qustion.multiplyArray(numbers);
        assertEquals(35,result);

    }
    @Test
    public void testSubtract_ElementIn_Array(){
        int[] array = {4,6,7,2,5};
        int result = Qustion.subtractArray(array);
        assertEquals(-16,result);
    }
    @Test
    public void testArrayAndReturn_AnArrayOfOnesAndZerosWere_EvenNumberAre_ReplaceWithZero_AndOddNumberWithOne(){
       int []array = {4,5,8,8,8,2,9};
        boolean[] result = {false, true, false, false, false, false, true};
        assertArrayEquals(result,Qustion.evenAndOddArray(array));
    }

    @Test
    public void testDateOfBirth(){

      //  assertEquals(1,Qustion.dateOfBirthCheck(12/12/2022));
    }

}
