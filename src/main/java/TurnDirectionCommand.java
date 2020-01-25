public class TurnDirectionCommand implements Command {

    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private String instruction;

    public TurnDirectionCommand(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public RoverStatus execute(RoverStatus status) {
        Direction direction = status.getDirection();
        switch (instruction) {
            case LEFT:
                direction = direction.getPrevious();
                break;
            case RIGHT:
                direction = direction.getNext();
                break;
            default:
                break;
        }
        status.setDirection(direction);
        return status;
    }
}
