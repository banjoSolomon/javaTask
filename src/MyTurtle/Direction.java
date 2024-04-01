package MyTurtle;

public enum Direction {
    NORTH("EAST", "WEST"),
    SOUTH("WEST", "EAST"),
    EAST("SOUTH", "NORTH"),
    WEST("NORTH", "SOUTH");

    private String right;
    private String left;

    Direction(String right, String left) {
        this.left = left;
        this.right = right;
    }

    public Direction turnLeft() {
        return Direction.valueOf(left);

    }

}

