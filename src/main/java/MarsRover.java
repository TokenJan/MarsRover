import java.util.Arrays;

/**
 * @author jiahuan.yang
 */
public class MarsRover {

    private RoverStatus roverStatus;

    public void initialize(String instruction) {
        String[] initCommand = instruction.split(" ");
        Long x = Long.parseLong(initCommand[0]);
        Long y = Long.parseLong(initCommand[1]);
        Direction direction = Direction.getByAbbrev(initCommand[2]);
        this.roverStatus = new RoverStatus(x, y, direction);
    }

    public void execute(String instruction) {
        String[] moveCommand = instruction.split(" ");
        Arrays.stream(moveCommand).forEach(cmd -> {
            if ("R".equals(cmd)) {this.execute(new TurnRightCommand());}
            if ("L".equals(cmd)) {this.execute(new TurnLeftCommand());}
        });
    }

    private void execute(Command command) {
        this.roverStatus = command.execute(this.roverStatus);
    }

    public RoverStatus report() {
        return roverStatus;
    }
}
