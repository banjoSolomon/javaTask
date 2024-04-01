import MyTurtle.Direction;
import MyTurtle.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    public void setup() {
        turtle = new Turtle();
    }

    @Test
    public void testPenIsUp() {
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void testTurtleCanMovePenDown() {
        assertTrue(turtle.isPenUp());
        turtle.penIsDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void testTurtleHasADirection() {
        assertTrue(turtle.isPenUp());
        turtle.penIsDown();
        assertFalse(turtle.isPenUp());
        assertSame(Direction.EAST, turtle.getCurrentDirection());

    }

    @Test
    public void testTurtleTurnLeft() {
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());

    }

    @Test
    public void testTurtleCanTurnLeftTwice() {
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.SOUTH, turtle.getCurrentDirection());

    }

    @Test
    public void testTurtleCanTurnRight() {
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getCurrentDirection());

    }

    @Test
    public void testTurtleCanTurnRightAndTurnLeft() {
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.getCurrentDirection());

    }

}
