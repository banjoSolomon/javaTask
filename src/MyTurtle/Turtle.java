package MyTurtle;

import static MyTurtle.Direction.EAST;
import static MyTurtle.Direction.NORTH;

public class Turtle {
    private boolean penIsUp = true;
    private Direction currentDirection = EAST;

    public boolean isPenUp() {
        return penIsUp;
    }

    public void penIsDown() {
        penIsUp = false;

    }

    public Direction getCurrentDirection() {
        return currentDirection;

    }


    public void turnLeft() {
        if (currentDirection == NORTH) currentDirection = Direction.SOUTH;
        if (currentDirection == EAST) currentDirection = Direction.NORTH;
    }

    public void turnRight() {
        if (currentDirection == EAST) currentDirection = Direction.WEST;


    }
}
