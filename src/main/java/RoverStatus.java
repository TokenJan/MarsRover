/**
 * @author jiahuan.yang
 */
public class RoverStatus {

    private Long x;

    private Long y;

    private Direction direction;

    public RoverStatus(Long x, Long y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Long getX() {
        return x;
    }

    public Long getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}
