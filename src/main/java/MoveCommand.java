/**
 * @author jiahuan.yang
 */
public class MoveCommand implements Command {

    private static final String forward = "M";

    private int count;

    public MoveCommand(int count) {
        this.count = count;
    }

    @Override
    public RoverStatus execute(RoverStatus status) {
        switch (status.getDirection()) {
            case EAST:
                status.setX(status.getX() + count);
                break;
            case SOUTH:
                status.setY(status.getY() - count);
                break;
            case WEST:
                status.setX(status.getX() - count);
                break;
            case NORTH:
                status.setY(status.getY() + count);
                break;
            default:
                break;
        }
        return status;
    }
}
