public enum Direction {

    NORTH("N"),
    SOUTH("S"),
    WEST("W"),
    EAST("E");

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}