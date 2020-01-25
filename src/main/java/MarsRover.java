import java.util.List;

/**
 * @author jiahuan.yang
 */
public class MarsRover {

    private RoverStatus status;

    public void execute(List<Command> commands) {
        commands.forEach(this::execute);
    }

    private void execute(Command command) {
        this.status = command.execute(this.status);
    }

    public RoverStatus getStatus() {
        return status;
    }
}
