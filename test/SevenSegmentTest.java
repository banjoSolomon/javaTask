import Bank.SevenSegment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SevenSegmentTest {
    @Test
    public void testFillA() {
        SevenSegment.fillA();
        assertEquals(1, SevenSegment.segment[0][0]);
        assertEquals(1, SevenSegment.segment[0][1]);
        assertEquals(1, SevenSegment.segment[0][2]);
        assertEquals(1, SevenSegment.segment[0][3]);
    }


    @Test
    public void testDisplay() {

        SevenSegment.segment = new int[][]{
                {1, 1, 1, 1},
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {0, 0, 0, 0},
                {1, 1, 1, 1}
        };
        SevenSegment.display();

    }

    @Test
    public void testInputValue() {
        SevenSegment.inputValue("1110000");

        assertEquals(1, SevenSegment.segment[0][0]);
        assertEquals(1, SevenSegment.segment[0][1]);
        assertEquals(1, SevenSegment.segment[0][2]);
        assertEquals(1, SevenSegment.segment[0][3]);
        assertEquals(1, SevenSegment.segment[0][3]);
        assertEquals(1, SevenSegment.segment[1][3]);
        assertEquals(1, SevenSegment.segment[2][3]);

        assertEquals(0, SevenSegment.segment[3][0]);
        assertEquals(0, SevenSegment.segment[3][1]);
        assertEquals(0, SevenSegment.segment[3][2]);
        //assertEquals(0,  SevenSegment.segment[3][3]);
    }
}

