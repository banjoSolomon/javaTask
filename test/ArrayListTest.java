import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayListTest {
    private MyArrayList strings;

    @BeforeEach

   public void checkThisFirst(){

        strings = new MyArrayList();
   }

    @Test
    public void testNewArrayList_IsEmptyTest(){
        assertTrue(strings.isEmpty());

    }
    @Test
    public void testAddNew_ElementToAList_ListIsNotEmpty(){
        assertTrue(strings.isEmpty());
        strings.add("G-String");
        assertFalse(strings.isEmpty());

    }

    @Test
    public void addNewElement_RemoveElement_ListIsEmpty(){
        assertTrue(strings.isEmpty());
        strings.add("Solomon");
        strings.add("Sam");
        strings.add("G-String");
        assertFalse(strings.isEmpty());
        strings.remove();
        strings.remove();
        assertFalse(strings.isEmpty());


    }
    @Test
    public void removeElement_FromAnEmptyListThrowExceptionOutOfBound(){
    assertTrue(strings.isEmpty());
    assertThrows(ArrayIndexOutOfBoundsException.class,() ->strings.remove());

    }
    @Test
    public void testWhenOneElementIsAddedGet_IndexReturnElement(){
        assertTrue(strings.isEmpty());
        strings.add("Solomon");
        assertFalse(strings.isEmpty());
        assertEquals("Solomon", strings.get(1));
    }
    @Test
    public void testThatTwoElementAreAdded_getTwoIndex_returnTheElements(){
        assertTrue(strings.isEmpty());
        strings.add("G-String");
        strings.add("Solomon");
        assertEquals(2,strings.get("Solomon"));

    }
}
