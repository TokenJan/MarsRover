/**
 * @author jiahuan.yang
 */
public class TurnLeftCommand implements Command {

    private static final String LEFT = "L";

    @Override
    public RoverStatus execute(RoverStatus status) {
        Direction direction = status.getDirection();
        direction = direction.getPrevious();
        status.setDirection(direction);
        return status;
    }
}
