public class RoverStatus {
    private String x;

    private String y;

    private Direction direction;

    public RoverStatus(String x, String y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}