 import MyStack.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private MyStack stack;

    @BeforeEach
    public void checkThisFirst() {
        stack = new MyStack(3);
    }

    @Test
    public void newStackIsEmptyTest() {
        stack = new MyStack(3);
        assertTrue(stack.isEmpty());
        assertEquals(0,stack.count());


    }

    @Test
    public void addX_MyStackIsNot_EmptyTest() {
        stack = new MyStack(3);
        stack.push(4);
        assertFalse(stack.isEmpty());
        assertEquals(1,stack.count());

    }
    @Test
    public void addDuplicate_DoesNotAddTest(){
        stack.push(4);
        stack.push(4);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.count());
    }

    @Test
    public void X_Remove_myStackIsEmptyTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        assertFalse(stack.isEmpty());
        assertEquals(2,stack.count());

    }


    @Test
    public void peekFromTheStackTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());


    }
    @Test
    public void countElementsInStackTest(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.count());
    }
    @Test
    public void addAndRemoveDuplicateTest(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.pop();
        assertEquals(2,stack.count());

    }
    @Test
    public void clearStackTest(){
        stack.push(1);
        stack.push(2);
        stack.clear();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.count());
    }
    @Test
    public void stackCapacityTest(){
        assertEquals(3, stack.capacity());
    }
    @Test
    public void searchElementInStackTest(){
        stack.push(1);
        stack.push(2);
        assertTrue(stack.contains(1));
        assertFalse(stack.contains(3));
    }
    @Test
    public void clearEmptyStackTest() {
        stack.clear();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.count());
    }
    @Test
    public void peekFromEmptyStackTest() {
        assertEquals(0, stack.peek());
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.count());
    }
    @Test
    public void pushToFullStackTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertFalse(stack.isEmpty());
        assertEquals(3, stack.count());
    }
    @Test
    public void stackCapacityAfterPushTest() {
        stack.push(1);
        stack.push(2);
        assertEquals(3, stack.capacity());
    }

}
