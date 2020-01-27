/**
 * @author jiahuan.yang
 */
public class TurnRightCommand implements Command {

    private static final String RIGHT = "R";


    @Override
    public RoverStatus execute(RoverStatus status) {
        Direction direction = status.getDirection();
        direction = direction.getNext();
        status.setDirection(direction);
        return status;
    }
}
