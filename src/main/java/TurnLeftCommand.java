/**
 * @author jiahuan.yang
 */
public class TurnLeftCommand implements Command {
    @Override
    public RoverStatus execute(RoverStatus status) {
        return new RoverStatus(status.getX(), status.getY(), status.getDirection().left());
    }
}
