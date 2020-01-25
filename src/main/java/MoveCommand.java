/**
 * @author jiahuan.yang
 */
public class MoveCommand implements Command {

    private static final String forward = "M";

    private String instruction;

    private int count;

    public MoveCommand(String instruction, int count) {
        this.instruction = instruction;
        this.count = count;
    }

    @Override
    public RoverStatus execute(RoverStatus status) {
        if (forward.equals(instruction)) {
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
        }
        return status;
    }
}
