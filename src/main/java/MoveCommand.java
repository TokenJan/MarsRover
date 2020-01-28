/**
 * @author jiahuan.yang
 */
public class MoveCommand implements Command {

    @Override
    public RoverStatus execute(RoverStatus status) {
        switch (status.getDirection()) {
            case EAST:
                return new RoverStatus(status.getX() + 1, status.getY(), status.getDirection());
            case SOUTH:
                return new RoverStatus(status.getX(), status.getY() - 1, status.getDirection());
            case WEST:
                return new RoverStatus(status.getX() - 1, status.getY(), status.getDirection());
            case NORTH:
                return new RoverStatus(status.getX(), status.getY() + 1, status.getDirection());
            default:
                return status;
        }
    }
}
